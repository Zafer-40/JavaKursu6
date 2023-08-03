package Gun13;

import java.util.Scanner;

public class _02_Swicth {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // 234  -> birler basamağı -> 4  -> dört

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        int birler = sayi%10;
        switch (birler){
            case 1 : System.out.println("Bir");break;
            case 2 : System.out.println("iki");break;
            case 3 : System.out.println("Uc");break;
            case 4 : System.out.println("Dort");break;
            case 5 : System.out.println("Bes");break;
            case 6 : System.out.println("alti");break;
            case 7 : System.out.println("yedi");break;
            case 8 : System.out.println("sekiz");break;
            case 9 : System.out.println("dokuz");break;
            case 0 : System.out.println("sifir");break;


}







    }
}
