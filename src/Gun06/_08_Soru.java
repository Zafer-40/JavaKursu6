package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        //girilen bir ad soyadi ornegin Ismet Temur u I ve T seklinde yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Ad Soyadi Giriniz = ");
        String adSoyad = oku.nextLine();

        char ilkHarf = adSoyad.charAt(0); // 0 daki karakteri ver diyor.
        System.out.println("ismin bas harfi = " + ilkHarf);

        int boslukIndex = adSoyad.indexOf(" ");
        char soyadIlkHarf = adSoyad.charAt(boslukIndex+1);

        System.out.println("Soyadin bas harfi = " + soyadIlkHarf);





    }
}
