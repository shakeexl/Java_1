package ru.geekbrains.level_1.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public boolean decreaseFood(int n) {
        if (n <= food) { food -= n; return true; }
        else {System.out.println("Too much appetite!"); return false; }
    }

    public void add(int m) {
        food += m;
    }
}
