package Gun28._01_Ornek;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    public Ogrenci(){
        System.out.println("Nesne olusturuldu");
    }
    // yapici metodlar : constructor metodlar
    public Ogrenci(int id , String ad , String soyad , int sinif){

        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }
    // yapici metodlar : constructor metodlar
    public Ogrenci(int id , String ad , String soyad ){

        this(id,ad,soyad,0);
    }


}


