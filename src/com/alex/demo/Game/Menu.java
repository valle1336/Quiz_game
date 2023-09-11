package com.alex.demo.Game;

import java.util.Scanner;

public class Menu {
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
        System.out.println("There is no shop at this time!");
        shop.shopShop();
    }

    private void startGamer() {
        System.out.println(
                "What car has a V12 engine?\uD83C\uDFCE\n" +
                "1. Ferrari 812 Superfast \n" +
                "2. Volvo V60 \n" +
                "3. Lamborghini Huracan"
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
        }
    }


    private void QuestionTwo() {

        System.out.println(
                "What car has the most horsepower?🎠\n" +
                "1. Nissan GT-R \n" +
                "2. Tesla Model S Plaid \n" +
                "3. Ferrari F8 \n"
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
        }
    }
    private void QuestionThree() {
        System.out.println("This is the expert level questions! If answered right is worth more :) \n");

        System.out.println(
                "What car has more torque?🚅 \n" +
                "1. Kia Stinger GT 2023 \n" +
                "2. Audi RS3 2023 \n" +
                "3. BMW 535D 2017 \n"
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
        }
    }
    private void QuestionFour() {

        System.out.println(
                "What car comes with a AWD system as standard?🦎\n" +
                "1. BMW M2 \n" +
                "2. Subaru WRX \n" +
                "3. Audi A6 \n"
        );

        int sc = scan.nextInt();

        switch (sc) {
            case 1:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                break;
            case 2:
                player.setMoney(player.getMoney() + 80);
                System.out.println("You were right :) + 80$!" + " Current money: " + player.getMoney() + "$ ✅ \n");
                break;
            case 3:
                player.setLives(player.getLives() -1);
                player.checkLives();
                System.out.println("You were wrong - 1 life :( " + " Current lives: " + player.getLives() + " ❌" + "\n");
                break;
        }
    }
}
