package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Ogrenci notunu giriniz = ");
        int not = oku.nextInt();

        if (not>=50){
            System.out.println("Tebrikler gectiniz!");
        }else {
            System.out.println("Uzgunuz kaldiniz =(");
        }

    }
}
