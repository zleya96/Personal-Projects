package com.ZackLeya.DiceRoller;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, Dice> diceMap = new HashMap<>();

        DiceRollerInterface diceInterface = new DiceRollerInterface(diceMap);

        diceInterface.timeGreeting();
        diceInterface.runDiceInterface();
        diceInterface.rollAgainOption();
    }
}
