package Gun30._04_Soru;

public class Sabitler {

    final static int gunSaat = 24;
    final static int saatDakika = 60;
    final static int dakikaSaniye = 60;

    public static int hesapla(int gun,int saat,int dak){
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
        return toplamSaniye;
    }
}

