package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map -> Anahtar + Set -> Anahtarlı Set  (Tekrar eden anahtarlar yok)

        //anahtarın tipi Integer, değerin tipi String
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1001 , "Ismet Temur");
        hm.put(1002 , "Yusuf Yilmaz");
        hm.put(2001 , "Bugrahan Yildiz");
        hm.put(5001 , "Elife Sozen");
        hm.put(1002 , "Seda Parca");

        System.out.println("Hashmap i yazdir = "+hm);
        System.out.println();

        System.out.println("Anahtar tipi 1001 i yaz = "+hm.get(1001));
        System.out.println("Anahtar tipi 5001 i yaz = "+hm.get(5001));
        System.out.println();

        System.out.println("2001 anahtar tipli deger var mi? = " + hm.containsKey(2001));
        System.out.println("5002 anahtar tipli deger var mi? = " + hm.containsKey(5002));
        System.out.println();

        System.out.println("Keyleri toplu verir = " +hm.keySet());
        System.out.println("Degerleri toplu verir = " +hm.values());
        System.out.println();

        hm.remove(5001);
        System.out.println("5001 keyli degeri sil gerisini yazdir = "+hm);





    }
}
