package ru.geekbrains.lesson_6;

public class Dog extends Animal {
    static int counter = 0;
    String color;
    int max_run = 500;
    int max_swim = 10;

    public Dog (String name, String color) {
        counter++;
        this.name = name;
        this.color = color;
    }

    @Override
    public void run(int run_dist) {
        if (run_dist <= max_run) {
            System.out.println(color + " dog " + name + " run " + run_dist + "m");
        }
        else {
            System.out.println("Dog cannot run more than " + max_run + " meters!");
        }
    }

    @Override
    public void swim(int swim_dist) {
        if (swim_dist <= max_swim) {
            System.out.println(color + " dog " + name + " run " + swim_dist + "m");
        }
        else {
            System.out.println("Dog cannot swim more than " + max_swim + " meters!");
        }
    }

    @Override
    public void count() {
        System.out.println("Amount of dog: " + counter);
    }
}
