package Gun43;

import java.util.Scanner;

public class _08_ThrowExample {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.println("Yeni Sifre Olusturma");

        System.out.print("Yeni Sifre : ");
        String newPass = oku.nextLine();

        if (newPass.length() < 8){
            System.out.println("Lutfen Dikkat");
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (newPass.length() > 15){
            System.out.println("Lutfen Dikkat");
            System.out.println("Sifre en fazla 15 karakter olmali");
        }
    }
}
