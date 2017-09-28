package com.example.svongvilayso2892.fantasysports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button btnRegister;
    private EditText editRUsername;
    private EditText editRNewPassword;
    private EditText editConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = (Button) findViewById(R.id.btnRegister);
        editRUsername = (EditText) findViewById(R.id.editRUsername);
        editRNewPassword = (EditText) findViewById(R.id.editRNewPassword);
        editConfirmPassword = (EditText) findViewById(R.id.editConfirmPassword);

        btnRegister.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                if (editRUsername.getText().toString().length() == 0)
                {
                    editRUsername.setError("Enter a valid username");
                    return;
                }
                if (editRNewPassword.getText().toString().length() == 0)
                {
                    editRNewPassword.setError("Enter a valid new password");
                    return;
                }
                if (editConfirmPassword.getText().toString().length() == 0)
                {
                    editConfirmPassword.setError("Enter a valid confirm password");
                    return;
                }
                if (editRNewPassword.getText().toString().length() != editConfirmPassword.getText().toString().length()
                        || editConfirmPassword.getText().length() != editRNewPassword.getText().toString().length())
                {
                    editRNewPassword.setError("passwords do not match");
                    return;
                }
                else{
                    Intent newIntent = new Intent(Register.this, LoginMenu.class);
                    startActivity(newIntent);

                    Toast.makeText(getApplicationContext(), "Username Created", Toast.LENGTH_LONG).show();
                }
            }

        });


    }

}
