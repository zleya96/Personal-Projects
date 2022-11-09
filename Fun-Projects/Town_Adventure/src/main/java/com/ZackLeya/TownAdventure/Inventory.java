package com.ZackLeya.TownAdventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<Item, Integer> backpack;
    private Map<String, Item> itemMap;

    public Inventory(Map<Item, Integer> backpack, Map itemMap) {
        this.backpack = backpack;
        this.itemMap = itemMap;
    }

    public String openBackpack () {
        String currentBackpack = "";
        for (Map.Entry<Item, Integer> inventory : backpack.entrySet()) {
            currentBackpack += inventory.getKey().getItemName() + " | "  + inventory.getValue() + "\n";
        }
        System.out.println(currentBackpack);
        return currentBackpack;
    }

    public void addToBackpack(String item) {
        if (backpack.containsKey(itemMap.get(item))) {
            backpack.put((itemMap.get(item)), (backpack.get(itemMap.get(item)) + 1));
        }
        if (!backpack.containsKey(itemMap.get(item))) {
            backpack.put((itemMap.get(item)), 1);
        }

    }

    public void removeFromBackpack(String item) {
        if (backpack.containsKey(itemMap.get(item))) {
            backpack.remove((itemMap.get(item)), (backpack.get(itemMap.get(item)) - 1));
        }
        if (!backpack.containsKey(itemMap.get(item))) {
            System.out.println("No item to drop.");
        }
    }
}
