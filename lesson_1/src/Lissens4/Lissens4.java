package Lissens4;



public class Lissens4 {


    public static void main(String[] args) {
        int count = 0;
//        print ( count );

        count = number ( count );
    }

    public static void print (int num){
        System.out.println ("Вошел в процедуру " + num );
        num += 1;
        if(num < 100) {
            print ( num );
        }
    }

    public static int number(int num){ // 0, 1, 2... 100

        System.out.println ("Зашол в функцию " + num );
        if(num == 100){
            return num;
        }
       num = number ( num  + 1);// 1, 2... 100

        System.out.println ("Вышел из функции "  + num);
        return num + 1;

    }






}
