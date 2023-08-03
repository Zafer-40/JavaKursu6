package Tekrar.Gun30._01_StaticVariables.Ornek1;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAd = "Yildirim Okulu";

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}

