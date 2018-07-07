package com.weightogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    private SharedPreference sharedPreference;
    private static EditText username;
    private static EditText password;
    private static Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        //sharedPreference = new SharedPreference(getApplicationContext());

//        if(sharedPreference.readLoginStatus()){
//            Intent intent = new Intent(loginActivity.this, MainActivity.class);
//            startActivity(intent);
//        }

        loginButton();
    }

    public void loginButton() {
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);

//        String usn = username.getText().toString();
//        String pw = password.getText().toString();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(getResources().getString(R.string.username_text)) &&
                        password.getText().toString().equals(getResources().getString(R.string.password_text))) {
                    Toast.makeText(loginActivity.this, "Username and password is correct",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(loginActivity.this, MainActivity.class);
                    startActivity(intent);
                    //sharedPreference.writeLoginStatus(true);
                } else {
                    Toast.makeText(loginActivity.this, "Username and password is NOT correct",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
