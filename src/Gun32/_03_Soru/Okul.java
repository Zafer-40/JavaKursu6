package Gun32._03_Soru;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontenjan;

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();



    public Okul(String okulAd, int kontenjan) {
        this.okulAd = okulAd;
        this.kontenjan = kontenjan;

    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
