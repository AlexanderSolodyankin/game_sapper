package lissen_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите значен ия стороны (а): ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Введите значен ия стороны (b): ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Введите значен ия стороны (c): ");
        int c = new Scanner(System.in).nextInt();
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}