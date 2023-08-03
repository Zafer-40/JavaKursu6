package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        double toplam = 0;
        String cevap;


        do {
            System.out.print("Not giriniz = ");
            int not = okuInt.nextInt();
            notlar.add(not);
            toplam+=not;

            System.out.print("Devam Etmek istiyor musunuz? (E/H)= ");
            cevap= okuStr.nextLine();

        } while (cevap.equalsIgnoreCase("E")); // dongunun devam sarti burasi

        double ortalama = toplam / notlar.size();

        System.out.println("Notlarin Ortalamasi = "+ortalama);

        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) >= ortalama)
                gecenSayisi++;
        }
        System.out.println("Gecen Ogrenci Sayisi = "+gecenSayisi);


        {
        }
    }
}

