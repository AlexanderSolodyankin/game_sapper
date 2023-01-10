package Lissens3;

public class VeryBigCar {
    public static void main(String[] args) {
        int car = 2450;
        int MiniBox = 15;
        int MediumBox =  18;
        int VeryBigBox = 23;
        int num = 0;

        for (int i = 0; i < car/MiniBox; i++) {
            for (int j = 0; j < car/MediumBox; j++) {
                for (int k = 0; k < car/VeryBigBox; k++) {
                    num = (MiniBox * i) + (MediumBox * j) + (VeryBigBox * k);
                    if (num == car){
                        System.out.println("В машину поместится: ");
                        System.out.println("Маленьких коробок--> " + i + "штук");
                        System.out.println("Средних коробок--> " + j + "штук");
                        System.out.println("Больших коробок--> " + k + "штук");
                    }
                }
            }
        }
    }
}
