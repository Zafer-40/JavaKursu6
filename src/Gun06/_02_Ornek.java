package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde(s), Sokak(s) , PostaKodu(int) ve ülke(s)
        // evSahibi(b) şeklinde adres bilgisini alarak yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner oku1 = new Scanner(System.in);

        System.out.print("Cadde ismi giriniz = ");
        String cadde = oku.nextLine();

        System.out.print("Sokak ismi giriniz = ");
        String sokak = oku.nextLine();

        System.out.print("Posta kodu giriniz = ");
        int postaKodu = oku1.nextInt();

        System.out.print("Ulke ismi giriniz = ");
        String ulke = oku.nextLine();

        System.out.print("Ev sahibi misiniz? = ");
        boolean evSahibi = oku.nextBoolean();

        System.out.println("Adres = " + cadde+" "+sokak+" "+postaKodu+" "+ulke+" "+ evSahibi);





    }
}
