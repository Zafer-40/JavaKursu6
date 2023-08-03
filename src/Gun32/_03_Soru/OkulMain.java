package Gun32._03_Soru;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        Okul yeniOkul = new Okul("Ataturk Lisesi",3);


        do {
            System.out.print("Ogrenci Adi = ");
            String ad = okuStr.nextLine();
            System.out.print("Ogrenci Soyadi = ");
            String soyad = okuStr.nextLine();
            System.out.print("Ogrenci Yasi = ");
            int yas = okuInt.nextInt();
            if (yas < 15){
            Ogrenci ogr = new Ogrenci(ad,soyad,yas);
            yeniOkul.getOgrenciler().add(ogr);
            }else {
                System.out.println("Ogrenci yasi kayit icin uygun DEGIL!!");
            }

        }while (yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan());

        System.out.println("Ogrenci Listesi = "+yeniOkul.getOgrenciler());




    }
}
