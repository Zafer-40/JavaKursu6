package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        int uzunluk = cumle.length();
        if ((uzunluk>10) && cumle.toLowerCase().contains("study")) {
            System.out.println("EVET uygundur");
        }else {
            System.out.println("HAYIR uygun degildir");
        }


    }
}
