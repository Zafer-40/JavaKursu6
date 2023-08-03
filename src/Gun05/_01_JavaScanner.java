package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        //tipi   isim      yeni bir tane okuyucu olustur
        System.out.print("Sayi giriniz = ");
        int okunan = okuyucu.nextInt(); // klavyeden girilen tam sayiyi oku

        System.out.println("okunan = " + okunan);
        System.out.println("Bitti");



    }
}
