package JavaOdevler.JavaOdev15;

import java.util.ArrayList;
import java.util.Scanner;

public class NotDefteri {
    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Ogrenci> ogrenciEkle = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Ogrenci bilgi = new Ogrenci();

            System.out.print("Okul No = ");
            bilgi.okulNo = okuInt.nextInt();
            System.out.print("Adi ve Soyadi = ");
            bilgi.tamAdi = okuStr.nextLine();
            System.out.print("Ders Notu = ");
            bilgi.not = okuInt.nextInt();

            ogrenciEkle.add(bilgi);
            System.out.println();


        }
        ogrencileriYaz(ogrenciEkle);
        notOrtalamasiYaz(ogrenciEkle);
    }
    public static void ogrencileriYaz(ArrayList<Ogrenci> ogrenciEkle){
        for (Ogrenci a:ogrenciEkle) {
            System.out.println(a.okulNo+" "+a.tamAdi+" "+a.not);

        }
    }
    public static void notOrtalamasiYaz(ArrayList<Ogrenci> ogrenciEkle){
        double toplamNot = 0;
        for (Ogrenci b : ogrenciEkle)
            toplamNot+=b.not;

        double ortalama = toplamNot / ogrenciEkle.size();
        System.out.println("Ortalama not = "+ortalama);

    }

}
