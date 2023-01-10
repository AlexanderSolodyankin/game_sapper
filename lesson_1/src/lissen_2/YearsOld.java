package lissen_2;

import java.util.Date;
import java.util.Scanner;

public class YearsOld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearOfBirth = scan.nextInt();
        int yearsOld = (new Date()).getYear() + 1900 - yearOfBirth;
        System.out.println(new Date().getYear());
        int ldt = yearsOld % 10;
        int pld = yearsOld / 10 % 10;
        if (pld == 1) {
            System.out.print(yearsOld + " лет");
        }
        else {
            switch (ldt) {
                case 1:
                    System.out.print(yearsOld + " год");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(yearsOld + " года");
                    break;
                default:
                    System.out.print(yearsOld + " лет");
            }
        }
    }
}