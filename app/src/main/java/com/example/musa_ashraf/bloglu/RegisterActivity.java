package com.example.musa_ashraf.bloglu;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private EditText mDisplayName;
    private EditText mEmail;
    private EditText mPassword;
    private Button mCreateBtn;
    private Toolbar mToolbar;
    private ProgressDialog mRegProgress;

    //private FirebaseAuth mAuth;
    //private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        /*mRegProgress = new ProgressDialog(this);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Create Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        mAuth = FirebaseAuth.getInstance();


        mDisplayName = findViewById(R.id.reg_display_name);
        mEmail = findViewById(R.id.reg_email);
        mPassword = findViewById(R.id.reg_password);
        mCreateBtn = findViewById(R.id.reg_create_btn);

        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display_name = mDisplayName.getText().toString();
                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();
                if (TextUtils.isEmpty(display_name)|| TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(RegisterActivity.this, "All fields are Required", Toast.LENGTH_SHORT).show();


                }
                else if (password.length()<6){
                    Toast.makeText(RegisterActivity.this, "Password Should be 6 Char", Toast.LENGTH_SHORT).show();

                }
                else{
                    mRegProgress.setTitle("Register User");
                    mRegProgress.setMessage("Please wait we create your account !");
                    mRegProgress.setCanceledOnTouchOutside(false);
                    mRegProgress.show();
                    register_user(display_name,email,password);
                }

            }
        });
    }

    private void register_user(final String display_name, String email, String password) {
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    FirebaseUser current_user = FirebaseAuth.getInstance().getCurrentUser();
                    String uid = current_user.getUid();
                    mDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child(uid);
                    HashMap<String,String> userMap = new HashMap<>();
                    userMap.put("name", display_name);
                    //userMap.put("status","Hi there I'm using chat App");
                    userMap.put("imageURL","default");
                    userMap.put("search",display_name.toLowerCase());
                    userMap.put("id",uid);

                    mDatabase.setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                mRegProgress.dismiss();
                                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                finish();
                            }
                        }
                    });

                }
                else {
                    mRegProgress.hide();
                    Toast.makeText(RegisterActivity.this, "Cannot Sign in. Please check the form and try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/
    }
}
