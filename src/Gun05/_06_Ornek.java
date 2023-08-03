package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a

        Scanner oku = new Scanner(System.in);

        System.out.print("Karenin kenarini giriniz = ");
        int kenar = oku.nextInt();

        int cevre = 4*kenar;
        int alan = kenar*kenar;

        System.out.println("Karenin cevresi = "+cevre);
        System.out.println("Karenin alani = "+alan );

    }
}
