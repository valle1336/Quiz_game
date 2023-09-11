package com.alex.demo.Game;

import com.alex.demo.Items.Item;

import java.util.Scanner;

public class Shop {

    Player player = new Player();

    Item item = new Item();

    Scanner scan = new Scanner(System.in);

    void shopShop() {

        System.out.println("Welcome to the shop what do you want? 🏪\n" +
                "1. Potion🧙🧃 200$ \n" +
                "2. Skips➡ 350$"
        );



        int sc = scan.nextInt();


        if (sc == 1) {
            if (player.getMoney() >= 200) {
                item.setPotion(1);
            }
            else {
                System.out.println("You can't afford this item! ❌ \n");
                shopShop();
            }
        }
        if (sc == 2) {
            if (player.getMoney() >= 350) {
                item.setSkips(1);
            }
            else {
                System.out.println("You can't afford this item! ❌ \n");
                shopShop();
            }
        }

    }
}
