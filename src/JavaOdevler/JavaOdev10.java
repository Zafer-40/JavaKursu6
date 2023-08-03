package JavaOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class JavaOdev10 {
    public static void main(String[] args) {

        //Soru 1- Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

       /* randomNum(100);

    }
    public static void randomNum(int max){
        int randomSayi = (int) (Math.random()*max);
        System.out.println(randomSayi);

        //Soru 2 - "OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //        Ortadaki kelimeyi return yapınız.
        //       Örnek: Ben Java'yı seviyorum.
        // print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca

        OrtaKelime("Ben javayi cok seviyorum");

    }
    public static void OrtaKelime(String cumle) {

        String[] str = cumle.split(" ");

        if (str.length % 2 != 0) {
            int middleIndex = str.length / 2;
            String middleWord = str[middleIndex];
            System.out.println("Ortadaki kelime : " + middleWord);
        } else {
            System.out.println("Bu cümlede ortadaki kelime bulunmamaktadır");
        }

        //Soru 3- reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        reverseString("Javayi seviyorum");
    }

    public static void reverseString(String cumle) {
        char[] dizi = cumle.toCharArray();
        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i]);
        }

        //Soru 4-adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java

        reverseWord("Java yazin");

    }
    public static void reverseWord(String cumle){

        String[] str = cumle.split(" ");

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]+ " ");
        }


        //Soru 5- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[] dizi = new int[4];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+ ".Sayiyi giriniz = ");
            dizi[i] = oku.nextInt();
        }
        System.out.println("Dizinin orjinal hali = "+Arrays.toString(dizi));

        diziyiTersYaz(dizi);

    }
    public static void diziyiTersYaz(int[] dizi){
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i]+" ");
        }

        //Soru 6 - powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin.
        // 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true

        System.out.println(powerOfThree(6));
    }
    public static boolean powerOfThree(int rakam) {
        while (rakam > 1){
            if (rakam % 3 != 0){
                return false;
            }
            rakam /= 3;
        }
            return true; */
    }


}






