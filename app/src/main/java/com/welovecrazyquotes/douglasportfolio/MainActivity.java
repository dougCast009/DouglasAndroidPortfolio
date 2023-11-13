package com.welovecrazyquotes.douglasportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project("Getting Started App", "Our very first project, the defaul 'Hello World app'!", R.drawable.getting_started),
                new Project("Vin Quote", "Our very first project, the defaul 'Hello World app'!", R.drawable.quote),
                new Project("BMI Calculator", "Our very first project, the defaul 'Hello World app'!", R.drawable.calculator),
                new Project("Inches Converter", "Our very first project, the defaul 'Hello World app'!", R.drawable.tape),
                new Project("The Hungry Developer", "Our very first project, the defaul 'Hello World app'!", R.drawable.hungry_developer)
        };

    }
}