package Gun09;

import java.util.Scanner;

public class _02_javaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayiyi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi<0){
            System.out.println("Girilen sayi negatiftir");
        }if (sayi>0){
            System.out.println("Girilen sayi pozitiftir");
        }if (sayi==0){
            System.out.println("Girilen sayi = "+sayi+" dir");
        }

    }
}
