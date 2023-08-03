package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String> renler = new HashSet<>();
        renler.add("Red");
        renler.add("Green");
        renler.add("Blue");
        renler.add("Red");
        renler.add("RED");

        System.out.println("HashSet renler = "+renler);

        //ekrana tek tek foreach le nasil yazdiririm

        for (String eleman : renler){ // sira garantili degil
            System.out.println("Forechle yazdirma = "+eleman);
        }

        //setin kendi sirasi nasilsa onun aynisini asagidaki gibi yazdirabilirsin

        Iterator gosterge = renler.iterator();
        while (gosterge.hasNext())// sirada eleman varsa
        {
            System.out.println("Sirali yazdirma = "+gosterge.next());
            //.next gostergenin gosterdigi elemani temsil ediyor
        }
    }


}
