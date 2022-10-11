package com.ZackLeya.DiceRoller;

import java.util.*;

public class Dice {

    private int numberOfSides;
    private int modifier;
    private int numberOfDice = 1;


    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int rollDice() {
        Random r = new Random();
        int roll = (1 + r.nextInt(numberOfSides) * numberOfDice) + modifier;
        return roll;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
