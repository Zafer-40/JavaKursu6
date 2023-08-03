package Tekrar.Gun20;

import java.util.Scanner;

public class _07_Odev {
    public static void main(String[] args) {

        //Soru 2 - "OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //        Ortadaki kelimeyi return yapınız.
        //       Örnek: Ben Java'yı seviyorum.
        // print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca

        /*OrtaKelime("");

        System.out.println(OrtaKelime("Ben sen o"));

    }
    public static String OrtaKelime(String cumle) {

        String[] str = cumle.split(" ");


            int ortaIndex = str.length / 2;
            String middleWord = str[ortaIndex];

            return middleWord;

        //Soru 3- reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        reverseString("bana");

        }
        public static String reverseString (String text){

        char[] array = text.toCharArray();
            for (int i = array.length-1; i >=0; i--) {
                System.out.print(array[i]);

            }
            return text;

        //Soru 4-adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java

        reverseWord("Javayi seviyorum");
        System.out.println(reverseWord("sen ben"));
        String a = reverseWord("Buna bak");
        System.out.println(a);
        }
        public static String reverseWord (String str){
        String cumle1 = "";
        String[] array = str.split(" ");
            for (int i = array.length-1; i >= 0; i--) {
                System.out.print(array[i]+" ");
            }
            return cumle1;

        //Soru 5- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        tersDizi();
    }

    public static String tersDizi() {
        Scanner oku = new Scanner(System.in);
        System.out.print("cümle giriniz :");
        String cumle = oku.nextLine();

        String[] kelimelerDizisi = cumle.split(" ");//bir dizenin her kelimesini tek tek alır ve bunları bir kelime dizisi olarak döndürür.
        for (int i = kelimelerDizisi.length - 1; i >= 0; i--)
            System.out.print((kelimelerDizisi[i] + " "));
        return cumle;

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

        System.out.println(powerOfThree(27));
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


