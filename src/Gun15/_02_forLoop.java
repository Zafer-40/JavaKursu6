package Gun15;

import java.util.Scanner;

public class _02_forLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // carpimin degeri 1000 i geçtiğinde işlem sonlansın.

        Scanner oku = new Scanner(System.in);
        int carpim =1;


        System.out.print("Sayi Giriniz = ");
        int sayi = oku.nextInt();

        for (int i=1; i<=sayi; i++){
            System.out.print("Carpim = "+carpim+"*"+i);
            carpim*=i;
            System.out.println("-> " + carpim);

            if (carpim>1000){
                System.out.println("Break calisti");
                break;

            }


        }

    }
}
