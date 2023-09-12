package com.alex.demo.Items;

import com.alex.demo.Game.Player;

public class Item {
    Player player = new Player();
    private int Potion;

    private int Skips;

    public int getPotion() {
        return Potion;
    }

    public void setPotion(int potion) {
        Potion = potion;
    }

    public int getSkips() {
        return Skips;
    }

    public void setSkips(int skips) {
        Skips = skips;
    }
    public void checkIfSkipIsOwned() {
        if(getSkips() == 0) {
            System.out.println("You don't own this item! ");

        } else {
            setSkips(getSkips() - 1);
            player.setMoney(player.getMoney() + 50);
            System.out.println("You skipped this round and earned 50$ ");
        }
    }
    public void checkIfPotionIsOwned() {
        if(getPotion() == 0) {
            System.out.println("You don't own this item! ");
            System.out.println(getPotion()); // Tar inte med variabeln hit så programmet tror att jag inte har potions

        } else {
            setPotion(getPotion() - 1);
            player.setLives(player.getLives() + 1);
            System.out.println("You healed up one life!");
        }
    }
}
