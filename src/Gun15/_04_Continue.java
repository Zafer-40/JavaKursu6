package Gun15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyiniz
        //bu sayilardan  6 ile 10 arasindakiler haric digerlerini yazsin

        Scanner oku = new Scanner(System.in);

        int toplam = 0;
        for (int i = 1; i <=5 ; i++) {

            System.out.print("Sayi giriniz = ");
            int sayi = oku.nextInt();

            if (sayi>6 && sayi<10){
                continue; // pas gec kendinden sonraki gelen adima gec
            }
            toplam = toplam+sayi;
            System.out.println("Continue CALISMADI");
        }
        System.out.println("Toplam = "+toplam);
    }
}
