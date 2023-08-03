package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] sayi = new int[3];
        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < sayi.length ; i++) {

            System.out.print((i+1)+".Sayi Giriniz = ");
            sayi[i] = oku.nextInt();
            toplam = toplam + sayi[i];
        }
        double ortalama = toplam/ sayi.length;

        int miktar=0;
        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i]>=ortalama && sayi[i]%2==1){
                System.out.println("Ortalamayi gecen sayilar = "+sayi[i]);
                miktar++;
            }

        }

        System.out.println("Ortalama = " +ortalama);
        System.out.println("Ort gecen ve tek olan sayi adeti = "+miktar);

    }
}
