package Gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _06_JavaArrayMetot {
    public static void main(String[] args) {

        String[] isimler = {"Ahmet" , "Zeynep" , "Fatih" , "Veysel"};

        // diziyi direkt ekrana yazdirmak icin

        System.out.println("isimler = " + Arrays.toString(isimler));

        int[] a = {13,4,6,78};
        System.out.println("Rakamlar = " + Arrays.toString(a));

        // dizi siralama

        Arrays.sort(isimler);
        System.out.println("Siralanmis isimler = " +Arrays.toString(isimler));

        Arrays.sort(a);
        System.out.println("Siralanmis rakamlar = " +Arrays.toString(a));

        // diziler esitmi
        int[] b = {13,4,6,78};
        int[] c = {14,8,6,97};

        System.out.println("a b ye esitmi? = "+Arrays.equals(a,b)); // true
        System.out.println("b c ye esitmi? = "+Arrays.equals(b,c)); // false

        // contains gibi calisir var ise pozitif sayi verir yok ise negatif sayi verir
        //sadece sirali dizilerde kullanilir

        System.out.println(" a da 4 sayisi var mi? = " +Arrays.binarySearch(a,4)); // negatif sayi yok demek
        System.out.println(" c de 8 sayisi var mi? = " +Arrays.binarySearch(c,10)); // pozitif sayi var demek

        // diziyi hizlica bir degerle doldurmak icin kullanilir

        Arrays.fill(a,5);
        System.out.println("a yi 5 ile doldur = " +Arrays.toString(a));









    }
}
