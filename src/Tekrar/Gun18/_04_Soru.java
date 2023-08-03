package Tekrar.Gun18;

import java.util.Arrays;

public class _04_Soru {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int [][] arrays2d = new int[2][3];
        int tekSayac = 0;

        for (int i = 0; i < arrays2d.length; i++) {
            for (int j = 0; j < arrays2d[i].length; j++) {

                arrays2d[i][j] = (int)(Math.random()*100);
                System.out.print(arrays2d[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arrays2d.length; i++) {
            for (int j = 0; j < arrays2d[i].length; j++) {
                if (arrays2d[i][j] % 2 == 1)
                    tekSayac++;

            }
        }
        System.out.println("Tek sayilarin adeti = "+tekSayac);

    }
}
