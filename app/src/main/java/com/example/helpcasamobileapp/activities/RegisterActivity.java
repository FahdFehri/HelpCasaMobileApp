package com.example.helpcasamobileapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import com.example.helpcasamobileapp.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    //private Button btnInscriClient,btnInscriAgent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        /*btnInscriClient=*/
        findViewById(R.id.InscriEnTantQueClient).setOnClickListener(this);
        /*btnInscriAgent=*/
        findViewById(R.id.InscriEnTantQueClient).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.InscriEnTantQueClient){
            startActivity(new Intent(RegisterActivity.this,ClientRegisterActivity.class));
        }else {startActivity(new Intent(RegisterActivity.this,AgentRegisterActivity.class));}
    }
}