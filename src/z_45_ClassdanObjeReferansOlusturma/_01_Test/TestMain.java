package z_45_ClassdanObjeReferansOlusturma._01_Test;

import z_45_ClassdanObjeReferansOlusturma._02_Test.Ogrenci1;

public class TestMain {
    public static void main(String[] args) {
        Ogrenci1 ogrenci1 = new Ogrenci1();
        ogrenci1.id = 5;
        ogrenci1.isim = "Enes";
        ogrenci1.soyisim = "Bayram";

        System.out.println("Ogrenci ID = "+ogrenci1.id);
        System.out.println("Ogreci adi = "+ogrenci1.isim);
        System.out.println("Ogrenci soyisim = "+ogrenci1.soyisim);


    }
}
