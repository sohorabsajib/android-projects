package com.sajib.explicite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String sakib,mushfiq,tamim,muztafiz;
    private TextView dtailsTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sakib=getIntent().getStringExtra("sakib");
        dtailsTv=findViewById(R.id.dtailsTv);
        dtailsTv.setText(sakib);

    }
}
