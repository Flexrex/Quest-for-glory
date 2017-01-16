package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int theLevel = 0;
    private int theXP = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnQuests(View view)
    {
        Intent intent = new Intent(this, OnQuests.class);
        TextView level = (TextView) findViewById(R.id.level);
        theLevel++;
        level.setText("level" + theLevel);
        startActivity(intent);
    }
}
