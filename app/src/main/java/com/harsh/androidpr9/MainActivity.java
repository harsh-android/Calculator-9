package com.harsh.androidpr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n00,n0,input,plus,ans,ac;

    int num1,num2,sign;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        n00 = findViewById(R.id.n00);
        plus = findViewById(R.id.plus);
        ans = findViewById(R.id.ans);
        ac = findViewById(R.id.ac);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                num1 = num2 = 0;
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("1");

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("2");

            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("3");

            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("4");

            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("5");

            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("6");

            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("7");

            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("8");

            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("9");

            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("0");

            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setNumber("00");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = input.getText().toString();
                num1 = Integer.parseInt(num);
                input.setText("");
                sign = 1;
            }
        });

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = input.getText().toString();
                num2 = Integer.parseInt(num);

                switch (sign) {
                    case 1:
                        input.setText(""+(num1+num2));
                        break;
                    case 2:
                        input.setText(""+(num1-num2));
                        break;
                }

            }
        });
    }

    void setNumber(String n) {
        String num = input.getText().toString();
        input.setText(num+n);
    }

}