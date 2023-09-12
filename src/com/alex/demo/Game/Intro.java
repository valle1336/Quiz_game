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

        Continue();
    }

    public void Continue() {
        System.out.println("Hello " + player.getName() + " do you wish to continue? :) Y/N");

        String yesOrNo = scan.nextLine();

        if (yesOrNo.equals("Y")) {
            menu.startGame();
        }
        else if (yesOrNo.equals("N")){
            System.out.println("Okay exiting app! :(");
            System.exit(0);
        }
    }

}
