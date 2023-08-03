package Gun30._02_FinalVariables.Ornek1;

import Gun30._01_StaticVariables.Ornek2.Student;

public class School {
    public static void main(String[] args) {

        Student ogr1 = new Student(1,"Mehmet Yilmaz");
        Student ogr2 = new Student(2,"Demet Akbag");
        Student ogr3 = new Student(3,"Yilmaz Vural");
        //Problem : hem id yi takip etmek zorundayim
        //hemde hata olasiligi yuksek


        Student ogr10 = new Student("Cagla Demir");
        Student ogr11 = new Student("Bulent Akbas");
        Student ogr12 = new Student("Can Bonomo");

        System.out.println("Ogrenci 10 = "+ogr10);
        System.out.println("Ogrenci 11 = "+ogr11);
        System.out.println("Ogrenci 12 = "+ogr12);

        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da



    }
}
