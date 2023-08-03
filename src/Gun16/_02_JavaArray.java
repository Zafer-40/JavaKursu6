package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // dizi nasil okunur ve nasil yazdirilir?

        Scanner oku = new Scanner(System.in);

        int[] dizi = new int[10]; //10 elemanli bir dizi tanimlandi

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1) + ".Sayiyi giriniz = " );
            dizi[i] = oku.nextInt();
        }
        for ( int i = 0; i<dizi.length ; i++){
            System.out.println("dizi ["+i+"] = " +dizi[i]);
        }
    }
}
