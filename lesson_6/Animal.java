package ru.geekbrains.level_1.lesson_6;

public class Animal {
    static int counter = 0;
    String name;

    public Animal() {
        counter++;
    }

    public Animal(String name) {
        counter++;
        this.name = name;
    }

    public void run(int run_dist) {
        System.out.println("Animal run " + run_dist + "m");
    }

    public void swim(int swim_dist) {
        System.out.println("Animal swim " + swim_dist + "m");
    }

    public void count() {
        System.out.println("Amount of animals: " + counter);
    }
}
