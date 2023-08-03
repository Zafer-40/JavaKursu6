package Tekrar.Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        int secim = 0;

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        Map<String,String> sozluk = new TreeMap<>();
        do {
            System.out.println("** MENU **");
            System.out.println("1 - KELIME EKLE");
            System.out.println("2 - KELIME DUZELTME");
            System.out.println("3 - KELIMELERI LISTELE");
            System.out.println("4 - KELIME ARAMA");
            System.out.println("5 - KELIME SILME");
            System.out.println("6 - SOZLUKTEN CIKIS");
            System.out.println();
            System.out.print("SECIMINIZI GIRINIZ = ");

            secim = okuInt.nextInt();

            switch (secim){
                case 1 :
                    System.out.print("Kelime Giriniz = ");
                    String kelime = okuStr.nextLine();
                    System.out.print("Anlamini Giriniz = ");
                    String anlami = okuStr.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 2 :
                    System.out.print("Duzeltilecek Kelimeyi Giriniz = ");
                    kelime = okuStr.nextLine();
                    System.out.print("Duzeltilecek Anlami Giriniz = ");
                    anlami = okuStr.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 3 :
                    System.out.println("SOZLUKTEKI KELIMELER");
                    System.out.println();
                    for (Map.Entry<String,String> sk: sozluk.entrySet())
                        System.out.println(sk.getKey()+" : "+sk.getValue());
                    break;
                case 4 :
                    System.out.print("ARANACAK KELIMEYI YAZINIZ = ");
                    kelime = okuStr.nextLine();
                    System.out.println(sozluk.get(kelime));
                    break;
                case 5 :
                    System.out.print("SILINECEK KELIMEYI YAZINIZ = ");
                    kelime = okuStr.nextLine();
                    sozluk.remove(kelime);
                    break;
                case 6 :
                    System.out.println("SOZLUKTEN CIKIlIYOR...");
                    break;
                default:
                    System.out.println("HATALI GIRIS TEKRAR DENEYIN");
            }


        }while (secim <6);

    }
}
