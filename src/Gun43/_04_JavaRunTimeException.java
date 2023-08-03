package Gun43;

import java.util.Scanner;

public class _04_JavaRunTimeException {
    public static void main(String[] args) {

        boolean dogruCalisti=true;

        do {
            try {
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi 1 = ");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi 2 = ");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);
                dogruCalisti=true;
            } catch (Exception hata) { //HATA OLURSA YAKALA VE ASAGIDAKI BOLUMU CALISTIR
                System.out.println("HATA olustu");
                System.out.println("HATA = " + hata.getMessage());
                System.out.println("Lutfen 2. Sayiyi SIFIR girmeyiniz");
                dogruCalisti =false;
            }
        }while (!dogruCalisti);

    }
}
