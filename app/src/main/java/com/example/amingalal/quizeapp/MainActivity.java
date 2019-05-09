package com.example.amingalal.quizeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Create items
    RadioButton rb1Q1, rb2Q1, rb3Q1, rb4Q1, rb1Q2, rb2Q2, rb3Q2, rb4Q2, rb1Q3, rb2Q3, rb3Q3, rb4Q3,
            rb1Q4, rb2Q4, rb3Q4, rb4Q4, rb1Q5, rb2Q5, rb3Q5, rb4Q5, rb1Q6, rb2Q6, rb3Q6, rb4Q6,
            rb1Q7, rb2Q7, rb3Q7, rb4Q7, rb1Q8, rb2Q8, rb3Q8, rb4Q8, rb1Q9, rb2Q9, rb3Q9, rb4Q9,
            rb1Q10, rb2Q10, rb3Q10, rb4Q10;
    Button btnOk, btnExit;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Concoction xml items with java items
        rb1Q1 = findViewById(R.id.rb1Q1);
        rb3Q2 = findViewById(R.id.rb3Q2);
        rb2Q3 = findViewById(R.id.rb2Q3);
        rb4Q4 = findViewById(R.id.rb4Q4);
        rb4Q5 = findViewById(R.id.rb4Q5);
        rb2Q6 = findViewById(R.id.rb2Q6);
        rb3Q7 = findViewById(R.id.rb3Q7);
        rb1Q8 = findViewById(R.id.rb1Q8);
        rb1Q9 = findViewById(R.id.rb1Q9);
        rb2Q10 = findViewById(R.id.rb2Q10);

        btnOk = findViewById(R.id.btnOk);
        btnExit = findViewById(R.id.btnExit);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb1Q1.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb3Q2.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb2Q3.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb4Q4.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb4Q5.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb2Q10.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb2Q6.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb3Q7.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb1Q8.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }
                if (rb1Q9.isChecked()) {
                    i++;
                } else {
                    //don't do anything
                }

                Toast toast = Toast.makeText(getApplicationContext(), "your score is " + i+"\nBy :Amin Jalal", Toast.LENGTH_LONG);
                toast.show();

                i = 0;
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //function to exit
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }

}
