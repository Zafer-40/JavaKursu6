package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMapKomutlar {
    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();//Map lerden HashMap
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("HashMap siralamasi = "+hm);//kafasina gore siralar
        System.out.println();

        Map<Integer,String> lhm = new LinkedHashMap<>();//Map lerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(11,"kus");
        lhm.put(4,"kurt");
        System.out.println("LinkedHashMap siralamasi = "+lhm);//eklenme sirasina gore siralar
        System.out.println();

        Map<Integer,String> tm = new TreeMap<>();//Map lerden TreeMap
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"kopek");
        tm.put(11,"kus");
        tm.put(4,"kurt");
        System.out.println("TreeMap siralamasi = "+tm);//herzaman sirali kendinden sortlu
        System.out.println();
    }
}
