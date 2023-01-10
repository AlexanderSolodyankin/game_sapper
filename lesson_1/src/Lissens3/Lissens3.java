package Lissens3;

import java.util.Random;
import java.util.Scanner;

public class Lissens3 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random ran = new Random();
//        int max = 100;
//        int min = 10;
//        /**
//         * Массив это совокупность однотипных переменных которые хоронятся  под одним именем
//         */
//
//        int[] nums = new int[1];
//        int actionsNum = 0;
//        String[] arraySimbol = new String[1];
//
//        while (true){
//            System.out.print("Введите число: ");
//            nums[actionsNum] = scan.nextInt();
//            int[] newNums = new int[nums.length + 1]; // создали новый массив
//            for (int i = 0; i < nums.length; i++) {
//                newNums[i] = nums[i]; // Сохраняем все данный из старого массива в новый
//            }
//            nums = newNums; // перезаписываем старый массив новым который на одну ячейку бульше
//            System.out.print("Введите действие: ");
//            arraySimbol[actionsNum] = new Scanner(System.in).nextLine();
//            if(arraySimbol[actionsNum].equals("="))break;
//            String[] newSimbols = new String[arraySimbol.length + 1];
//            for (int i = 0; i < arraySimbol.length; i++) {
//                newSimbols[i] = arraySimbol[i];
//            }
//            arraySimbol = newSimbols;
//            actionsNum++;
//        }
//
//        double answer = nums[0];
//        for (int i = 0; i < arraySimbol.length; i++) {
//
//            // Продумать логику чтобы функции примера решались правильно (Математик закон)
//
//            if(arraySimbol[i].equals("+")){
//                answer = answer + nums[i];
//            }
//            if(arraySimbol[i].equals("-")){
//                answer = answer - nums[i];
//            }
//            if(arraySimbol[i].equals("*")){
//                answer = answer * nums[i];
//            }
//            if(arraySimbol[i].equals("/")){
//                answer = answer / nums[i];
//            }
//
//
//        }
//
//        System.out.println(answer);


        // 2 Задачка Создать массив с случайным размером и вывести все значение которые кратны 3-м
        // и произвести их сумму
        // после отнять от всей суммы всех значений в массиве и вывести разницу
        // Вывести все значения из массива

        // 3 решить задачку по числу Армстронга

        // 4 Имеем грузовик который в себя вмещает 2450 кг яблок
        // Мы имеем 3 вида коробок в которые упакованы яблоки (они запечатаны их вскрывать нельзя)
        // маленькая коробка весит 15 кг
        // средняя коробка весит 18 кг
        // большая коробка весит 23 кг
        // найти количество возможных вариантов загрузки коробок в машину
        /*
            МальКороб = 15шт    средКороб = 5 шт  БольКороб = 1шт
         */

        int[][] numses = new int[3][3];

        for (int i = 0; i < numses.length; i++) {
            for (int j = 0; j < numses[i].length; j++) {
                numses[i][j] = 12;
            }

        }

        for (int i = 0; i < numses.length; i++) {
            for (int j = 0; j < numses[i].length; j++) {
                System.out.print(numses[i][j] + " ");
            }
            System.out.println();
        }


        // Создать одномерный массив и заложить в него случайные числа
        // рассортировать все числа по возрастанию
        // Почитай или поищи информацию насчет сортировки массивов (Метод трех стаканов, Пузырьковая сортировка)
        // Тоже самое повторить на двухмерный массив

    }
}
