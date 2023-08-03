package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;


        do {
            System.out.print("Sayi giriniz = ");
            sayi = oku.nextInt();
            toplam = toplam+sayi;

        }while (sayi!=0);

        System.out.println("Toplam = "+toplam);

    }


}
