package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {

        //Ogrenci ogr1 = new Ogrenci("Ismet" , "Temur" ,"Yildirim ilkokulu");
        //Ogrenci ogr2 = new Ogrenci("Can" , "Bonomo" ,"Yildirim ilkokulu");
        //Ogrenci ogr3 = new Ogrenci("yildiz" , "tilbe" ,"Yildirim ilkokulu");

        Ogrenci ogr1 = new Ogrenci("Cem","Yilmaz");
        Ogrenci ogr2 = new Ogrenci("Adnan","Senses");
        System.out.println("Ogrenci 1 = "+ogr1);
        System.out.println("Ogrenci 2 = "+ogr2);
        System.out.println();

        Ogrenci.okulAd = "Ataturk ilkokulu";
        System.out.println("Ogrenci 1 tekrar = "+ogr1);
        System.out.println("Ogrenci 2 tekrar = "+ogr2);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

    }
}
