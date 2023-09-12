package com.alex.demo.Game;

import com.alex.demo.Items.Item;

import java.util.Scanner;

public class Shop {

    Player player = new Player();

    Item item = new Item();

    static Menu menu = new Menu();

    Scanner scan = new Scanner(System.in);

    void shopShop() {

        System.out.println("Welcome to the shop what do you want? 🏪\n" +
                "You have " +
                player.getMoney() +
                " $ \n" +
                "1. Potion🧙🧃 200$ \n" +
                "2. Skips➡ 350$ \n" +
                "3. Exit shop⬅"
        );



        int sc = scan.nextInt();


        if (sc == 1) {
            if (player.getMoney() >= 200) {
                item.setPotion(item.getPotion() + 1);
                player.setMoney(player.getMoney() - 200);
                System.out.println("You now have " + item.getPotion() + " potion(s)! And " + player.getMoney() + " $ left! \n");
                shopShop();
            }
            else {
                System.out.println("You can't afford this item! ❌ \n");
                shopShop();
            }
        }
        if (sc == 2) {
            if (player.getMoney() >= 350) {
                item.setSkips(item.getSkips() + 1);
                player.setMoney(player.getMoney() - 350);
                System.out.println("You now have " + item.getSkips() + " skip(s)! And " + player.getMoney() + " $ left! \n");
                shopShop();
            }
            else {
                System.out.println("You can't afford this item! ❌ \n");
                shopShop();
            }
        }
        if (sc == 3) {
            menu.startGame();
        }
    }
}
