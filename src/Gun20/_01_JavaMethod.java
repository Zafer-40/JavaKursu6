package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+".Sayiyi giriniz = ");
            dizi[i]= oku.nextInt();
        }
            System.out.println(Arrays.toString(dizi));

            enBuyukYaz(dizi);
            enKucukYaz(dizi);
            ortalamaYaz(dizi);



        }

         public static void enBuyukYaz(int[] dizi){
        Arrays.sort(dizi);
             System.out.println("Dizinin siralanmis hali ="+Arrays.toString(dizi));
             System.out.println("En buyuk sayi = "+dizi[dizi.length-1]);

        }
        public static void enKucukYaz(int[] dizi){
        Arrays.sort(dizi);
            System.out.println("En kucuk sayi = "+dizi[0]);
        }
        public static void ortalamaYaz(int[] dizi){
        double toplam = 0;
            for (int i = 0; i < dizi.length; i++) {
                toplam+=dizi[i];
            }
            double ortalama = toplam/ dizi.length;
            System.out.println("Sayilarin ortalamasi = "+ortalama);
        }

    }

