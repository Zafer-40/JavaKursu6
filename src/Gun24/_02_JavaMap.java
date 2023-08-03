package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1001 , "Ismet Temur");
        hm.put(1002 , "Yusuf Yilmaz");
        hm.put(2001 , "Bugrahan Yildiz");
        hm.put(5001 , "Elife Sozen");
        hm.put(1002 , "Seda Parca");

        System.out.println("Keyleri toplu verir = " +hm.keySet());
        System.out.println("Degerleri toplu verir = " +hm.values());
        System.out.println();

        for (Integer k : hm.keySet())
            System.out.print(k+ " ");

        System.out.println();
        System.out.println();

        for (String v : hm.values())
            System.out.print(v+ " ");

        System.out.println();
        System.out.println();

        System.out.println("Orjinal hali = "+hm);
        System.out.println();

        for (Map.Entry<Integer,String> kv : hm.entrySet()){
            System.out.println(kv.getKey()+"-"+kv.getValue());
        }



    }
}
