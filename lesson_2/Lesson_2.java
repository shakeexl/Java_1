package ru.geekbrains.level_1.lesson_2;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//   заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить
//   элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//   то есть [0][0], [1][1], [2][2], …, [n][n];
//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//   если в массиве есть место, в котором сумма левой и правой части массива равны.
//   Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
//   символами ||, эти символы в массив не входят.
//7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//   при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
//   задачи нельзя пользоваться вспомогательными массивами.
//   Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//   При каком n в какую сторону сдвиг можете выбирать сами.

import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println("Задание 1: " + task_1());
        System.out.println("Задание 2: " + task_2());
        System.out.println("Задание 3: " + task_3());
        System.out.println("Задание 4: ");
        printArr(task_4());
        task_5();
    }

    public static String task_1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return Arrays.toString(arr);
    }

    public static String task_2() {
        int[] arr = new int[8];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j = j + 3;
        }
        return Arrays.toString(arr);
    }

    public static String task_3() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return Arrays.toString(arr);
    }

    public static int[][] task_4() {
        int[][] arr = new int[5][5];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i][j] = 1;
        }
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            arr[i][j] = 1;
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

    public static void task_5() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max <= j) {
                max = j;
            }
            if (min >= j) {
                min = j;
            }
        }
        System.out.println("Задание 5: Max - " + max + ", Min - " + min);
    }
}
