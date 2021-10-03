package com.example.loancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText loanAmount, interestRate, loanTerm, loanFees, minPayment;
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
        minPayment = (EditText) findViewById(R.id.minPayment);
        calculate = (Button) findViewById(R.id.calculateButton);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double principle = Double.parseDouble(loanAmount.getText().toString());
                double interest = Double.parseDouble(interestRate.getText().toString()) / 100;
                double terms = Double.parseDouble(loanTerm.getText().toString())*12;
                double fees = Double.parseDouble(loanFees.getText().toString());
                double min = 0.00;
                min = Double.parseDouble(minPayment.getText().toString());
                double paymnt = 0;

                int total = (int) (principle * (Math.pow((1 + (interest/12)), terms)) + fees);
                paymnt = Double.valueOf(total/terms);
                if((total/terms)<min){
                    terms = total/min;
                    paymnt = min;
                }

                Toast.makeText(getApplicationContext(),
                        "Total: $" + String.valueOf(total) + ".00\n" +"Payment: $" + String.valueOf(paymnt) +"/month for "+ (int)terms + " months",
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}