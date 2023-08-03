package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int [][] dizi = new int[3][2];
        Scanner oku = new Scanner(System.in);
        int tekSayi=0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {

                System.out.print("Dizi icin sayi giriniz = ");
                dizi[i][j]= oku.nextInt();
                if (dizi[i][j]%2==1)
                    tekSayi++;
            }
        }
        int[] tekler = new int[tekSayi];

        int teklerIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {

                if (dizi[i][j]%2==1){
                    tekler[teklerIndex]=dizi[i][j];
                    teklerIndex++;
                }

            }

        }
        System.out.println(Arrays.toString(tekler));
    }
}
