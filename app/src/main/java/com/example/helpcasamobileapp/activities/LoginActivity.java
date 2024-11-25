package com.example.helpcasamobileapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.helpcasamobileapp.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.*;

public class LoginActivity extends AppCompatActivity {

    private TextView inscrireTV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FirebaseApp.initializeApp(LoginActivity.this);
        FirebaseFirestore db = FirebaseFirestore.getInstance() ;
        inscrireTV = findViewById(R.id.inscrireTV);
        inscrireTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.collection("/Clients").add(new CLIENTS("Oussama","Ben Hmida"));
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }
}