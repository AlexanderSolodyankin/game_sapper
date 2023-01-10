package lissen_1;

import java.util.Scanner;

public class HomeWorks_Lissens1 {
    public static void main(String... args) {
        /**
         * Задача 1
         * Ввести три значение с клавиатуры и вывести в виде ответа:
         * сумму чисел,
         * произведение чисел,
         * среднее арифметическое
         */

        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//
//        System.out.println("Сумма чисел: " + (num1 + num2 + num3));
//        System.out.println("Произведение чисел: " + (num1 * num2 * num3));
////        System.out.println("Среднее Арифметическое значение : " + (double)((num1 + num2 + num3) / 3.0));
//        System.out.printf("Среднее Арифметическое значение : %.2f", (double)((num1 + num2 + num3) / 3.0));


        /**
         * Написать программу которая будет конвертировать температуру из градусов цельсия в фаренгейт
         */

//        double celsia = scan.nextDouble();
//        double farengeit = (9.0 / 5.0)  * celsia + 32;
//        System.out.println("Градусы фаренгейт: " + farengeit);


        /**
         * Написать программу которая принимает трехзначное число из клавиатуры и выводит его цифры через запятую
         */

//        int num = scan.nextInt();
//        int unit = num % 10;
//        int hundr = num / 100;
//        num = num / 10;
//        int decan =  num % 10;
//
//        System.out.println(hundr + ", " + decan + ", " + unit);

        /**
         *   Вывести ответ математического выражения
         *                          e
         *      (a + b) * c + d *  --
         *                         f       4
         *      --------------------- *   --
         *                 b               5
         *       k + p *  --  + g
         *                 a
         */

        double a, b, c, d, e, f,k, p,g;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        k = 1.1;
        p = 1.2;
        g = 1.3;
        double up = (a + b) * c + d * (e / f);
        double down = k + p * (b / a) + g;
        double answ = (up / down) * (4.0 / 5.0);
        System.out.printf("%.3f",answ);
    }
}
