package Tekrar.Gun21;

import java.util.Scanner;

public class _01_kurcalama {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        String str;

        do {
            System.out.print("Donen cumle yaz cikmak icin q ya bas =");
            str = oku.nextLine();

        }while (!str.equalsIgnoreCase("q"));

        System.out.println("Programdan cikiliyorrr");
    }
}
