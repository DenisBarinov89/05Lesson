package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int min = 100000;
        int max = 200000;
        int n = 30;
        int[] moneyBook = new int[n];
        float allExpenses = 0;

        //создаем массив случайных чисел
        for (int i = 0; i < moneyBook.length; i++) {
            int x = i + 1;
            int rnd = new Random().ints(1, min, max).findFirst().getAsInt();
            moneyBook[i] = rnd;
            System.out.println("День " + x + ", потратили: " + moneyBook[i]);
        }

        //Задание 1
        for (int i = 0; i < moneyBook.length; i++) {
            allExpenses = allExpenses + moneyBook[i];
        }
        System.out.println("Сумма трат за месяц составила: " + allExpenses + " руб.");

        //Задание 2
        int minSpend = moneyBook[0];
        int maxSpend = moneyBook[0];

        for (int i = 0; i < moneyBook.length; i++) {
            if (minSpend > moneyBook[i]) {
                minSpend = moneyBook[i];
            }
            if (maxSpend < moneyBook[i]) {
                maxSpend = moneyBook[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minSpend + " руб.");
        System.out.println("Максимальная сумма трат за день составила: " + maxSpend + " руб.");

        //Задание 3
        float avgSpend = allExpenses / n;

        System.out.println("Средняя сумма трат за день составила: " + avgSpend + " руб.");

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i = reverseFullName.length - 1;

        while (i >= 0) {
            System.out.print(reverseFullName[i]);
            i = i - 1;
        }


    }
}
