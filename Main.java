package ru.geekbrains.lesson_7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(200);

        plate.add(50);
        plate.info();

        Cat[] cats = {
                new Cat("Casey", 95),
                new Cat("Kaley", 50),
                new Cat("Roger", 87),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.info();
    }
}
