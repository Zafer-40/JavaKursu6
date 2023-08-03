package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {
    //kullanicinin girecegi 20 sayidan tek olanlarinin toplamini yaziniz

        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;

        while (sayac<=3){

            System.out.print(sayac+".Sayi giriniz = ");
            int sayi = oku.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            }
                sayac++;
        }
        System.out.println("Girilen sayilarin toplami = "+toplam);


    }
}
