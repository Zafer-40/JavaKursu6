package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Sistem Calismaya Basladi");

        try {
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi 1 = ");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi 2 = ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

        }
        catch (ArithmeticException ex){
            System.out.println("Sifira bolme hatasi olustu");
        }
        catch (InputMismatchException ex){
            System.out.println("Lutfen sayi giriniz");
        }
        catch (Exception ex){
            System.out.println("Beklenmeyen Hata olustu");
        }

        System.out.println("Program Bitti");
    }
}
