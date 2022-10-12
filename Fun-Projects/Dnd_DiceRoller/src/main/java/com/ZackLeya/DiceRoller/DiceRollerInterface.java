package com.ZackLeya.DiceRoller;


import java.time.LocalTime;
import java.util.*;

public class DiceRollerInterface {
    private Map<String, Dice> diceMap;
    private String userDice;
    private int userModifier;
    private int userNumberOfDice;

    public DiceRollerInterface(Map<String, Dice> diceMap) {

        this.diceMap = diceMap;

        Dice d100 = new Dice(100);
        diceMap.put("d100", d100);
        Dice d20 = new Dice(20);
        diceMap.put("d20", d20);
        Dice d12 = new Dice(12);
        diceMap.put("d12", d12);
        Dice d10 = new Dice(10);
        diceMap.put("d10", d10);
        Dice d8 = new Dice(8);
        diceMap.put("d8", d8);
        Dice d6 = new Dice(6);
        diceMap.put("d6", d6);
        Dice d4 = new Dice(4);
        diceMap.put("d4", d4);
    }

    public void runDiceInterface() {

        askTypeOfDice();
        askModifier();
        askNumberOfDice();

        if (diceMap.containsKey(userDice)) {
            diceMap.get(userDice).setModifier(userModifier);
            diceMap.get(userDice).setNumberOfDice(userNumberOfDice);
            int rollResult = diceMap.get(userDice).rollDice();
            System.out.println();

            if (userDice.equals("d20") && rollResult == 20 && userModifier == 0 && userNumberOfDice == 1) {
                System.out.println("Huzzah! You rolled a natural " + rollResult + "! The gods are in your favor.");
            } else if (userDice.equals("d20") && rollResult == 1 && userModifier == 0 && userNumberOfDice == 1) {
                System.out.println("I'm sorry, traveler...you rolled a natural " + rollResult + ". Perhaps you are cursed.");
            } else {
                System.out.println("*********************************");
                System.out.println("         You rolled:  " + rollResult + "        ");
                System.out.println("*********************************");
            }

        }
    }

    public String askTypeOfDice() {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What kind of die are you rolling? ");
            userDice = scanner.nextLine().toLowerCase();
            if (!diceMap.containsKey(userDice)) {
                System.out.println();
                System.out.println("Sorry, traveler. I only understand common tongue.");
                System.out.println();
                askTypeOfDice();

            }
        } while (!diceMap.containsKey(userDice));

        return userDice;
    }

    public int askModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the modifier?: ");

        try {
            String mod = scanner.nextLine();
            userModifier = Integer.parseInt(mod);
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Forgive me, traveler. I don't speak Orc-ish.");
            System.out.println();
            askModifier();
        }
        return userModifier;
    }

    public int askNumberOfDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many dice are you rolling?: ");

        try {
            String number = scanner.nextLine();
            userNumberOfDice = Integer.parseInt(number);
            if (userNumberOfDice == 0) {
                System.out.println();
                System.out.println("You must roll at least one die, traveler.");
                System.out.println();
                askNumberOfDice();
            }
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Hmmm...I don't understand.");
            System.out.println();
            askNumberOfDice();
        }
        return userNumberOfDice;
    }

    public void timeGreeting() {
        LocalTime currentTime = LocalTime.now();
        LocalTime morning = LocalTime.of(5, 0);
        LocalTime afternoon = LocalTime.of(12, 0);
        LocalTime evening = LocalTime.of(18, 0);
        LocalTime midnight = LocalTime.of(0, 0);


        if (currentTime.isAfter(morning) && currentTime.isBefore(afternoon)) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Good Morning, weary traveler.");
            System.out.println("-----------------------------");
            System.out.println();
        } else if (currentTime.isAfter(afternoon) && currentTime.isBefore(evening)) {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("Good Afternoon, weary traveler.");
            System.out.println("-------------------------------");
            System.out.println();
        } else if (currentTime.isAfter(evening) || (currentTime.isAfter(midnight) && currentTime.isBefore(morning)))  {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Good Evening, weary traveler.");
            System.out.println("-----------------------------");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Hello, weary traveler.");
            System.out.println("-----------------------------");
            System.out.println();
        }
    }

    public void rollAgainOption() {
        boolean isValid;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.print("Would you like to roll again? (Y/N): ");

            String input = scanner.nextLine().toLowerCase();
            isValid = input.equals("y") || input.equals("n");

            if (input.equals("y")) {
                runDiceInterface();
            } else if (input.equals("n")) {
                System.exit(0);
            } else {
                System.out.println("Answer not recognized.");
                rollAgainOption();
            }
        } while (isValid);

    }
}
