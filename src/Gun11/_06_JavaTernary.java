package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        // olduğunu Ternary operatör ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();

        String sonuc = (sayi==0) ? "Sifir" : (sayi<0) ? "Negatif" : "Pozitif";
        System.out.println("Girilen Sayi = " +sonuc);
    }
}
