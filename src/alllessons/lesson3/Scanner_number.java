package ru.itmonopoly.alllessons.lesson3;

import java.util.Scanner;

public class Scanner_number {
    public static void main(String[] args) {
        int i = 0;
        int x = 50;
        int maxValue = 101;
        int minValue = 0;
        int numIter = 1;

        System.out.println("Загадайте число от 1 до 100");
        System.out.println("Введите \"Yes\" если это так");
        System.out.println("Введите b, если выше число больше");
        System.out.println("Введите m, если выше число меньше");
        while (i <= 10) {
            System.out.println("Ваше число = " + x + " ?");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.equalsIgnoreCase("yes")) {
                System.out.println("Ваше число " + x + "!!!");
                break;
            } else if (s.equalsIgnoreCase("b")) {
                minValue = x;

            } else if (s.equalsIgnoreCase("m")) {
                maxValue = x;

            } else {
                System.out.println("Неправильный ввод " + s);
            }
            x = (maxValue - minValue) / 2 + minValue;
            numIter++;

        }
        System.out.println("Вы легко предсказуемы за " + numIter + " шагов!");
        System.out.println("GAME OVER");

    }

}
