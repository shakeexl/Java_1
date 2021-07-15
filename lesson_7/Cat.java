package ru.geekbrains.level_1.lesson_7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate p) {
        System.out.println("The cat is eating...");
         if (p.decreaseFood(appetite)) {
             satiety = true;
         }
    }

    public void info() {
        if (satiety) {
            System.out.println(name + " is full");
        } else {System.out.println(name + " is still hungry");}
    }
}
