package Tekrar.Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("2.sayiyi giriniz = ");
        int sayi2 = oku.nextInt();

        int buyukSayi=buyukSayiyiYaz(sayi1,sayi2);
        System.out.print("Buyuk sayi = "+buyukSayi);
    }
    public static int buyukSayiyiYaz(int s1 , int s2){
        int buyukSayi = 0;
        if (s1 > s2)
            buyukSayi = s1;
        else
            buyukSayi = s2;
        return buyukSayi;
    }
}
