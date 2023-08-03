package Gun32._01_Encapsulation;

public class Kisi {

    private String ad;//25 KARAKTER SINIRI
    private String soyad;//25 KARAKTER SINIRI
    private int yas;

    public void yasAta(int yas){
    if (yas<0){
        System.out.println("Hatali Giris ");
    }else
        this.yas = yas;
    }
    public void setAd(String ad){
        if (ad.length() < 25)
            this.ad = ad;
        else System.out.println("Hatali giris");
    }
    public void setSoyad(String soyad){
        if (soyad.length() < 25)
            this.soyad = soyad;
        else System.out.println("Hatali Giris");
    }
    public int yasVer(){
        return this.yas;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public String getAd(){
        return this.ad;
    }
}
