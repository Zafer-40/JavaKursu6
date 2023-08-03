package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.



        int[] sayi = new int[5];

        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = (int) (Math.random() * 11);
            System.out.println("Random atanan sayilar = " + sayi[i]);


        }
        Scanner oku = new Scanner(System.in);
        System.out.print("Aranacak rakam = ");
        int arananSayi = oku.nextInt();

            for (int i = 0; i < sayi.length; i++) {

                if (sayi[i] == arananSayi)
                    System.out.println("Var index numarasi = " +i);


                




        }



        }
    }

