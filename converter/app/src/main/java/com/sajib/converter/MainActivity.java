package com.sajib.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {
    private EditText amountET;
    private RadioButton dollarToTakaRB;
    private RadioButton takaToDollarRB;
    private Button convertBTN;
    private TextView resultTV;
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountET=findViewById(R.id.amountET);
        dollarToTakaRB=findViewById(R.id.dollartotakaRB);
        takaToDollarRB=findViewById(R.id.takaToDollarRB);
        convertBTN=findViewById(R.id.convertBTN);
        resultTV=findViewById(R.id.resultTV);
        convertBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=amountET.getText().toString();

                if(amount.equals("")){
                    Toast.makeText(MainActivity.this,"pls entr number", Toast.LENGTH_LONG).show();
                }
                else {
                    if(dollarToTakaRB.isChecked()){
                        double totalamount = Double.valueOf(amount);
                        double result = totalamount*80;
                        resultTV.setText(String.valueOf(result));
                    }
                    else {
                        double totalamount = Double.valueOf(amount);
                        double result = totalamount/80;
                        resultTV.setText(String.valueOf(result));
                    }
                }
            }
        });




    }
}
