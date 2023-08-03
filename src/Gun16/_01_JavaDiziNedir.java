package Gun16;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        // benim bir tanimlamada birden fazla deger tutabilen bir degiskene ihtiyacim var

        int[] notlar = new int[50]; // 50 tane int saklayabilen notlar isimli degisken

        notlar[0] = 75;
        notlar[1] = 88;

        notlar[49] = 95; // en son eleman toplam eleman sayisi-1. lenght-1 dir boylece index 0-49 arasidir
        // 50. ogrenci notu
        // notlar[50] = 56; challanger patlar

        System.out.println("notlar [0] = " + notlar[0]);

        System.out.println("notlar.lenght = " + notlar.length); // 50 yani toplam eleman sayisini verir




    }
}
