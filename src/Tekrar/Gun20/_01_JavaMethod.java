package Tekrar.Gun20;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] array = new int[5];
        Scanner oku = new Scanner(System.in);




        for (int i = 0; i < array.length; i++) {
            System.out.print("Sayi giriniz = ");
            array[i] = oku.nextInt();
        }
        enBuyukYaz(array);
        enKucukYaz(array);
        ortalamaYaz(array);
    }
    public static void enBuyukYaz(int[] array){
        int enBuyuk = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > enBuyuk)
                enBuyuk=array[i];
        }
        System.out.println("En buyuk sayi = "+enBuyuk);
    }
    public static void enKucukYaz(int[] array){
        int enKucuk = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < enKucuk)
                enKucuk = array[i];
        }
        System.out.println("En kucuk sayi = "+enKucuk);

    }
    public static void ortalamaYaz(int [] array){
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        int ortalama = toplam / array.length;
        System.out.println("Dizinin ortalamasi = "+ortalama);
    }

}
