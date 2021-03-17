package ru.geekbrains.lesson_6;

public class Cat extends Animal {
    static int counter = 0;
    String color;
    int max_run = 200;

    public Cat (String name, String color) {
        counter++;
        this.name = name;
        this.color = color;
    }

    @Override
    public void run(int run_dist) {
        if (run_dist <= max_run) {
            System.out.println(color + " cat " + name + " run " + run_dist + "m");
        }
        else {
            System.out.println("Cat cannot run more than " + max_run + " meters!");
        }
    }
    @Override
    public void swim(int swim_dist) {
        System.out.println("Cat cannot swim!");
    }

    @Override
    public void count() {
        System.out.println("Amount of cats: " + counter);
    }
}
