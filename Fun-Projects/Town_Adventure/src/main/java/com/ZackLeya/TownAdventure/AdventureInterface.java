package com.ZackLeya.TownAdventure;

import com.ZackLeya.TownAdventure.Characters.Banker;
import com.ZackLeya.TownAdventure.Characters.GeneralStoreOwner;

import java.util.*;

public class AdventureInterface {
    private Map<String, Character> characterMap = new HashMap<>();
    private Map<Item, Integer> backpack = new HashMap<>();
    private Map<String, Item> itemMap = new HashMap<>();
    Inventory inventory = new Inventory(backpack, itemMap);

    public AdventureInterface() {

        Item smallGeode = new Item("Small Geode", "Small Geode description");
        itemMap.put(smallGeode.getItemName(), smallGeode);
        Item largeGeode = new Item("Large Geode", "Large geode description");
        itemMap.put(largeGeode.getItemName(), largeGeode);
        Item goldNugget = new Item("Gold Nugget", "Gold Nugget description");
        itemMap.put(goldNugget.getItemName(), goldNugget);
        Item diamond = new Item("Diamond", "Diamond description");
        itemMap.put(diamond.getItemName(), diamond);

        KeyItem wallet = new KeyItem("Wallet", "Wallet description");
        itemMap.put(wallet.getItemName() + "*", wallet);
        KeyItem pickaxe = new KeyItem("Pickaxe", "Pickaxe description");
        itemMap.put(pickaxe.getItemName() + "*", pickaxe);

        Character banker = new Banker("Fred", 29);
        characterMap.put(banker.getName(), banker);
        Character generalStoreOwner = new GeneralStoreOwner("Wilbur", 50);
        characterMap.put(generalStoreOwner.getName(), generalStoreOwner);

    }

    public void runAdventure() {

        townEntry();

    }

    public void townEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go?");
        System.out.println ("1) Bank \n" +
                            "2) General Store \n" +
                            "3) Prospecting Mines ");
        System.out.println("---> ");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            //TODO: bank method
        } else if (input.equals("2")) {
            // TODO: general store method
        } else if (input.equals("3")) {
            miningBanner();
        }
    }

    public void miningBanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to go prospecting?");
        System.out.println("1) Yes   2) No");
        System.out.print("---> ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("1") && backpack.containsKey(itemMap.get("Pickaxe"))) {
            goMining();
        } else if (input.equals("2")) {
            System.exit(0);
        } else if (input.equals("1") && !backpack.containsKey(itemMap.get("Pickaxe"))) {
            System.out.println("You need a pickaxe to mine here.");
            // TODO loop this?
        }

    }

    public void goMining() {

            Random r = new Random();
            int miningOutcome = r.nextInt(100);
            if (miningOutcome >= 20) {
                System.out.println("You didn't find anything worth keeping.");
            } else if (miningOutcome < 20 && miningOutcome >= 10) {
                System.out.println("You found a small geode!");
                inventory.addToBackpack("Small Geode");
            } else if (miningOutcome < 10 && miningOutcome >= 5) {
                System.out.println("You found a large geode!");
                inventory.addToBackpack("Large Geode");
            } else if (miningOutcome < 5 && miningOutcome >= 1) {
                System.out.println("You found a gold nugget!");
                inventory.addToBackpack("Gold Nugget");
            } else {
                System.out.println("You found a diamond!");
                inventory.addToBackpack("Diamond");
            }
            mineAgainOption();
        }

    public void mineAgainOption() {
        boolean isValid;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("Would you like to mine again? ");
            System.out.println("1) Yes   2) No");
            System.out.print("---> ");
            String input = scanner.nextLine().toLowerCase();
            isValid = input.equals("1") || input.equals("2");

            if (input.equals("1")) {
                goMining();
            } else if (input.equals("2")) {
                inventory.openBackpack();
                System.exit(0);
            } else {
                System.out.println("Invalid Input.");
                mineAgainOption();
            }
        } while (isValid);

    }



}
