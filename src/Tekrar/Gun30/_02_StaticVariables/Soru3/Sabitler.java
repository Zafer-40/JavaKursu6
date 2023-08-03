package Tekrar.Gun30._02_StaticVariables.Soru3;

public class Sabitler {
    public final static int gundekiSaat = 24;
    public final static int saatekiDakika = 60;
    public final static int dakikadakiSaniye = 60;

    public static int hesaplama(int gun, int saat, int dakika) {
        int toplamSaniye =
                gun
                *Sabitler.gundekiSaat
                *Sabitler.saatekiDakika
                *Sabitler.dakikadakiSaniye +
                saat
                *Sabitler.saatekiDakika
                *Sabitler.dakikadakiSaniye+
                dakika
                *Sabitler.dakikadakiSaniye;
        return toplamSaniye;
    }
}
