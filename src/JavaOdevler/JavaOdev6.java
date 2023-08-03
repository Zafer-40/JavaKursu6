package JavaOdevler;

import java.util.Scanner;

public class JavaOdev6 {
    public static void main(String[] args) {
        //1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz
       /* Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;

        while (sayac<=20){

            System.out.print(sayac+".Sayi giriniz = ");
            int sayi = oku.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            }
            sayac++;
        }
        System.out.println("Girilen tek sayilarin toplami = "+toplam);

       // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner oku = new Scanner(System.in);

        int sayac = 1;
        int toplam = 0;

        while (sayac<=20){

            System.out.print("Sayi giriniz = ");
            int sayi = oku.nextInt();

            if (sayi%2==1){
                toplam++;
            }
            sayac++;
        }
        System.out.println("Girilen tek sayi adeti = "+toplam);

        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);

        int toplam = 0;

        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        while (sayi>0){

            toplam=toplam+sayi;
            sayi=sayi-1;

        }
        System.out.println("Toplam = "+toplam);

        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        int sayac = 1;

        while (sayac<=20){
            System.out.print(sayac+".Sayi giriniz = ");
            int sayi = oku.nextInt();
            if (sayi>=10 && sayi<=30){
                toplam +=sayi;
            }
            sayac++;
        }
        System.out.println("10 ile 30 arasindaki sayilarin toplami = "+toplam);

        //5- 100 e kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int sayi = 1;
        int sayac = 1;
        int birlerToplami = 0;

        while (sayi <= 105) {
            sayi += 1;
            if (sayi % 10 == 5) {
                birlerToplami += 1;
            }
        }
        System.out.println("Birler basamagi 5 olan sayi adeti = " + birlerToplami);

        // 6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //bilemediniz yazıp tutulan sayıyı bildirsin.
        //Eğer bilirse tebrikler yazsın.

        Scanner oku = new Scanner(System.in);
        int min = 10;
        int max = 20;
        int sayac =1;

        while (sayac<=3){
            sayac++;
            System.out.print("Sayı giriniz = ");
            int sayi = oku.nextInt();

            int randomSayi = (int) (Math.random()*(max-min)+min);
            System.out.println("Random sayi = "+randomSayi);
            if (sayi==randomSayi)
                System.out.println("Tebrikler ");
            else
                System.out.println("Bilemediniz!!");
        }*/


    }
}
