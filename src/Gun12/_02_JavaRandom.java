package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi sinirini giriniz = ");
        int sayiSiniri = oku.nextInt();

        int rndSayi = (int) (Math.random()*sayiSiniri);


        System.out.print("Tahmininizi giriniz = ");
        int tahmin = oku.nextInt();

        if (rndSayi == tahmin)
            System.out.println("Tebrikler dogru tahmin");
        else
            System.out.println("Bilemediniz random sayi = "+rndSayi);
    }
}
