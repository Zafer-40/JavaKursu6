package Tekrar.Gun30._02_StaticVariables.Soru3;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {
        //1.YONTEM
        int cevap = Sabitler.hesaplama(1,1,1);
        System.out.println("Sorunun Cevabi = "+cevap);

        //2.YONTEM

        Scanner oku = new Scanner(System.in);
        int gun = 0;
        int saat = 0;
        int dakika = 0;

        System.out.print("Gun giriniz = ");
        gun= oku.nextInt();
        System.out.print("Saat giriniz = ");
        saat= oku.nextInt();
        System.out.print("Dakika giriniz = ");
        dakika= oku.nextInt();

        int toplamSaniye =
        gun*Sabitler.gundekiSaat*Sabitler.saatekiDakika*Sabitler.dakikadakiSaniye
                +
        saat*Sabitler.saatekiDakika*Sabitler.dakikadakiSaniye
                +
        dakika*Sabitler.dakikadakiSaniye;

        System.out.println("Toplam Saniye = "+toplamSaniye);


    }
}
