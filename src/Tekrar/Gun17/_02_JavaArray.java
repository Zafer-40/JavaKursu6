package Tekrar.Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel -> 5

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle yazinir = ");
        String cumle = oku.nextLine();

        int bosluk = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                bosluk++;

        }
        int kelimeSayisi = (bosluk+1);
        System.out.println("Cumledeki kelime sayisi = "+kelimeSayisi);

    }
}

