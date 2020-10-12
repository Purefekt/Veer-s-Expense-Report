package co.singhveer.veersexpensereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_0_password extends AppCompatActivity {

    private Button button;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_page_0_password);

        pass = findViewById(R.id.password);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_page_expenses();
            }
        });
    }

    public void open_page_expenses () {
        if(pass.getText().toString().equals("babyron")){
            Intent intent = new Intent(this, page_1_expenses.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getBaseContext(), "Wrong password", Toast.LENGTH_SHORT).show();
        }
    }
}