package Tekrar.Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.

        int[][] array2d = new int[2][3];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {

                array2d[i][j] = (int) (Math.random()*10);

                System.out.print(array2d[i][j]+ " ");
            }
            System.out.println();

        }
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {

                if (array2d[i][j] == sayi)
                    System.out.println("Evet var Satir = "+i+" Sutun = "+j);

            }
        }

    }

}


