package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku = new Scanner(System.in);
        System.out.print("Sifrenizi giriniz = ");
        String sifre = oku.nextLine();
        System.out.print("Sifrenizi tekrar giriniz = ");
        String tSifre = oku.nextLine();

        if (sifre.equals(tSifre)){
            System.out.println("Girdiginiz sifre aynidir");
        }if (!sifre.equals(tSifre)){
            System.out.println("Sifreniz ayni degil!");
        }

        /***************************************/

        if (sifre.equals(tSifre)==true){
            System.out.println("Girdiginiz sifre aynidir");
        }if (sifre.equals(tSifre)==false){
            System.out.println("Sifreniz ayni degil!");
        }


    }
}
