package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku = new Scanner(System.in);

        System.out.print("Cumle girin = ");
        String cumle = oku.nextLine();

        for (int i = 0; i < cumle.length(); i++){
            if (cumle.charAt(i)==' ')
            continue;
            System.out.println(cumle.charAt(i));
        }

    }
}
