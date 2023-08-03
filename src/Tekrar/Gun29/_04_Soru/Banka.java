package Tekrar.Gun29._04_Soru;

public class Banka {
    public static void main(String[] args) {

        Musteri mus1 = new Musteri();
        mus1.ad = "Can";
        mus1.soyad = "Bonomo";
        mus1.musteriNo = 567890;

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);
        System.out.println(mus1.musteriHesap.toString());


    }
}
