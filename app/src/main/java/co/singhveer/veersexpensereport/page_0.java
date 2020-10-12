package co.singhveer.veersexpensereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class page_0 extends AppCompatActivity {

    private long backPressedTime;

    private Button button_next_main;
    private Button button_about_author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.page_0);

        button_about_author = (Button) findViewById(R.id.button_about_author);
        button_about_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_about_author();
            }
        });

        button_next_main= (Button) findViewById(R.id.button_next_main);
        button_next_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_Page_1();
            }
        });

    }

    public void open_about_author(){
        Intent open_about_author = new Intent(this, AboutAuthor.class);
        startActivity(open_about_author);
    }

    public void open_Page_1(){
        Intent open_Page_1 = new Intent(this, page_0_password.class);
        startActivity(open_Page_1);
    }

    

    //Exit warning
    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }
        else{
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}