package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi,array: boyut sayısı belli , sonradan değiştirelemz
        int[] dizi=new int[5]; // 5 elemanlı Array, boyutu değiştirilemez

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu baştan vermen gerekmiyor. boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin");// uzunluk 2
        isimler.add("Burak");// uzunluk 3
        isimler.add("Cansu");// uzunluk 4

        System.out.println("isimler = " + isimler);
        System.out.println("isimler uzunlugu = " + isimler.size());// uzunlugu verir

        isimler.add(1,"Nurhayat"); // 1 numarali indexe Nurhayat ismini yazidirdi
        System.out.println("isimler = " + isimler);
        System.out.println("isimler uzunlugu = " + isimler.size());// uzunlugu verir

        isimler.set(1,"Elife"); // 1 numarali indexteki elemani degistirdi
        System.out.println("isimler = " + isimler);

        boolean varMi = isimler.contains("Elife"); // listede Elife ismi var mi
        System.out.println("Elife var mi = " + varMi);

        isimler.remove("Ahmet"); // Ahmet ismini siler
        System.out.println("isimler = " + isimler);

        isimler.remove(2); //2 numarali indexi sil
        System.out.println("isimler = " + isimler);

        int indexOfMetin = isimler.indexOf("Metin"); // Metin isminin index numarasini verir
        System.out.println("Metinin index numarasi = " + indexOfMetin);

        String ilkEleman = isimler.get(0); // index numarasi 0 olan ismi yazdirir
        System.out.println("indexi sifir olan isim = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);










































    }
}
