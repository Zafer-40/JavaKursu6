package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını(kg) double, boyunu(m) double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kitle indexini de bularak yazdırınız   kg/ (boy*boy)

        Scanner oku = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz = ");
        double kilo = oku.nextDouble();
        System.out.print("Boyunuzu giriniz = ");
        double boy = oku.nextDouble();

        double vki = kilo/(boy*boy);

        System.out.println("Boyunuz = "+ boy + " Kilonuz = "+kilo);
        System.out.println("Vucud Kitle Indeksiniz = "+vki);

    }
}
