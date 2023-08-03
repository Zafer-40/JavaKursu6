package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1001;
        ogr1.ad = "Hakan";
        ogr1.soyad = "Fidan";

        ogr1.okul = new Okul();

        ogr1.okul.okulAd = "Bayrak okulu";
        ogr1.okul.okulMudurAd = "Mehmet Bey";
        ogr1.okul.adres = "Umreniye Istanbul";

        System.out.println("Ogrenci adi = "+ogr1.ad);
        System.out.println("Okul adi = "+ogr1.okul.okulAd);

    }
}
