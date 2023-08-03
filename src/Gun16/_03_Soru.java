package Gun16;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.


        int[] notlar = new int[3];

        Scanner oku = new Scanner(System.in);
        int toplam=0;
        int gecenler = 0;

        for (int i = 0; i < notlar.length; i++) {

            System.out.print((i + 1) + ". Notu Giriniz = ");
            notlar[i] = oku.nextInt();

            toplam = toplam + notlar[i];
        }
            double ortalama = toplam / notlar.length;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] >= ortalama){
                System.out.println("Ortalamayi gecen notlar = "+notlar[i]);
                gecenler++;
            }
        }

        System.out.println("Ortalama Not = "+ortalama);
        System.out.println("Ortalamayi gecen ogrenci sayisi = "+gecenler);

    }
}
