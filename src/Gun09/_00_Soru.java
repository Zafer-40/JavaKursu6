package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {
        //Girilen bir sayinin tek sayi olup olmadigini yazdiriniz true false

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();

        int kalan = sayi%2;

        System.out.println("Sayi tek mi? = "+(kalan==1));



    }
}
