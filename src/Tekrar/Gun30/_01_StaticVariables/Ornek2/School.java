package Tekrar.Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1 = new Student(1,"Can Bonomo");
        Student ogr2 = new Student(2,"Yildiz Tilbe");
        Student ogr3 = new Student(3,"Ahmet Demir");
        //PROBLEM ID YI TAKIP ETMEK ZOR VE HATAYI ARTIRIR

        Student ogr10 = new Student("Cem yilmaz");
        Student ogr11 = new Student("Ediz Hun");

        System.out.println("Ogrenciler = "+ogr10);
        System.out.println("Ogrenciler = "+ogr11);


    }
}
