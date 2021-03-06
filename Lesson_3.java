package ru.geekbrains.lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------\n" +
                "Выберите игру: [1 - 'Угадай число!' | 2 - 'Угадай слово!']:\n" +
                "----------------------------------------------------------");
        int player_game = scanner.nextInt();
        if (player_game == 1) {game_number();}
        if (player_game == 2) {game_word();}
    }

    public static void guess_number(int random_num) {
        Scanner scanner = new Scanner(System.in);
        String result = null;
        int i = 0;
        do {
            i++;
            System.out.println("Угадайте число от 0 до 9:");
            int player_num = scanner.nextInt();
            if (player_num > random_num) {
                result = "Ваше число больше загаданного!";
                System.out.println(result);
            }
            if (player_num < random_num) {
                result = "Ваше число меньше загаданного!";
                System.out.println(result);
            }
            if (player_num == random_num) {
                result = "Вы угадали!";
                System.out.println(result);
                break;
            }
            if (i == 3) {
                result = "У вас кончились попытки!";
                System.out.println(result);
                break;
            }
        } while (!result.equals("Вы угадали!"));

    }

    public static void game_number() {
        System.out.println("------------------------------------------------------------\n" +
                "Добро пожаловать в игру 'Угадай число'! У вас есть 3 попытки.\n" +
                "------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int player_choice;
        do {
            int random_num = (int) (Math.random() * 9);
            guess_number(random_num);
            System.out.println("-------------------------------------------" +
                    "\nПовторить игру еще раз? [1 – Да | 0 – Нет]:\n" +
                    "-------------------------------------------");
            player_choice = scanner.nextInt();
            if (player_choice == 0) {
                System.out.println("----------------\n" +
                        "Спасибо за игру!\n" +
                        "----------------");
                break;
            }
        } while (player_choice == 1);
    }
    public static void guess_word(String[] words) {
        Scanner scanner = new Scanner(System.in);
        int rand_pos = (int) (Math.random() * words.length-1);
        String rand_word = words[rand_pos];
        String player_word;
        do {
            System.out.println("\nУгадайте слово:");
            player_word = scanner.nextLine();
            for (int i = 0; i < 15; i++)
                if (i < rand_word.length() && i < player_word.length() &&
                        rand_word.charAt(i) == player_word.charAt(i))
                    System.out.print(rand_word.charAt(i));
                else
                    System.out.print((rand_word.equals(player_word))? "" : "#");
        } while (!rand_word.equals(player_word));
        System.out.println("\n--------------------------\n" +
                "Отгадали! Спасибо за игру!\n" +
                "--------------------------");
    }

    public static void game_word() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("----------------------------------------------------------------------------------------------\n" +
                "Добро пожаловать в игру 'Угадай слово'! Игра подскажет вам, какие буквы стоят на своих местах.\n" +
                "----------------------------------------------------------------------------------------------");
        System.out.println("Загадано слово из следующего списка:");
        System.out.println(Arrays.toString(words));
        guess_word(words);
    }
}