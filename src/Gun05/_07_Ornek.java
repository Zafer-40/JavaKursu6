package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan
        //isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner oku = new Scanner(System.in);

        System.out.print("Kisa kenari giriniz = ");
        int kisa = oku.nextInt();
        System.out.print("Uzun kenari giriniz = ");
        int uzun = oku.nextInt();

        int cevre = (2*kisa)+(2*uzun);
        int alan = kisa*uzun;

        System.out.println("Dikdortgenin Cevresi = " + cevre);
        System.out.println("Dikdortgenin Alani = " + alan);
        System.out.println("Çevresi = " + cevre + "\n"+ "Alanı =" + alan);


    }
}
