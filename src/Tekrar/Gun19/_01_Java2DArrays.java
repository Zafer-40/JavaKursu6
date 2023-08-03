package Tekrar.Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][] array2D = new int[3][2];
        Scanner oku = new Scanner(System.in);
        int tekSayilar = 0;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {

                System.out.print("Sayi giriniz = ");
                array2D[i][j] = oku.nextInt();

                if (array2D[i][j] % 2 == 1)
                    tekSayilar++;

            }

        }

        int[] array = new int[tekSayilar];
        int teklerIndex = 0;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {

                if (array2D[i][j] % 2 == 1) {

                    array[teklerIndex] = array2D[i][j];
                    teklerIndex++;

                }
            }
        }
        System.out.println("Tek sayilardan olusan Array = " + Arrays.toString(array));
    }
}
