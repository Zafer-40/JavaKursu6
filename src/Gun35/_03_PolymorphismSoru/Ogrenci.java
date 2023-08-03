package Gun35._03_PolymorphismSoru;

public class Ogrenci extends Sicil{
    private String sube;

    public Ogrenci(String ad, String soyad, String gorevi,String sube) {
        super(ad, soyad, gorevi);
        setSube(sube);
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
