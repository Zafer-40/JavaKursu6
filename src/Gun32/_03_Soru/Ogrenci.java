package Gun32._03_Soru;

public class Ogrenci {
    private int id;
    private String ad;
    private String soyad;
    private int yas;

    private static int sayacID = 1;

    public Ogrenci(String ad, String soyad, int yas) {
        //this.ad = ad;
        //this.soyad = soyad;
        //this.yas = yas;
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);

        this.id = sayacID++;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return  "Ogrenci ID = " + this.id + " " +
                "Ad = " + this.ad + " " +
                "Soyad = " + this.soyad + " "+
                "Yas = " + this.yas ;
    }
}
