package Gun30._04_Soru;

import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {

        int gun = 0;
        int saat = 0;
        int dak = 0;

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun = "); gun = oku.nextInt();
        System.out.print("Saat = "); saat = oku.nextInt();
        System.out.print("Dakika = "); dak = oku.nextInt();

        int toplamSaniye =
                gun
                *Sabitler.gunSaat
                *Sabitler.saatDakika
                *Sabitler.dakikaSaniye
                +
                saat
                *Sabitler.saatDakika
                *Sabitler.dakikaSaniye
                +
                dak
                *Sabitler.dakikaSaniye;
        System.out.println("Toplam Saniye = "+toplamSaniye);

        //2.YONTEM

        System.out.print("Toplam Saniye = "+Sabitler.hesapla(gun,saat,dak));



    }
}
