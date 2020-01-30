package com.example.acrproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {
    TextView greeting;
    Button back;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        greeting=findViewById(R.id.tv1);
        back=findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mFirebaseAuth.getInstance().signOut();
            Intent intent= new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent);
            }
        });
    }
}
