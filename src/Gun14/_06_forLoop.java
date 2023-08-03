package Gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        int toplam =0;

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();


        for (int i=1; i<=sayi; i++){
            toplam+=i;
        }
        System.out.println("Toplam = "+toplam);







    }

    public static class _07_forLoop {
    }
}
