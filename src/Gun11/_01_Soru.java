package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67   gibi

        Scanner oku = new Scanner(System.in);
        System.out.print("Aralarinda bir bosluk olan 2 rakam giriniz = ");

        String sayilar = oku.nextLine();
        int boslukIndex = sayilar.indexOf(" ");
        String strSayi1 = sayilar.substring(0,boslukIndex);
        String strSayi2 = sayilar.substring(boslukIndex+1);

        int sayi1 = Integer.parseInt(strSayi1);
        int sayi2 = Integer.parseInt(strSayi2);

        if (sayi1 == sayi2){
            System.out.println("Sayilar ESITTIR");
        }else {
            System.out.println("Sayilar Esit DEGIL");
        }








    }

}
