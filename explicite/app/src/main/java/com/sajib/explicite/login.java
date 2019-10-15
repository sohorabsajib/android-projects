package com.sajib.explicite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private ImageView sakibIv,mushfiqIv,tamimIv,muztafizIv;
    private TextView sakibTv,tamimTv,mushfiqTv,muztafizTv;
    private String sakib,tamim,mushfiq,muztafiz;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        sakibIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sakib = sakibTv.getText().toString();
                Intent intent = new Intent(login.this,MainActivity.class);
                intent.putExtra("sakib",sakib);
                startActivity(intent);

            }
        });

        

        
    }

    private void init() {
        sakibIv=findViewById(R.id.sakibIv);
        mushfiqIv=findViewById(R.id.mushfiqIv);
        tamimIv=findViewById(R.id.tamimIv);
        muztafizIv=findViewById(R.id.muztafizIv);


    }
}
