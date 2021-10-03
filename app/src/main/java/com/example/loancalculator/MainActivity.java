package com.example.loancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText loanamount, interestrate, loanterm, loanfees;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        loanamount = (EditText) findViewById(R.id.loanAmount);
        interestrate = (EditText) findViewById(R.id.interestRate);
        loanterm = (EditText) findViewById(R.id.loanTerm);
        loanfees = (EditText) findViewById(R.id.loanFees);
//        calculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value1 = loanamount.getText().toString();
//                String value2 = interestrate.getText().toString();
//                String value3 = loanterm.getText().toString();
//                String value4 = null;
//                if (loanfees.getText().toString() != null) {
//
//                }
//            }
//        });
    }
}