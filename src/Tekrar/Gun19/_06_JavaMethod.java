package Tekrar.Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // bir sayının tekmi çift mi olduğunu yazdırınız.
        int kosul =3;

            int sayi = 5;
            if (sayi % 2 ==0)
                System.out.println("Sayi CIFTIR");
            else System.out.println("Sayi TEKTIR");
        System.out.println("******************************");

        tekCiftYaz(5);
        tekCiftYaz(8);
        System.out.println("******************************");

        okuTekCiftYaz();

    }
    public static void tekCiftYaz(int sayi){
        if(sayi % 2 == 0)
            System.out.println("CIFTIR");
        else
            System.out.println("TEKTIR");

    }

    public static void okuTekCiftYaz() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();

        tekCiftYaz(sayi);

    }
}
