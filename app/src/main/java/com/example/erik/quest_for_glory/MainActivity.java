package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Settings(View view)
    {
        intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void Start(View view)
    {
        intent = new Intent(this, chCreate.class);
        startActivity(intent);
    }
}
