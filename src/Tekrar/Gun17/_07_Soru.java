package Tekrar.Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int[] array = new int[10];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 11);


        }
        System.out.println(Arrays.toString(array));

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (sayi == array[i])
                System.out.println("Sayi var indexi = " + i);


        }
    }
}


