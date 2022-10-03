package com.ZackLeya.DiceRoller;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dice d100 = new Dice(100);
        Dice d20 = new Dice(20);
        Dice d12 = new Dice(12);
        Dice d10 = new Dice(10);
        Dice d8 = new Dice(8);
        Dice d6 = new Dice(6);
        Dice d4 = new Dice(4);

        System.out.print("What kind of die are you rolling? (ex. d20): ");
        String userDice = scanner.nextLine().toLowerCase();

        System.out.print("What is the modifier?: ");
        String mod = scanner.nextLine();
        int userModifier = Integer.parseInt(mod);

        System.out.print("How many dice are you rolling?: ");
        String number = scanner.nextLine();
        int userNumberOfDice = Integer.parseInt(number);

        switch (userDice) {
            case "d100":
                d100.setModifier(userModifier);
                d100.setNumberOfDice(userNumberOfDice);
                System.out.println(d100.rollDice());
                break;
            case "d20":
                d20.setModifier(userModifier);
                d20.setNumberOfDice(userNumberOfDice);
                System.out.println(d20.rollDice());
                break;
            case "d12":
                d12.setModifier(userModifier);
                d12.setNumberOfDice(userNumberOfDice);
                System.out.println(d12.rollDice());
                break;
            case "d10":
                d10.setModifier(userModifier);
                d10.setNumberOfDice(userNumberOfDice);
                System.out.println(d10.rollDice());
                break;
            case "d8":
                d8.setModifier(userModifier);
                d8.setNumberOfDice(userNumberOfDice);
                System.out.println(d8.rollDice());
                break;
            case "d6":
                d6.setModifier(userModifier);
                d6.setNumberOfDice(userNumberOfDice);
                System.out.println(d6.rollDice());
                break;
            case "d4":
                d4.setModifier(userModifier);
                d4.setNumberOfDice(userNumberOfDice);
                System.out.println(d4.rollDice());
                break;
            default:
                System.out.println("Sorry, die not found");
                break;
        }

//        if (userDice.equals("d100")) {
//            d100.setModifier(userModifier);
//            d100.setNumberOfDice(userNumberOfDice);
//            System.out.println(d100.rollDice());
//        } else if (userDice.equals("d20")) {
//            d20.setModifier(userModifier);
//            d20.setNumberOfDice(userNumberOfDice);
//            System.out.println(d20.rollDice());
//        } else if (userDice.equals("d12")) {
//            d12.setModifier(userModifier);
//            d12.setNumberOfDice(userNumberOfDice);
//            System.out.println(d12.rollDice());
//        } else if (userDice.equals("d10")) {
//            d10.setModifier(userModifier);
//            d10.setNumberOfDice(userNumberOfDice);
//            System.out.println(d10.rollDice());
//        } else if (userDice.equals("d8")) {
//            d8.setModifier(userModifier);
//            d8.setNumberOfDice(userNumberOfDice);
//            System.out.println(d8.rollDice());
//        } else if (userDice.equals("d6")) {
//            d6.setModifier(userModifier);
//            d6.setNumberOfDice(userNumberOfDice);
//            System.out.println(d6.rollDice());
//        } else if (userDice.equals("d4")) {
//            d4.setModifier(userModifier);
//            d4.setNumberOfDice(userNumberOfDice);
//            System.out.println(d4.rollDice());
//        } else {
//            System.out.println("Sorry, die not found");
//        }


    }
}
