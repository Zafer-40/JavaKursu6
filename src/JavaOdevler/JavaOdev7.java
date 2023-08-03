package JavaOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class JavaOdev7 {
    public static void main(String[] args) {

       // Soru 1-Bu String'i oluşturun. "Removes white space from both ends of a string"
        // String'deki kelime sayısını yazdırınız.


        /*String cumle = "Removes white space from both ends of a string";

        int boslukSayi = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                boslukSayi++;

        }
        System.out.println("Kelime Sayisi = "+(boslukSayi+1));

//         Soru 2-Bir String oluşturun : "Hello World"
//        Stringi tersten yazdırın ve print edin.
//        _Cevap böyle olmalı :  "dlroW olleH"_

        String cumle = "Hello World";
        char[] dizi = cumle.toCharArray();
        for (int i = dizi.length-1 ; i >= 0; i--) {

            System.out.print(dizi[i]);

        }

//       Soru 3- İnt Array oluştur ve elemanları   : 25,30,30,35,100
//        Array in elemanlarının toplamını yazdır.
//        Cevap 220 olmalı.

        int [] sayi  = {25,30,30,35,100};
        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            toplam += sayi[i];
        }
        System.out.println("Toplam Sonuc = "+toplam);

//       Soru 4- int Array oluşturun.
//        elemanları : 13,15,14,16,16
//        Arrayin elemanlarını yazdırın.

        int [] sayi = {13,15,14,16,16};

        for (int i = 0; i < sayi.length; i++) {

            System.out.println((i+1)+".Sayi = " + sayi[i]);
        }
        System.out.println("Sayilar = " + Arrays.toString(sayi));

//       Soru 5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//        Array'daki eleman sayısını yazdırınız.
//        Cevap 4 olmalı.

        String[] sehirler = {"new jersey" , "new york", "boston","California"};

        System.out.println("Arraydeki sehir sayisi = " +sehirler.length);

//        Soru 6- String Array (Dizi) oluşturunuz.
//        elemanları : Apple, Orange , Babana, Kiwi
//        Array'leri tüm elemanları yazdırınız.

        String[] meyveler = {"Apple, Orange , Babana, Kiwi"};

        for (int i = 0; i < meyveler.length; i++) {
            System.out.println(meyveler[i]);

        }

//        Soru 7-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//        Array'in ortalamasını alınız.

        int[] sayi = {12, 14 , 21 ,23 , 10 ,4};
        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            toplam = toplam+sayi[i];
        }
        System.out.print("Arrayin ortalamasi = "+toplam/ sayi.length);

//      Soru 8-  int Array oluşturun ve elemanları : 5,6,8,12,14,19
//        Eğer sayı çiftse topla, tekse çıkar.
//                **Örneğin:**
// **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//        Toplamlarını yazdırın.


        int[] sayi = {5,6,8,12,14,19};

        int toplam = 0;
        int fark = 0;
        int sonuc = 0;

        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i]%2==0){
                toplam +=sayi[i];
            }else
                fark-=sayi[i];
        }
        sonuc = toplam+fark;
        System.out.println("Nihai sonuc = "+sonuc);

//       Soru 9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = {15 , 25, 22, 18, 30};

        int enBuyuk = dizi[0];
        int ikinciEnBuyuk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk){
                ikinciEnBuyuk=enBuyuk;
                enBuyuk=dizi[i];
            } else if (dizi[i]>ikinciEnBuyuk) {
                ikinciEnBuyuk=dizi[i];
            }

        }
        System.out.println("ikinci en buyuk sayi = "+ikinciEnBuyuk);

//       Soru 10- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.

        int[] sayilar = {14 , 19 , 5 , 21};

        int enKucuk = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]<enKucuk)
                enKucuk=sayilar[i];
        }
        System.out.println("En kucuk sayi = "+enKucuk);

//      Soru 11-  int Array oluşturun ve elemanları : 12,2,5,15,8
//        En büyük değeri yazdırınız.

        int[] sayilar = {12,2,5,15,8};
        int enBuyuk = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk)
                enBuyuk = sayilar[i];
        }
        System.out.println("En buyuk sayi = " +enBuyuk);

//      Soru 12-   String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.
//        Loops (döngüler) kullanın.

        String[] meyveler = {"Apple","Orange","Banana","Pineapple"};
        boolean varMi = false;

        for (int i = 0; i < meyveler.length; i++) {
            if (meyveler[i].equals("Apple")){
                varMi=true;
           }
        }
        System.out.println("Var mi ? = "+varMi);

//       Soru 13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
//        $ işaretlerini kaldırın ve sayıları toplayın.
//        Sayıların toplamını yazdırın.

        String str = "$12 $23 $10 $2 $5 $2";

        String[] numbers = str.replaceAll("\\$","").split(" ");

        int toplam = 0;
        for (String number : numbers){
            toplam+=Integer.parseInt(number);
        }
        System.out.println("Toplam = "+toplam);*/

















    }
}
