package com.alex.demo.Game;

public class Player {

    private String name;

    private int guess;

    private int lives = 3;

    private int money = 500;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    void checkLives() {
        if (getLives() <= 0) {
            System.out.println("You are out of lives :( Game Over!");
            System.exit(0);
        }
            else if (getLives() == 1) {
                System.out.println("Careful only 1 life remaining! \n");
            }
        }
    }

