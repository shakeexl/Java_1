package ru.geekbrains.level_1.lesson_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Casey");
        Cat cat = new Cat("Kaley", "Grey");
        Dog dog  = new Dog("Roger", "Black");
        animal.swim(50);
        cat.run(250);
        dog.run(400);
        cat.swim(50);
        dog.swim(10);
        animal.count();
        cat.count();
        dog.count();
    }
}
