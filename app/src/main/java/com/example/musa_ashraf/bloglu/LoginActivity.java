package com.example.musa_ashraf.bloglu;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {
    private EditText mLoginEmail;
    private EditText mLoginPassword;
    private TextView forgot_password;
    private Button mLogin_btn;
    private Toolbar mToolbar;
    private ProgressDialog mProgress;
    //private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*mProgress = new ProgressDialog(this);
        mAuth = FirebaseAuth.getInstance();


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Login");

        mLoginEmail = findViewById(R.id.login_email);
        mLoginPassword = findViewById(R.id.login_password);
        forgot_password = findViewById(R.id.forgot_password);
        mLogin_btn = findViewById(R.id.login_user);

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ResetpasswordActivity.class));
            }
        });

        mLogin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mLoginEmail.getText().toString();
                String password = mLoginPassword.getText().toString();

                if (!TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)){
                    mProgress.setTitle("Loggin In");
                    mProgress.setMessage("Please wait while we check your credential.");
                    mProgress.setCanceledOnTouchOutside(false);

                    loginUser(email,password);
                }
            }
        });
    }

    private void loginUser(String email, String password) {
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    mProgress.dismiss();
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                } else {
                    mProgress.hide();
                    Toast.makeText(LoginActivity.this, "Cannot Sign in, Please check the form and try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/
    }
}
