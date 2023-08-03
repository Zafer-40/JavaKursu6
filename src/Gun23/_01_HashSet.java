package Gun23;

import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor.
        // LinkedHashSet -> sen ekledikçe , eklenme sırasına göre tutuyor.
        // TreeSet -> sen ekledikçe onları herzaman sıralı tutuyor.
        // Bunların ortak özelliği TEKRAR eden DEĞER YOK ve INDEX yok

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendimi = hs1.add(5);
        hs1.add(2);

        System.out.println("Hashset = "+hs1);
        System.out.println("5 elkendimi ="+eklendimi);

    }
}
