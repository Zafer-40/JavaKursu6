package Gun35._03_PolymorphismSoru;

public class SoruMain {
    public static void main(String[] args) {
        Ogrenci og1 = new Ogrenci("Ali","Sunal","Nobetci","D");
        Calisan cal1 = new Calisan("Ayse","Dogan","Mudur","Muhasebe");

        Sicil.kimlikBelgesiYazdir(og1);
        Sicil.kimlikBelgesiYazdir(cal1);

    }
}
