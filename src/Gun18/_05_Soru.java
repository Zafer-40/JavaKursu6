package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 2x3 luk bir diziyi random 10 a kadar sayilarla doldurunuz
        //daha sonra kullanicidan bir sayi aliniz
        //bu sayi tabloda var ise yerini (satir,sutun) yazdiriniz

        int[][] tablo = new int[2][3];


        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 11);

        }
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print(tablo[satir][sutun] + " ");
            System.out.println();
        }
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi Giriniz = ");
        int arananSayi = oku.nextInt();

        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {

                if (tablo[satir][sutun] == arananSayi) {
                    System.out.println(satir + ".Satir");
                    System.out.println(sutun + ".Sutun");


                }
            }
        }
    }
}
