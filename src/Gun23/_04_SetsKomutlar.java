package Gun23;

import java.util.HashSet;

public class _04_SetsKomutlar {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(67);
        hs.add(34);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(1);
        System.out.println("Hashseti yazdir = "+hs);
        System.out.println("Setin eleman sayisi = "+hs.size());
        hs.remove(5); // 5 degerini setten siler
        System.out.println("Hashseti yazdir = "+hs);

        if (hs.contains(67))
            System.out.println("VAR");
        else
            System.out.println("YOK");

        hs.clear();
        System.out.println("Hashseti yazdir = "+hs);


    }
}
