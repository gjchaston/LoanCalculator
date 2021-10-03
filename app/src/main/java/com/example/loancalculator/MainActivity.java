package com.example.loancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        loanamount = (EditText) findViewById(R.id.loan_amount);
        interestrate = (EditText) findViewById(R.id.interest_rate);
        loanterm = (EditText) findViewById(R.id.loan_term);
        loanfees = (EditText) findViewById(R.id.loan_fees);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View view) {
                String value1 = loanamount.getText().toString();
                String value2 = interestrate.getText().toString();
                String value3 = loanterm.getText().toString();
                String value4 = null;
                if (loanfees.getText().toString() != null) {

                }
            }
        });
    }
}