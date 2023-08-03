package Gun26._02_Ornek;

public class Sirket {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- adim : yazdiriniz
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.

        Person personel1 = new Person();

        personel1.name = "Ahmet";
        personel1.surName = "Demir";
        personel1.age = 38;

        Person personel2 = new Person();

        personel2.name = "Mehmet";
        personel2.surName = "Durmaz";
        personel2.age = 26;

        //3. yol
        BilgiYazdir(personel1);
        BilgiYazdir(personel2);


        // 1. yazdirma yontemi
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

        //2.yontem
        System.out.println("Personel bir = "+personel1);
        System.out.println("Personel iki = "+personel2);

        personel1.getBirthYear();
        personel2.getBirthYear();

        System.out.println("Personel 1 Dogum yili = "+personel1.getBirthYear2());
        System.out.println("Personel 2 Dogum yili = "+personel2.getBirthYear2());

    }
    //3. yontem
public static void BilgiYazdir (Person text){
    System.out.println("Adi = "+text.name);
    System.out.println("Soyadi = "+text.surName);
    System.out.println("Yasi = "+text.age);
}



    }


