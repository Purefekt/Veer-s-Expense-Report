package co.singhveer.veersexpensereport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_1_expenses extends AppCompatActivity {

    private Button button_proof_3;
    private Button button_proof_4;
    private Button button_proof_5;
    private Button button_proof_6;
    private Button button_proof_7;
    private Button button_proof_8;
    private Button button_proof_9;
    private Button button_proof_10;
    private Button button_proof_11;
    private Button button_proof_12;
    private Button button_breakdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.page_1_expenses);

        button_proof_3 = (Button) findViewById(R.id.button_proof_3);
        button_proof_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_3();
            }
        });

        button_proof_4 = (Button) findViewById(R.id.button_proof_4);
        button_proof_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_4();
            }
        });

        button_proof_5 = (Button) findViewById(R.id.button_proof_5);
        button_proof_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_5();
            }
        });

        button_proof_6 = (Button) findViewById(R.id.button_proof_6);
        button_proof_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_6();
            }
        });

        button_proof_7 = (Button) findViewById(R.id.button_proof_7);
        button_proof_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_7();
            }
        });

        button_proof_8 = (Button) findViewById(R.id.button_proof_8);
        button_proof_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_8();
            }
        });

        button_proof_9 = (Button) findViewById(R.id.button_proof_9);
        button_proof_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_9();
            }
        });

        button_proof_10 = (Button) findViewById(R.id.button_proof_10);
        button_proof_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_10();
            }
        });

        button_proof_11 = (Button) findViewById(R.id.button_proof_11);
        button_proof_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_11();
            }
        });

        button_proof_12 = (Button) findViewById(R.id.button_proof_12);
        button_proof_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_activity_proof_12();
            }
        });

        button_breakdown = (Button) findViewById(R.id.button_breakdown);
        button_breakdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_page_2_breakdown();
            }
        });
    }
    public void open_activity_proof_3(){
        Intent open_activity_proof_3 = new Intent(this, Proof_3_Electricity.class);
        startActivity(open_activity_proof_3);
    }

    public void open_activity_proof_4(){
        Intent open_activity_proof_4 = new Intent(this, Proof_4_Gas.class);
        startActivity(open_activity_proof_4);
    }

    public void open_activity_proof_5(){
        Intent open_activity_proof_5 = new Intent(this, Proof_5_Water.class);
        startActivity(open_activity_proof_5);
    }

    public void open_activity_proof_6(){
        Intent open_activity_proof_6 = new Intent(this, Proof_6_SIM.class);
        startActivity(open_activity_proof_6);
    }

    public void open_activity_proof_7(){
        Intent open_activity_proof_7 = new Intent(this, Proof_7_Internet.class);
        startActivity(open_activity_proof_7);
    }

    public void open_activity_proof_8(){
        Intent open_activity_proof_8 = new Intent(this, Proof_8_Protien_Shake.class);
        startActivity(open_activity_proof_8);
    }

    public void open_activity_proof_9(){
        Intent open_activity_proof_9 = new Intent(this, Proof_9_Travel_Pass.class);
        startActivity(open_activity_proof_9);
    }

    public void open_activity_proof_10(){
        Intent open_activity_proof_10 = new Intent(this, Proof_10_Gym.class);
        startActivity(open_activity_proof_10);
    }

    public void open_activity_proof_11(){
        Intent open_activity_proof_11 = new Intent(this, Proof_11_Haircut.class);
        startActivity(open_activity_proof_11);
    }

    public void open_activity_proof_12(){
        Intent open_activity_proof_12 = new Intent(this, Proof_12_Groceries.class);
        startActivity(open_activity_proof_12);
    }

    public void open_page_2_breakdown(){
        Intent open_page_2_breakdown = new Intent(this, page_2_breakdown.class);
        startActivity(open_page_2_breakdown);
    }
}