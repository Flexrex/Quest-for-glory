package com.example.erik.quest_for_glory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Alchemy extends AppCompatActivity
{
    Intent intent;
    Bundle bundle;
    Player player;
    Monster spriggan;
    Potion healthPotion;
    TextView level;
    TextView XP;
    TextView herbs;
    TextView gold;
    TextView theHealthPotion;
    TextView healthPotionUpgrade;
    TextView healthPotionCraft;
    TextView healthPotionSell;
    TextView healthPotionBuy;
    String levelText;
    String XPText;
    String herbsText;
    String goldText;
    String healthPotionText;
    String healthPotionUpgradeText;
    String healthPotionCraftText;
    String healthPotionSellText;
    String healthPotionBuyText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchemy);

        player = (Player) getIntent().getSerializableExtra("player");
        spriggan = (Monster) getIntent().getSerializableExtra("spriggan");
        healthPotion = (Potion) getIntent().getSerializableExtra("healthPotion");

        level = (TextView) findViewById(R.id.level);
        XP = (TextView) findViewById(R.id.XP);
        herbs = (TextView) findViewById(R.id.herbs);
        gold = (TextView) findViewById(R.id.gold);
        theHealthPotion = (TextView) findViewById(R.id.healthPotion);
        healthPotionUpgrade = (TextView) findViewById(R.id.healthPotionUpgrade);
        healthPotionCraft = (TextView) findViewById(R.id.healthPotionCraft);
        healthPotionSell = (TextView) findViewById(R.id.healthPotionSell);
        healthPotionBuy = (TextView) findViewById(R.id.healthPotionBuy);

        levelText = "Level " + player.getLevel();
        XPText = "XP " + player.getXP() + " / " + player.getXPToNextLevel();
        herbsText = " Herbs: " + (int) player.getHerbs();
        goldText = " Gold: " + (int) player.getGold();
        healthPotionText = "Health Potion Level " + healthPotion.getLevel() + "\n" + (int) healthPotion.getHealthBuff() + " Health " + "(" + healthPotion.getAmount() + ")";
        healthPotionUpgradeText = "Upgrade for\n" + (int) healthPotion.getUpgradeCost() + " Gold";
        healthPotionCraftText = "Craft for\n" + (int) healthPotion.getHerbCost() + " Herbs";
        healthPotionSellText = "Sell for\n" + (int) healthPotion.getGoldWorth() + " Gold";
        healthPotionBuyText = "Buy for\n" + (int) healthPotion.getGoldCost() + " Gold";

        level.setText(levelText);
        XP.setText(XPText);
        herbs.setText(herbsText);
        gold.setText(goldText);
        theHealthPotion.setText(healthPotionText);
        healthPotionUpgrade.setText(healthPotionUpgradeText);
        healthPotionCraft.setText(healthPotionCraftText);
        healthPotionSell.setText(healthPotionSellText);
        healthPotionBuy.setText(healthPotionBuyText);
    }
    public void upgradeHealthPotion(View view)
    {
        if(player.getGold() >= healthPotion.getUpgradeCost())
        {
            player.decreaseGold(healthPotion.getUpgradeCost());
            healthPotion.upgrade();

            goldText = " Gold: " + (int) player.getGold();
            healthPotionText = "Health Potion Level " + healthPotion.getLevel() +  "\n+ " + (int) healthPotion.getHealthBuff() + " Health " + "(" + healthPotion.getAmount() + ")";
            healthPotionUpgradeText = "Upgrade for\n" + (int) healthPotion.getUpgradeCost() + " Gold";
            healthPotionCraftText = "Craft for\n" + (int) healthPotion.getHerbCost() + " Herbs";
            healthPotionSellText = "Sell for\n" + (int) healthPotion.getGoldWorth() + " Gold";
            healthPotionBuyText = "Buy for\n" + (int) healthPotion.getGoldCost() + " Gold";

            gold.setText(goldText);
            theHealthPotion.setText(healthPotionText);
            healthPotionUpgrade.setText(healthPotionUpgradeText);
            healthPotionCraft.setText(healthPotionCraftText);
            healthPotionSell.setText(healthPotionSellText);
            healthPotionBuy.setText(healthPotionBuyText);
        }
    }
    public void buyHealthPotionForGold(View view)
    {
        if(player.getGold() >= healthPotion.getGoldCost())
        {
            player.decreaseGold(healthPotion.getGoldCost());
            healthPotion.increaseAmount();

            goldText = " Gold: " + (int) player.getGold();
            healthPotionText = "Health Potion Level " + healthPotion.getLevel() + "\n" + (int) healthPotion.getHealthBuff() + " Health " + "(" + healthPotion.getAmount() + ")";
            healthPotionUpgradeText = "Upgrade for\n" + (int) healthPotion.getUpgradeCost() + " Gold";

            gold.setText(goldText);
            theHealthPotion.setText(healthPotionText);
            healthPotionUpgrade.setText(healthPotionUpgradeText);
        }
    }
    public void sellHealthPotionForGold(View view)
    {
        if(healthPotion.getAmount() > 0)
        {
            player.increaseGold(healthPotion.getGoldWorth());
            healthPotion.decreaseAmount();

            goldText = " Gold: " + (int) player.getGold();
            healthPotionText = "Health Potion Level " + healthPotion.getLevel() + "\n" + (int) healthPotion.getHealthBuff() + " Health " + "(" + healthPotion.getAmount() + ")";
            healthPotionUpgradeText = "Upgrade for\n" + (int) healthPotion.getUpgradeCost() + " Gold";

            gold.setText(goldText);
            theHealthPotion.setText(healthPotionText);
            healthPotionUpgrade.setText(healthPotionUpgradeText);
        }
    }
    public void buyHealthPotionForHerbs(View view)
    {
        if(player.getHerbs() >= healthPotion.getHerbCost())
        {
            player.decreaseHerbs(healthPotion.getHerbCost());
            healthPotion.increaseAmount();

            herbsText = " Herbs: " + (int) player.getHerbs();
            healthPotionText = "Health Potion Level " + healthPotion.getLevel() + "\n" + (int) healthPotion.getHealthBuff() + " Health " + "(" + healthPotion.getAmount() + ")";
            healthPotionUpgradeText = "Upgrade for\n" + (int) healthPotion.getUpgradeCost() + " Gold";

            herbs.setText(herbsText);
            theHealthPotion.setText(healthPotionText);
            healthPotionUpgrade.setText(healthPotionUpgradeText);
        }
    }
    public void greed(View view)
    {
        intent = new Intent(this, Greed.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void inventory(View view)
    {
        intent = new Intent(this, Inventory.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void skills(View view)
    {
        intent = new Intent(this, Skills.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void gear(View view)
    {
        intent = new Intent(this, Gear.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void kingdom(View view)
    {
        intent = new Intent(this, Kingdom.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void quests(View view)
    {
        intent = new Intent(this, Quests.class);
        bundle = new Bundle();
        bundle.putSerializable("player", player);
        bundle.putSerializable("spriggan", spriggan);
        bundle.putSerializable("healthPotion", healthPotion);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}