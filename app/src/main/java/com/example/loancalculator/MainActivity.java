package com.example.loancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText loanAmount, interestRate, loanTerm, loanFees;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        loanAmount = (EditText) findViewById(R.id.loanAmount);
        interestRate = (EditText) findViewById(R.id.interestRate);
        loanTerm = (EditText) findViewById(R.id.loanTerm);
        loanFees = (EditText) findViewById(R.id.loanFees);
        calculate = (Button) findViewById(R.id.calculateButton);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double principle = Double.parseDouble(loanAmount.getText().toString());
                double interest = Double.parseDouble(interestRate.getText().toString()) / 100;
                double terms = Double.parseDouble(loanTerm.getText().toString());
                double fees = Double.parseDouble(loanFees.getText().toString());
                int total = (int) (principle * (Math.pow((1 + (interest/12)), terms * 12)) + fees);

                Toast.makeText(getApplicationContext(),
                        "$" + String.valueOf(total) + ".00",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}