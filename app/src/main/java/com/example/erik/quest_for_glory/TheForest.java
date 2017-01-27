package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TheForest extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    Potion healthPotion;
    TextView playerHealth;
    TextView sprigganHealth;
    TextView HP;
    String playerHealthText;
    String sprigganHealthText;
    String HPText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forest);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        healthPotion = (Potion) getIntent().getSerializableExtra("healthPotion");

        playerHealth = (TextView) findViewById(R.id.playerHealth);
        sprigganHealth = (TextView) findViewById(R.id.sprigganHealth);
        HP = (TextView) findViewById(R.id.HP);

        playerHealthText = "Health: " + (int) player.getHealth() + " / " + (int) player.getMaxHealth();
        sprigganHealthText = "Health: " + (int) spriggan.getHealth() + " / " + (int) spriggan.getMaxHealth();
        HPText = "HP (" + healthPotion.getAmount() + ")";

        playerHealth.setText(playerHealthText);
        sprigganHealth.setText(sprigganHealthText);
        HP.setText(HPText);
    }
    public void strike(View view)
    {
        spriggan.takeDamage(player.strike());
        sprigganHealthText = "Health: " + (int) spriggan.getHealth() + " / " + (int) spriggan.getMaxHealth();
        sprigganHealth.setText(sprigganHealthText);
        checkSprigganAlive();
        player.takeDamage(spriggan.getDamage());
        playerHealthText = "Health: " + (int) player.getHealth() + " / " + (int) player.getMaxHealth();
        playerHealth.setText(playerHealthText);
        checkPlayerAlive();
    }
    public void useHealthPotion(View view)
    {
        if(healthPotion.getAmount() > 0 && player.getHealth() != player.getMaxHealth())
        {
            healthPotion.decreaseAmount();
            player.increaseHealth(healthPotion.getHealthBuff());
            if(player.getHealth() > player.getMaxHealth())
            {
                player.setHealth(player.getMaxHealth());
            }
            playerHealthText = "Health: " + (int) player.getHealth() + " / " + (int) player.getMaxHealth();
            HPText = "HP (" + healthPotion.getAmount() + ")";
            playerHealth.setText(playerHealthText);
            HP.setText(HPText);
        }
    }
    public void checkPlayerAlive()
    {
        if(player.getHealth() < 0.5)
        {
            intent = new Intent(this, Quests.class);
            Bundle bundle = new Bundle();
            spriggan.setHealth(spriggan.getMaxHealth());
            if(spriggan.getLevel() > 1)
            {
                spriggan.levelDown();
            }
            bundle.putSerializable("player", player);
            bundle.putSerializable("spriggan", spriggan);
            bundle.putSerializable("healthPotion", healthPotion);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public void checkSprigganAlive()
    {
        if(spriggan.getHealth() <= 0)
        {
            intent = new Intent(this, Quests.class);
            Bundle bundle = new Bundle();
            spriggan.setHealth(spriggan.getMaxHealth());
            player.increaseXP(spriggan.getXPYield());
            player.increaseHerbs(spriggan.getHerbYield());
            player.increaseGold(spriggan.getGoldYield());
            if(spriggan.getLevel() == spriggan.getMaxLevel())
            {
                spriggan.increaseMaxLevel();
                spriggan.levelUp();
            }
            if(player.getXP() >= player.getXPToNextLevel())
            {
                player.levelUp();
                while(spriggan.getLevel() < spriggan.getMaxLevel())
                {
                    spriggan.levelUp();
                }
            }
            bundle.putSerializable("player", player);
            bundle.putSerializable("spriggan", spriggan);
            bundle.putSerializable("healthPotion", healthPotion);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}