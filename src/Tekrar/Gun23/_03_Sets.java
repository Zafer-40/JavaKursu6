package Tekrar.Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String>renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        System.out.println("HashSet Renkler = "+renkler);

        //EKRANA TEK TEK NASIL YAZDIRIRIM

        for (String str:renkler) {
            System.out.println("Hashset Renkler tek tek yazdirma = "+str);
        }

        //FOREACH

        Integer [] dizi = {34,5,6,7,8,89,899,77};
        System.out.println(Arrays.toString(dizi));

        for (Integer a : dizi) {
            System.out.println("Dizi elemanlari = "+a);
        }

        ArrayList<Integer>myArray = new ArrayList<>(Arrays.asList(dizi));

        for (Integer a:myArray) {
            System.out.println("Array list tek tek yazdirma = "+a);

        }

        //SETIN KENDI SIRASI NASIL ISE ONUN AYNISINI VERIR
        Iterator gosterge = renkler.iterator();
        while (gosterge.hasNext()) // SIRADA ELEMAN VARSA
        {
            System.out.println("Anlamadim = "+gosterge.next());
            //.NEXT -> GOSTERGENIN GOSTERDIGI ELEMANI TEMSIL EDIYOR
        }



    }
}
