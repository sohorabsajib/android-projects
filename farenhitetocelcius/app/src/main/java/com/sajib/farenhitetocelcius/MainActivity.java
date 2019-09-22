package com.sajib.farenhitetocelcius;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText amountET;
    private Button convertBtn;
    private TextView resultTV;
    private ImageView IM1,IM2,IM4;
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amountET=findViewById(R.id.amountET);
        convertBtn=findViewById(R.id.convertBtn);
        resultTV=findViewById(R.id.resultTV);
        IM1=findViewById(R.id.IM1);
        IM2=findViewById(R.id.IM2);
        IM4=findViewById(R.id.IM4);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=amountET.getText().toString();
                if(amount.equals("")) {
                    Toast.makeText(MainActivity.this,"input amount",Toast.LENGTH_LONG).show();
                }else {
                    double totalamount = Double.valueOf(amount);
                    double result = (totalamount - 32)*5/9;
                    if(result<=30 ){
                        IM1.setVisibility(View.VISIBLE);
                    }
                    else if(result>30 && result <=100){
                        IM2.setVisibility(View.VISIBLE);
                    }
                    else  {
                        IM4.setVisibility(View.VISIBLE);
                    }
                    resultTV.setText(String.valueOf(result));


                }


            }
        });
    }


}
