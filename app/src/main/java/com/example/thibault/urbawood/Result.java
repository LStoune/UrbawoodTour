package com.example.thibault.urbawood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

    }

    public void clickboutton1(View v){
        Intent salleA = new Intent (this, salleA.class);
        startActivity(salleA);
    }
    public void clickboutton2(View v){
        Intent salleB = new Intent (this, salleB.class);
        startActivity(salleB);
    }
}