package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // kullanicinin girecegi sayinin tek mi cift mi oldugunu yazidiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        String sonuc = (sayi%2==0) ? "Sayi CIFTTIR" : "Sayi TEKTIR" ;
        System.out.println(sonuc);
    }
}
