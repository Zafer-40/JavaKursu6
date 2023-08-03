package Gun35._03_PolymorphismSoru;

public class Sicil {
    private String ad;
    private String soyad;
    private String gorevi;

    public static void kimlikBelgesiYazdir(Sicil secilenPersonel){
        System.out.println("\n*** KIMLIK BELGESI ***");
        System.out.println("Adi = "+secilenPersonel.getAd());
        System.out.println("Soyadi = "+secilenPersonel.getSoyad());
        System.out.println("Gorevi = "+secilenPersonel.getGorevi());
        if (secilenPersonel instanceof Calisan)
            System.out.println("Departmani = "+((Calisan)secilenPersonel).getDepartman());
        else System.out.println("Subesi = "+((Ogrenci)secilenPersonel).getSube());

    }

    public Sicil(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
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

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
}
