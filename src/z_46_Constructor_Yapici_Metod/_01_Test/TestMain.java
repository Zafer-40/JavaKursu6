package z_46_Constructor_Yapici_Metod._01_Test;

import z_45_ClassdanObjeReferansOlusturma._02_Test.Ogrenci1;
import z_46_Constructor_Yapici_Metod._02_Test.Ogrenci;

public class TestMain {
    public static void main(String[] args) {

        //Ogrenci (SINIFIN ADI) ogrenci1 (REFERANSIN ADI) = new Ogrenci() CONSTRUCTIR BOLUMU);
       Ogrenci ogrenci1 = new Ogrenci(7,"Ahmet" , "Cansoy");
        //ogrenci1.id = 5;
        //ogrenci1.isim = "Enes";
        //ogrenci1.soyisim = "Bayram";

        System.out.println("Ogrenci ID = "+ogrenci1.id);
        System.out.println("Ogreci adi = "+ogrenci1.isim);
        System.out.println("Ogrenci soyisim = "+ogrenci1.soyisim);




    }
}
