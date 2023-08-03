package Gun25;

// class tiplerinin tanimlandigi yer

public class _01_JavaClassAndObject {

    // metodlarin yazilabildigi yer
    public static void main(String[] args) {
        // ana programin calistigi yer
    Ogrenci ogr1 = new Ogrenci();

    ogr1.okuNo = 1001;
    ogr1.adi = "Ahmet";
    ogr1.soyadi = "Yilmaz";
    ogr1.adresi = "Cekmekoy istanbul";
    ogr1.telefonu = "055544444";
    ogr1.sinifi = 6;

        System.out.println("Ogrenci adi = "+ogr1.adi);
        System.out.println("Ogrenci Soyadi = "+ogr1.soyadi);

    }
    // metodlarin yazilabildigi yer
}
// class tiplerinin tanimlandigi yer

    class Ogrenci{
    int okuNo;
    String adi;
    String soyadi;
    int sinifi;
    String adresi;
    String telefonu;
    }
