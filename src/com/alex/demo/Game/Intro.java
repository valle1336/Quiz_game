package com.alex.demo.Game;

import java.util.Scanner;

public class Intro {

    static Menu menu = new Menu();

    static Player player = new Player();

    Scanner scan = new Scanner(System.in);

    public void getName() {

        System.out.println("Welcome what is your name?");

        String name = scan.nextLine();

        player.setName(name);

        continueGame();
    }

    public void continueGame() {
        System.out.println("Hello " + player.getName() + " do you wish to continue? :) Y/N");

        String yesOrNo = scan.nextLine().toLowerCase(); //Makes the program accept lower and higher case letters


            if (yesOrNo.equals("y")) {
                menu.startGame();
            } else if (yesOrNo.equals("n")) {
                System.out.println("Okay exiting app! :(");
                System.exit(0);
            } else {
                System.out.println("Invalid input!");
                continueGame();
            }
    }
}
