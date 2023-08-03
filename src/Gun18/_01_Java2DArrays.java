package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int [][] tumDersNotlari = new int[3][50];// 3 tane 50 lik sayi tanimlanabilir

        tumDersNotlari[0][0] = 80;// 2 indexle gosterilir tablonun ilk elemani

        System.out.println("0 inci satirin 0 inci sutunu = " +tumDersNotlari[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();


    }
}
