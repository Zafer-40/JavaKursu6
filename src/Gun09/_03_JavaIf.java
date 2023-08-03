package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayiyi giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("2.sayiyi giriniz = ");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Buyuk olan sayi = " + sayi1);
        }
        if (sayi2 > sayi1) {
            System.out.println("Buyuk olan sayi = " + sayi2);
        }
        if (sayi1 == sayi2) {
            System.out.println("Girilen sayilar esittir !");
        }
    }
}
