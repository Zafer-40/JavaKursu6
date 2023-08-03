package Gun11;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku = new Scanner(System.in);

        System.out.print("1. Sayiyi giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. Sayiyi giriniz = ");
        int sayi2 = oku.nextInt();
        System.out.print("3. Sayiyi giriniz = ");
        int sayi3 = oku.nextInt();

        int sonuc = Math.max(sayi1,sayi2);
        int buyukSayi = Math.max(sonuc,sayi3);
        System.out.println("En buyuk sayi = "+buyukSayi);

        System.out.println(Math.max(Math.max(sayi1,sayi2),sayi3));
    }
}
