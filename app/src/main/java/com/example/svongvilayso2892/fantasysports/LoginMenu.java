package com.example.svongvilayso2892.fantasysports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginMenu extends AppCompatActivity {

    private EditText editUsername;
    private EditText editPassword;
    private Button btnLogIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);


        editUsername = (EditText) findViewById(R.id.editRUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnLogIn = (Button) findViewById(R.id.btnLogIn);

        btnSignUp = (Button) findViewById(R.id.btnSignUp);




                //set SignUp navigation
                btnSignUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(LoginMenu.this, Register.class);
                        startActivity(intent);
                    }
                });




    }

}
