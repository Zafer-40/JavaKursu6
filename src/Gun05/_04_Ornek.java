package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Adinizi Giriniz = ");
        String ad = oku.nextLine();
        System.out.print("Soyadinizi Giriniz = ");
        String soyad = oku.nextLine();

        System.out.println("Adiniz ve Soyadiniz = "+ad+" "+soyad);


    }
}
