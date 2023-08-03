package Tekrar.Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();
        double toplam = 0;
        String secim = "";

        do {
            System.out.print("Notu giriniz = ");
            int not = okuInt.nextInt();

            notlar.add(not);

            toplam += not;

            System.out.print("Baska not eklemek istermisiniz E/H =");
            secim = okuStr.nextLine();



        }while (secim.equalsIgnoreCase("E"));

        for (int i = 0; i < notlar.size(); i++) {

            System.out.println("Ogrenci notlari = "+notlar.get(i));
        }

        double ortalama = toplam / notlar.size();
        int ortGecen = 0;

        System.out.println("Not ortalamasi = "+ortalama);

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ortalama)
                ortGecen++;
        }
        System.out.println("Ortalamayi gecen ogrenci sayisi = "+ortGecen);









    }
}
