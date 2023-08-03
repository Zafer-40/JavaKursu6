package Gun28._01_Ornek;

public class Okul {
    public static void main(String[] args) {

        //1.yol
    Ogrenci ogr1 = new Ogrenci();
    ogr1.id = 1;
    ogr1.ad = "Zafer";
    ogr1.soyad = "Soyad";
    ogr1.sinif = 6;

    System.out.println("1.yontem Ogrenci adi ="+ogr1.ad);


    //2.yol
        Ogrenci ogr2 = new Ogrenci(2,"Mehmet","Yilmaz" , 7);

        System.out.println("2. yontem Ogrenci adi = "+ogr2.ad);

        //3.yol

        Ogrenci ogr3 = new Ogrenci(3,"Ayse" , "Demir");

        System.out.println("3.yontem Ogrenci adi = "+ogr3.ad);
        System.out.println("3.yontem Ogrenci sinifi = "+ogr3.sinif);


    }
}
