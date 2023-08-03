package Tekrar.Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {
//        Ogrenci ogr1 = new Ogrenci("ismet", "temur", "Yıldırım İlkokulu");
//        Ogrenci ogr2 = new Ogrenci("Serkan", "Şengül", "Yıldırım İlkokulu");
//        Ogrenci ogr3 = new Ogrenci("Elif", "Özen", "Yıldırım İlkokulu");
//
//        //...
//        //...
//        Ogrenci ogr499=new Ogrenci("Senol","Doğan","Yıldırım İlkokulu");
//        Ogrenci ogr500=new Ogrenci("Murat","Savluk","Yıldırım İlkokulu");


        Ogrenci ogr1 = new Ogrenci("Can" , "bonomo");
        System.out.println("1.Ogrenci = "+ogr1);

        Ogrenci.okulAd = "Ataturk Lisesi";
        System.out.println("Ogrenci yeni Liseli = "+ogr1);

        //AYNI VERININ YANI yildirim ilkokulunun SUREKLI TEKRARLANMASI
        //ENGELLENDI

    }

}
