package com.ZackLeya.DiceRoller;

import java.util.*;

public class Dice {

    private int numberOfSides;
    private int modifier;
    private int numberOfDice = 1;


    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int[] rollDice() {

        //TODO: TEST THIS --> also change so that nat 20 message is without modifier
        Random r = new Random();
        int[] roll = new int[2];

        for (int i = 1; i <= numberOfDice; i++ ) {
            roll[0] += (1 + r.nextInt(numberOfSides));
        }

        roll[1] = roll[0] + modifier;
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
