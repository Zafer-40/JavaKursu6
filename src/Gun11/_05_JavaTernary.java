package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Otopark ücretleri : (Ternary operatör ile yapınız.)
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bekleme suresini yaziniz = ");
        int saat = oku.nextInt();

        String ucret = (saat <= 3) ? "10 TL" : (saat<=5) ? "15 TL" : "20 TL";
        System.out.println("Otopark Ucretiniz = " + ucret);


    }
}
