package Gun43;

import java.util.Scanner;

public class _09_ThrowExample {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.println("Yeni Sifre Olusturma");

        System.out.print("Yeni Sifre : ");
        String newPass = oku.nextLine();

        try {
            if (newPass.length() < 8 )
                throw new Exception ("Sifre En Az 8 Karakter Olmali");

            if (newPass.length() > 15 )
                throw new Exception ("Sifre En Fazla 15 Karakter Olmali");
        }
        catch (Exception ex){
            System.out.println("Lutfen Dikkat");
            System.out.println(ex.getMessage());

        }
    }
}
