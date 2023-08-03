package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Ogrenci> dosya = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci bilgi = new Ogrenci();
            System.out.print("Ogrenci adi = ");
            bilgi.adi = okuStr.nextLine();
            System.out.print("Ogrenci Soyadi = ");
            bilgi.soyadi = okuStr.nextLine();
            System.out.print("Ogrenci Sinifi = ");
            bilgi.sinifi = okuInt.nextInt();
            System.out.print("Ogrenci adresi = ");
            bilgi.adres = okuStr.nextLine();

            dosya.add(bilgi);
        }
        for (Ogrenci yaz : dosya) {
            System.out.println("Ogrenci adi = "+yaz.adi);
            System.out.println("Ogrenci soyadi = "+yaz.soyadi);
            System.out.println("Sinifi = "+yaz.sinifi);
            System.out.println("Ogrenci adresi = "+yaz.adres);

        }




    }
}
