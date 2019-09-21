package com.sajib.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstnameET,lastnameET,emailET,passwordfET;
    private AutoCompleteTextView bloodgroupACTV;
    private CheckBox checkBoxCB;
    private Button signupBtn;
    private String [] bloodgroup ={"A+","B+","AB+","O+","A-","B-","AB-","O-"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ArrayAdapter adapter =new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,bloodgroup);
        bloodgroupACTV.setAdapter(adapter);
        bloodgroupACTV.setThreshold(1);
        checkBoxCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                if(check==true){
                    signupBtn.setVisibility(View.VISIBLE);
                    signupBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String firstname =firstnameET.getText().toString();
                            String lastname =lastnameET.getText().toString();
                            String email=emailET.getText().toString();
                            String password=passwordfET.getText().toString();

                            if(firstname.isEmpty()||lastname.isEmpty()||password.isEmpty()||email.isEmpty()){
                                Toast.makeText(MainActivity.this,"Enter correctly",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
                else {
                    signupBtn.setVisibility(View.GONE);
                }
            }
        });
    }

    private void init() {
        firstnameET=findViewById(R.id.firstnameET);
        lastnameET=findViewById(R.id.lastnameET);
        emailET=findViewById(R.id.emailET);
        passwordfET=findViewById(R.id.passwordET);
        bloodgroupACTV=findViewById(R.id.bloodgroupACTV);
        checkBoxCB=findViewById(R.id.checkboxCB);
        signupBtn=findViewById(R.id.signupBtn);

    }


}
