package Tekrar.Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle yaziniz = ");
        String cumle = oku.nextLine();

        String [] kelimeler = cumle.split(" ");

        System.out.println("Kelime sayisi = "+kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {

            System.out.println("Kelimeler = "+kelimeler[i]);

        }

        }



    }

