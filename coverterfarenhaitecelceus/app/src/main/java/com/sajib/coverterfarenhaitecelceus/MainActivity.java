package com.sajib.coverterfarenhaitecelceus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton celToFerRB,ferToCelRB;
    private EditText amountET;
    private TextView resultTV;
    private Button convertBtn;
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celToFerRB=findViewById(R.id.celciusToFerenhiteRB);
        ferToCelRB=findViewById(R.id.FerenhiteToCelciusRB);
        amountET=findViewById(R.id.amountET);
        resultTV=findViewById(R.id.resultTV);
        convertBtn=findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = amountET.getText().toString();
                if(amount.equals("")){
                    Toast.makeText(MainActivity.this,"input amount",Toast.LENGTH_LONG).show();
                }else {
                    if(celToFerRB.isChecked()){
                        double totalAmount=Double.valueOf(amount);
                        double  result = (totalAmount * 9 / 5) + 32 ;
                        resultTV.setText(String.valueOf(result));

                    }
                    else {
                        double totalAmount=Double.valueOf(amount);
                        double  result = (totalAmount - 32)*5/9; ;
                        resultTV.setText(String.valueOf(result));

                    }
                }



            }
        });
    }
}
