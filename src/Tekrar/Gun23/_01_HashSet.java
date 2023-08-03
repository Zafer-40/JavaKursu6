package Tekrar.Gun23;

import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor.
        // LinkedHashSet -> sen ekledikçe , eklenme sırasına göre tutuyor.
        // TreeSet -> sen ekledikçe onları herzaman sıralı tutuyor.
        // Bunların ortak özelliği TEKRAR eden DEĞER YOK ve INDEX yok

        HashSet<Integer>myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(38);
        myHashSet.add(22);
        myHashSet.add(4);
        myHashSet.add(5);
        boolean eklendiMi = myHashSet.add(5);
        myHashSet.add(2);

        System.out.println("HashSet yazdir = "+myHashSet);
        System.out.println("5 eklendimi? ="+eklendiMi);
    }
}
