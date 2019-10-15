package com.sajib.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameET,ageET;
    private Button insertBtn;
    private String name,age;
    private SqliteDatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        insertData();
    }

    private void insertData() {
        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=nameET.getText().toString();
                age=ageET.getText().toString();
                long id = helper.insertValues(name,age);
                Toast.makeText(MainActivity.this, "your id"+id, Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void init() {
        nameET=findViewById(R.id.nameET);
        ageET=findViewById(R.id.ageET);
        insertBtn=findViewById(R.id.insertBtn);
        helper=new SqliteDatabaseHelper(this);
    }
}
