package Gun12;

import java.util.Scanner;

public class _05_ifElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Dersi ve Notunu Giriniz = ");
        String dersNotu = oku.nextLine();

        //1. yontem substring
        int ind  = dersNotu.indexOf(":");
        int ogrNot = Integer.parseInt(dersNotu.substring(ind+1));
        System.out.println("Ogrenci not 1 = "+ogrNot);

        //2.yontem regex : 0-9 un disindakileri sil (^)
        ogrNot = Integer.parseInt(dersNotu.replaceAll("[^0-9]",""));
        System.out.println("Ogrenci not 2 = "+ogrNot);

        if (ogrNot >= 90)
            System.out.println("Notunuz A");
        else
            if (ogrNot >= 80)
            System.out.println("Notunuz B");
            else
                if (ogrNot >= 70)
                System.out.println("Notunuz C");
                else
                    if (ogrNot >= 60)
                    System.out.println("Notunuz D");
                    else
                        if (ogrNot >= 40)
                        System.out.println("Notunuz E");
                            else
                                System.out.println("Notunuz F");



    }
}
