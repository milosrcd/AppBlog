package com.example.milos.appblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button btnLog;
    private TextView wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        btnLog = (Button) findViewById(R.id.btnLog);
        wrong = (TextView) findViewById(R.id.wrong);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){
            if((userName.equals("candidate@creitive.com"))&&(userPassword.equals("1234567"))){
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }else{
                wrong.setText("Wrong Username or Password, try again");
            }

    }
}
