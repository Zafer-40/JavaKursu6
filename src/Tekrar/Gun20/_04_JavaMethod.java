package Tekrar.Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup mainden yazdırınız
        // Örn: 5 girildiyse -> 1*2*3*4*5 i bulmalısınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        int carpim = carpimYaz(sayi);
        System.out.println("Sayilarin carpimi = "+carpim);
    }

    public static int carpimYaz(int number) {
        int carpim = 1;
        for (int i = 1; i <= number; i++)
            carpim *= i;


        return carpim;

    }


}
