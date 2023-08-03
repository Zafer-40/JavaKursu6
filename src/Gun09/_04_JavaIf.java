package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz = ");
        int sayi = oku.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cifttir");
        }if (sayi%2!=0){
            System.out.println("Girilen sayi tektir");
        }

    }
}
