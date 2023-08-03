package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
    // kullaniciya ogrencimisiniz diye sorunuz evet ise True degil ise false cevabi veriniz ve yazidirniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Ogrenci misiniz? = ");
        boolean cevap = oku.nextBoolean();

        System.out.println("Cevap = " + cevap);

    }
}
