package Gun12;

import java.util.Scanner;

public class _04_ifElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayiyi giriniz = ");
        int sayi2 = oku.nextInt();


        System.out.println("Toplama icin T = ");
        System.out.println("Cikartma icin C = ");
        System.out.println("Carpma icin P = ");
        System.out.println("Bolme icin B = ");
        System.out.print("Seciminiz = ");
        String secim = str.next();



        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam = "+(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("C"))
            System.out.println("Cikartma = "+(sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                System.out.println("Carpma = "+(sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                    System.out.println("Bolme = "+(sayi1/sayi2));
                    else
                        System.out.println("Hatali Giris Yaptiniz");


    }
}
