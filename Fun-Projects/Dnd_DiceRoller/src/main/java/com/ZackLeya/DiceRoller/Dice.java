package com.ZackLeya.DiceRoller;

import java.util.*;

public class Dice {

    private int numberOfSides;
    private int modifier;
    private int numberOfDice = 1;

    public Dice(int numberOfSides, int modifier, int numberOfDice) {
        this.numberOfSides = numberOfSides;
        this.modifier = modifier;
        this.numberOfDice = numberOfDice;
    }

    public Dice(int numberOfSides, int modifier) {
        this.numberOfSides = numberOfSides;
        this.modifier = modifier;
    }

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int rollDice() {
        Random r = new Random();
        int roll = (1 + r.nextInt(numberOfSides) * numberOfDice) + modifier;
        return roll;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
}
