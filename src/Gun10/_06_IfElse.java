package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);
        System.out.print("Password giriniz = ");
        String pass = oku.nextLine();

        if (pass.length() > 8 && pass.length() < 12 && !pass.toLowerCase().contains("pass")){
            System.out.println("UYGUNDUR");
        }else {
            System.out.println("lutfen tekrar deneyiniz");
        }

    }
}
