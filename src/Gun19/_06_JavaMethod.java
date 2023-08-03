package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // bir sayinin tekmi ciftmi oldugunu yazdiriniz

        tekMiCiftmiYaz(56);
        tekMiCiftmiYaz(37);

        okuTekMiCiftmiYaz();

    }
    public static void tekMiCiftmiYaz(int sayi){
        if (sayi%2==0)
            System.out.println("Sayi Cifttir");
        else
            System.out.println("Sayi Tektir");
    }
    public static void okuTekMiCiftmiYaz(){
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();
        tekMiCiftmiYaz(sayi);
    }
}
