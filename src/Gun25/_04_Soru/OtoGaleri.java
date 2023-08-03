package Gun25._04_Soru;

import Gun25._03_Ornek.Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {
    public static void main(String[] args) {
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Arabalar> cars = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            Arabalar bilgi = new Arabalar();
            System.out.print("Araba no = ");
            bilgi.arabaNo = okuInt.nextInt();
            System.out.print("Araba marka = ");
            bilgi.marka = okuStr.nextLine();
            System.out.print("Uretim Yili = ");
            bilgi.uretimYili = okuInt.nextInt();

            cars.add(bilgi);
            System.out.println();
        }
        arabalarYazdir(cars);
        uretimOrtalamasiYazdir(cars);

        }
    public static void arabalarYazdir(ArrayList<Arabalar> cars ){

        for (Arabalar a : cars)
            System.out.println(a.arabaNo+" "+a.marka+" "+a.uretimYili);

    }
    public static void uretimOrtalamasiYazdir(ArrayList<Arabalar> cars){
        int toplamYil = 0;
        for (Arabalar b : cars)
            toplamYil = toplamYil+b.uretimYili;

        int ortalama = toplamYil / cars.size();
        System.out.println("Ortalama yil = "+ortalama);



    }
}

