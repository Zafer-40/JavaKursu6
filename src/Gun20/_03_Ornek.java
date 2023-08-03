package Gun20;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi giriniz = ");
        int sayi2 = oku.nextInt();

        int enb = enbBul(sayi1,sayi2);
        System.out.println("En buyuk sayi = "+enb);

    }


    public static int enbBul(int sayi1, int sayi2) {
//        int enb=0;
//
//        if (sayi1>sayi2)
//            enb=sayi1;
//        else
//            enb=sayi2;
//
//        return enb;

        return (sayi1>sayi2 ? sayi1 : sayi2);


    }
}
