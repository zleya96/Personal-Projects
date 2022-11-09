package com.ZackLeya.TownAdventure;

public abstract class Character {
    private String name;
    int age;

    public Character (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
