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
//         * ������ ��� ������������ ���������� ���������� ������� ���������  ��� ����� ������
//         */
//
//        int[] nums = new int[1];
//        int actionsNum = 0;
//        String[] arraySimbol = new String[1];
//
//        while (true){
//            System.out.print("������� �����: ");
//            nums[actionsNum] = scan.nextInt();
//            int[] newNums = new int[nums.length + 1]; // ������� ����� ������
//            for (int i = 0; i < nums.length; i++) {
//                newNums[i] = nums[i]; // ��������� ��� ������ �� ������� ������� � �����
//            }
//            nums = newNums; // �������������� ������ ������ ����� ������� �� ���� ������ ������
//            System.out.print("������� ��������: ");
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
//            // ��������� ������ ����� ������� ������� �������� ��������� (��������� �����)
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


        // 2 ������� ������� ������ � ��������� �������� � ������� ��� �������� ������� ������ 3-�
        // � ���������� �� �����
        // ����� ������ �� ���� ����� ���� �������� � ������� � ������� �������
        // ������� ��� �������� �� �������

        // 3 ������ ������� �� ����� ����������

        // 4 ����� �������� ������� � ���� ������� 2450 �� �����
        // �� ����� 3 ���� ������� � ������� ��������� ������ (��� ���������� �� ��������� ������)
        // ��������� ������� ����� 15 ��
        // ������� ������� ����� 18 ��
        // ������� ������� ����� 23 ��
        // ����� ���������� ��������� ��������� �������� ������� � ������
        /*
            ��������� = 15��    ��������� = 5 ��  ��������� = 1��
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


        // ������� ���������� ������ � �������� � ���� ��������� �����
        // �������������� ��� ����� �� �����������
        // ������� ��� ����� ���������� ������ ���������� �������� (����� ���� ��������, ����������� ����������)
        // ���� ����� ��������� �� ���������� ������

    }
}
