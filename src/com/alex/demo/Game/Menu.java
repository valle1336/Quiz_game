package com.alex.demo.Game;

import com.alex.demo.Items.Item;

import java.util.Scanner;

public class Menu {
    Item item = new Item();
    Shop shop = new Shop();
    Player player = new Player();

    Intro intro = new Intro();
    Scanner scan = new Scanner(System.in);

    public void startGame() {


        System.out.println(
                "1. Start game! \n" +
                "2. Go to shop! \n" +
                "3. Settings!"
        );


        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                startGamer();
                break;
            case 2:
                goToShop();
                break;
            case 3:
                Settings();
                break;

        }

    }

    private void Settings() {
        System.out.println("There is no settings at this time!");
        startGame();
    }

    private void goToShop() {
        shop.shopShop();
    }

    private void startGamer() {
        System.out.println(
                "What car has a V12 engine?\uD83C\uDFCE\n" +
                "1. Ferrari 812 Superfast \n" +
                "2. Volvo V60 \n" +
                "3. Lamborghini Huracan \n" +
                        "4. Use Potion! \n" +
                        "5. Use Skip! \n"
        );
        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                player.setMoney(player.getMoney() + 50);
                System.out.println("You were right :) + 50$!" + " Current money: " + player.getMoney() + "$ ✅ \n");
                QuestionTwo();
                break;
            case 2:
                player.setLives(player.getLives() -1);
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionTwo();
                break;
            case 3:
                player.setLives(player.getLives() -1);
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionTwo();
                break;
            case 4:
                item.checkIfPotionIsOwned();
                startGamer();
            case 5:
                item.checkIfSkipIsOwned();
                QuestionTwo();
        }
    }


    private void QuestionTwo() {

        System.out.println(
                "What car has the most horsepower?🎠\n" +
                "1. Nissan GT-R \n" +
                "2. Tesla Model S Plaid \n" +
                "3. Ferrari F8 \n" +
                        "4. Use Potion! \n" +
                        "5. Use Skip! \n"
        );

        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionThree();
                break;
            case 2:
                player.setMoney(player.getMoney() + 50);
                System.out.println("You were right :) + 50$!" + " Current money: " + player.getMoney() + "$ ✅ \n");
                QuestionThree();
                break;
            case 3:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionThree();
                break;
            case 4:
                item.checkIfPotionIsOwned();
                QuestionTwo();
            case 5:
                item.checkIfSkipIsOwned();
                QuestionThree();
        }
    }
    private void QuestionThree() {
        System.out.println("This is the expert level questions! If answered right is worth more :) \n");

        System.out.println(
                "What car has more torque?🚅 \n" +
                "1. Kia Stinger GT 2023 \n" +
                "2. Audi RS3 2023 \n" +
                "3. BMW 535D 2017 \n" +
                        "4. Use Potion! \n" +
                        "5. Use Skip! \n"
        );
        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionFour();
                break;
            case 2:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                QuestionFour();
                break;
            case 3:
                player.setMoney(player.getMoney() + 80);
                System.out.println("You were right :) + 80$!" + " Current money: " + player.getMoney() + "$ ✅ \n");
                System.out.println("BMW has 630nm of torque compared to 510nm and 480nm in the Kia and Audi \n");
                QuestionFour();
                break;
            case 4:
                item.checkIfPotionIsOwned();
                QuestionThree();
            case 5:
                item.checkIfSkipIsOwned();
                QuestionFour();
        }
    }
    private void QuestionFour() {

        System.out.println(
                "What car comes with a AWD system as standard?🦎\n" +
                "1. BMW M2 \n" +
                "2. Subaru WRX \n" +
                "3. Audi A6 \n" +
                        "4. Use Potion! \n" +
                        "5. Use Skip! \n"
        );

        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                startGame();
                break;
            case 2:
                player.setMoney(player.getMoney() + 80);
                System.out.println("You were right :) + 80$!" + " Current money: " + player.getMoney() + "$ ✅ \n");
                startGame();
                break;
            case 3:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                startGame();
                break;
            case 4:
                item.checkIfPotionIsOwned();
                QuestionFour();
            case 5:
                item.checkIfSkipIsOwned();
                startGamer();
        }
    }
}
