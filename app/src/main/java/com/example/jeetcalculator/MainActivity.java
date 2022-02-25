package com.example.jeetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button add,sub,multi,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAnswer);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSubtrack);
        multi = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue + secondvalue;
                tvAns.setText("Ans is = "+ans);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue - secondvalue;
                tvAns.setText("Ans is = "+ans);

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue * secondvalue;
                tvAns.setText("Ans is = "+ans);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue,ans;

                firstvalue = Integer.parseInt(etFirstValue.getText().toString());
                secondvalue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstvalue / secondvalue;
                tvAns.setText("Ans is = "+ans);

            }
        });


    }
}