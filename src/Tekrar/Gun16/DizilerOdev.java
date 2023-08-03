package Tekrar.Gun16;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerOdev {
    public static void main(String[] args) {
        //Soru 1-Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        /*String cumle = "Removes white space from both ends of a string";
        String[]arr = cumle.split(" ");
        int uzunluk = arr.length;

        System.out.println("Cumlenin kelime sayisi = "+uzunluk);

        //Soru 2-Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String text = "Hello World";

        for (int i = text.length()-1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        char[] c = new char[cumle.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] += cumle.charAt((c.length-1)-i);
        }
        System.out.println(Arrays.toString(c));

        //Soru 3-İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.
        int toplam = 0;
        int[] arr = {25,30,30,35,100};

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Dizinin toplami = "+toplam);

        //Soru 4-int Array oluşturun.
        //elemanları : 13, 15,14,16,16
        //Arrayin elemanlarını yazdırın.

        int [] array = {13, 15,14,16,16};
        System.out.println(Arrays.toString(array));

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+" .Sayi giriniz = ");
            dizi[i] = oku.nextInt();
        }
        System.out.println("2. yontemle toplam = "+Arrays.toString(dizi));

        //Soru 5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.

        String[] array = {"new jersey" , "new york", "boston","California"};
        System.out.println("Eleman sayisi = "+array.length);

        Scanner oku = new Scanner(System.in);
        String[] ulkeler = new String[4];

        for (int i = 0; i < ulkeler.length; i++) {

            System.out.print("Ulke Ismi Giriniz = ");
            ulkeler[i] = oku.nextLine();
        }
        System.out.println("Ulke dizilimi = "+Arrays.toString(ulkeler));
        System.out.println("Ulke sayisi = "+ulkeler.length);

        //Soru 6- String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String[] meyveler = {"Apple" , "Orange" , "Banana" , "kivi"};
        System.out.println("Meyve sirlamasi = "+Arrays.toString(meyveler));
        for (int i = 0; i < meyveler.length; i++) {
            System.out.print(meyveler[i]+" ");
        }
        System.out.println();

        Scanner oku = new Scanner(System.in);
        String[]fruits = new String[4];

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Meyveleri giriniz = ");
            fruits[i] = oku.nextLine();
        }
        System.out.println("ToStringle yazdirmak = "+Arrays.toString(fruits));
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");


        //Soru 7- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] array ={12, 14 , 21 ,23 , 10 ,4};
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        double ortalama = toplam / array.length;
        System.out.println("Arrayin ortalamasi = "+ortalama);

        Scanner oku = new Scanner(System.in);
        int total = 0;
        int [] sayilar = new int[6];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print("Sayi giriniz = ");
            sayilar[i] = oku.nextInt();
            total += sayilar[i];
        }
        double ort = total / sayilar.length;
        System.out.println("Ikinci usul ortalama = "+ort);


        //Soru 8- int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int[] array = {5,6,8,12,14,19};
        int topla = 0;
        int cikar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                topla += array[i];
            if (array[i] % 2 == 1)
                cikar -= array[i];

        }
        int sonuc = topla+cikar;
        System.out.println("Sonuc = "+sonuc);

        //Soru 9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] array = {15 , 25, 22, 18, 30};

        Arrays.sort(array);

        int ikinciEnBuyuk = array[array.length-2];
        System.out.println("Ikinci en buyuk sayi = "+ikinciEnBuyuk);

        //Soru 10-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] array = {14 , 19 , 5 , 21};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);

        //Soru 11- int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int [] array = {12,2,5,15,8};
        int max = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("1.yontem en buyuk = "+max);

        Arrays.sort(array);
        int enbyk = array[array.length-1];
        System.out.println("2.yontem en buyuk = "+enbyk);

        //Soru12- String array oluşturun ve elemanların içinde "Apple" olup olmadığını
        //kontrol eden programı yazınız.Eğer var ise "true" döndürsün.
        //Örnek elemanlar: Apple , Orange , Banana , Pineapple

        String [] fruits = {"Apple" , "Orange" , "Banana" , "Pineapple"};

        boolean varMi = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase("Apple"))
                varMi = true;

        }
        System.out.println(varMi);

        //Soru13-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String usd = "$12 $23 $10 $2 $5 $2";

        String [] array = usd.split(" ");
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace("$","");
            total += Integer.parseInt(array[i]);

        }
        System.out.println("Toplam = "+ total);*/


        }

}

        






