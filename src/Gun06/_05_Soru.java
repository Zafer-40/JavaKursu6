package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        // girilen bir stringin sadece son harfini yazidiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle Girin = ");
        String cumle = oku.nextLine();

        int uzunluk = cumle.length();
        char sonHarf = cumle.charAt(uzunluk-1);
        System.out.println("Son Harf = "+sonHarf);

    }
}
