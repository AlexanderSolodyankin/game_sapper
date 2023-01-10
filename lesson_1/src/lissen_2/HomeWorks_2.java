package lissen_2;

import java.util.Scanner;

public class HomeWorks_2 {
    public static void main(String[] args) {
         /**
         1 Задача
         Вводится три числа
         а = ввести значение
         б = ввести значение
         с = ввести значение

         Являются ли введенные значение сторонами треугольника

        Написать программу которая выведет сообщение о том что стороны являются сторонами треуголка
        или это не треугольник

        защита от ошибки
        а = 90
        б = 90
        с = 0
        то это не треугольник
        **/
//
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if((num1 + num2 + num3) == 180  && (num1 != 0 && num2 != 0 && num3 != 0)){
//            System.out.println("Это углы треугольника");
//        }else System.out.println("Это не треугольник");



        /**
        2 задача
        Написать программу которая будет принимать год (1990) со стороны пользователя
        выводить сколько лет исполнилось пользователю
        формат ввода данных 1990 => 32 года \\ 25 лет \\ 21 год
        */
//
//        while (true) { // написан только для того что бы не перезапускать постоянно программу при проверке
//            Scanner sc = new Scanner(System.in);
//
//            int years = sc.nextInt();
//            int age = 2022 - years;
//
//            if (age < 10 || age > 20 && (age % 10 < 5)) {
//                if (age % 10 == 1) {
//                    System.out.println(" Пользователю " + age + " год");
//                } else if (age % 10 == 0) {
//                    System.out.println(" Пользователю " + age + " лет");
//                } else System.out.println(" Пользователю " + age + " года");
//            } else System.out.println(" Пользователю " + age + " лет");
//        }





        /**
        3 задача
        вывести таблицу умножения через цикл (вводных данных нет)
        0 => 10

        0 * 0 = 0              1 * 0 = 0          2 * 0 = 0
        0 * 1 = 0              1 * 1 = 1          2 * 1 = 2
        0 * 2 = 0              1 * 2 = 2          2 * 2 = 4
        0 * 3 = 0              1 * 3 = 3          2 * 3 = 6
        0 * 4 = 0              1 * 4 = 4          2 * 4 = 8
        0 * 5 = 0              1 * 5 = 5          2 * 5 = 10
        0 * 6 = 0              1 * 6 = 6          2 * 6 = 12
        0 * 7 = 0              1 * 7 = 7          2 * 7 = 14
        0 * 8 = 0              1 * 8 = 8          2 * 8 = 16
        0 * 9 = 0              1 * 9 = 9          2 * 9 = 18
        0 * 10 = 0             1 * 10 = 10        2 * 10 = 20
        */

        for (int i = 0; i <= 10 ; i++) {

            System.out.printf("  0 * %d = %d       ", i, i * 0);
            System.out.printf("  1 * %d = %d       ", i, i * 1);
            System.out.printf("  2 * %d = %d       ", i, i * 2);
            System.out.printf("  3 * %d = %d       ", i, i * 3);
            System.out.printf("  4 * %d = %d       ", i, i * 4);
            System.out.printf("  5 * %d = %d       ", i, i * 5);
            System.out.printf("  6 * %d = %d       ", i, i * 6);
            System.out.printf("  7 * %d = %d       ", i, i * 7);
            System.out.printf("  8 * %d = %d       ", i, i * 8);
            System.out.printf("  9 * %d = %d       ", i, i * 9);
            System.out.printf(" 10 * %d = %d      ", i, i * 10);
            System.out.println();

        }


        /**
        4 задача  (Не обязательная)
        Подумать как улучшить калькулятор и что можно добавить в функционал
         */
    }
}
