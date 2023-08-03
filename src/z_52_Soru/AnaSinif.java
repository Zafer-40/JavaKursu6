package z_52_Soru;

import java.util.Random;
import java.util.Scanner;

public class AnaSinif {
    public static void main(String[] args) {
        //GISE UYGULAMASI YAPALIM
        //TC SI DOGRU ISE NUMARA VERSIN YANLIS GIRERSE UYARSIN

        Scanner oku = new Scanner(System.in);

        boolean secim = true;


        System.out.println("GISE UYGULAMASINA HOSGELDINIZ");
        System.out.print("Lutfen TCKN giriniz = ");
        String tckn = oku.nextLine();

        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);




    }
}
