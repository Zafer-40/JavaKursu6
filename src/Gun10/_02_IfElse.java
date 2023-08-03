package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi CIFTIR");
        }else {
            System.out.println("Girilen sayi TEKTIR");
        }
    }
}
