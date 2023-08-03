package z_oop_Soru_02;

public class Karakter {
    private String ad;
    private String seviye;
    private int saglik;

    public Karakter(String ad, String seviye, int saglik) {
        this.ad = ad;
        this.seviye = seviye;
        this.saglik = saglik;
    }

    public void bilgileriYazdir(){
        System.out.println("Adi :"+ad);
        System.out.println("Seviyesi :"+seviye);
        System.out.println("Saglik Puani :"+saglik);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSeviye() {
        return seviye;
    }

    public void setSeviye(String seviye) {
        this.seviye = seviye;
    }

    public int getSaglik() {
        return saglik;
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }
}
