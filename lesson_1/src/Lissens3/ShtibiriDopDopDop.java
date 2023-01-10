package Lissens3;

public class ShtibiriDopDopDop {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int shtibdibcount = 0;
            int MainNum = i;
            int MainSum = 0;
            for (int j = i; j > 0; j /= 10) {
                shtibdibcount++;
            }
            int[] numArray = new int[shtibdibcount];
            int Shtozahren = MainNum;

            for (int j = 0; j < numArray.length; j++) {

                numArray[numArray.length - 1 - j] = Shtozahren % 10;
                Shtozahren = Shtozahren / 10;
            }

            for (int j = 0; j < numArray.length; j++) {
                int SumNumberArrays = 1;

                for (int k = 0; k < numArray.length; k++) {
                    SumNumberArrays = SumNumberArrays * numArray[j];
                }

                MainSum = MainSum + SumNumberArrays;

            }

            if (i == MainSum){
                System.out.println("Число армстронга: " + i);
            }


        }
    }
}
