package ru.geekbrains.level_1.lesson_5;


/**
 *1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 *2. Конструктор класса должен заполнять эти поля при создании объекта.
 *3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 *4. Создать массив из 5 сотрудников.
 *5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */


public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public static void main(String[] args) {
        Info(); // for task 3
        ArrayInfo(); // for task 5
    }

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void Info() {
        Employee employee = new Employee("John", "Developer", "John@gmail.com", "79164037105", 100000, 25);
        System.out.println("Name: " + employee.name);
        System.out.println("Position: " + employee.position);
        System.out.println("Email: " + employee.email);
        System.out.println("Phone: " + employee.phone);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Age: " + employee.age);
    }

    public static void ArrayInfo() {
        Employee[] EmpArray = new Employee[5];
        EmpArray[0] = new Employee("John", "Developer", "John@gmail.com", "79164037105", 100000, 25);
        EmpArray[1] = new Employee("Max", "Analyst", "Max@gmail.com", "79167637105", 80000, 29);
        EmpArray[2] = new Employee("Liza", "Manager", "Liza@gmail.com", "79168337195", 50000, 41);
        EmpArray[3] = new Employee("Fox", "Consultant", "Fox@gmail.com", "79160937100", 40000, 54);
        EmpArray[4] = new Employee("Kaley", "Support", "Kaley@gmail.com", "79164437175", 60000, 34);
        for (Employee i : EmpArray) {
            if (i.age > 40) {
                System.out.print("Name: " + i.name + " Position: " + i.position + " Email: " + i.email + " Phone: " + i.phone + " Salary: " + i.salary + " Age: " + i.age + "\n");
            }
        }
    }
}

