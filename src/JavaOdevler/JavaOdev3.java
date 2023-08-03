package JavaOdevler;

import java.util.Locale;
import java.util.Scanner;

public class JavaOdev3 {
    public static void main(String[] args) {

        //I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        /*String text = "I love java";
        int uzunluk = text.length();
        System.out.println("uzunluk = " + uzunluk);

        //**Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String text = "Sprint planning";
        System.out.println("Toplam karakter sayisi = "+text.length());

        //apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String text = "apple";
        System.out.println("app hecesi var mi? = " +text.contains("app"));

        //orange** kelimesinden oluşan bir String oluşturun.
        //String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String text1 = "orange";
        String text2 = "Apple";
        boolean esitmi = text1.equals(text2);
        System.out.println("esitmi = " + esitmi);
        System.out.println("Stringler esit mi? = "+text1.equals(text2));

        //apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._

        String text1 = "apple";
        String text2 = "Apple";
        boolean esitmi = text1.equalsIgnoreCase(text2);
        System.out.println("esitmi = " + esitmi);
        System.out.println("Stringler esitmi? = "+text1.equalsIgnoreCase(text2));

        //Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String text = "Florida";
        System.out.println("O harfinin indeks numarasi = "+text.indexOf("o"));

        //Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String text = "Thank you";
        System.out.println("Y harfinin konumu = "+text.indexOf("y"));

        //Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String text = "Mouse";
        char oda = text.charAt(3);
        System.out.println("3. siradaki karakter = "+oda);
        System.out.println("3. siradaki karakter = "+text.charAt(3));

        //paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE

        String text = "paper";
        System.out.println("Buyuk harfe cevir = "+text.toUpperCase());

        //OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple

        String text = "OraNge";
        System.out.println("Stringi kucuk harfle yazdir = "+text.toLowerCase());

        //New Jersey** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın

        String text = "New Jersey";
        System.out.println("Stringi buyuk harfle yazdir = "+text.toUpperCase());

        //New York olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String text = "New York";
        System.out.println("Stringi kucuk harfle yazdir = "+text.toLowerCase());

        //PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String text = "PADDLE";
        System.out.println("Stringi kucuk harfle yazdir = "+text.toLowerCase());

        //Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku =new Scanner(System.in);

        System.out.print("Adi Giriniz = ");
        String ad = oku.nextLine();
        System.out.print("Soyadi Giriniz = ");
        String soyad = oku.nextLine();

        System.out.println("Ad Soyad = "+ad.concat(" ").concat(soyad));
        System.out.println("Adiniz ve Soyadiniz = " +ad+ " "+soyad);

        //Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir yazi yaziniz = ");
        String str = oku.nextLine();
        System.out.println("Bosluk varmi? = "+str.contains(" "));

        //Girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Kelime Giriniz = ");
        String kelime = oku.nextLine();
        System.out.println("ilk harf = "+kelime.charAt(0));
        System.out.println("son harf = "+kelime.charAt(kelime.length()-1));

        //tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.
        //     mesala : Mehmet Alı Yılmaz -> M.A.Y
        Scanner oku = new Scanner(System.in);
        System.out.print("Ad Soyadi Giriniz = ");
        String adSoyad = oku.nextLine();

        char ilkHarf = adSoyad.charAt(0); // 0 daki karakteri ver diyor.


        int boslukIndex = adSoyad.indexOf(" ");
        char soyadIlkHarf = adSoyad.charAt(boslukIndex+1);

        int boslukIndex2 = adSoyad.lastIndexOf(" ");
        char soyadIlkHarf2 = adSoyad.charAt(boslukIndex2+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf+"."+soyadIlkHarf2+".");

        //tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını     ayrı ayrı yazdırınız.
        //      mesala : Mehmet Alı Yılmaz -> Mehmet  i  Ali  yi ve Yılmaz ı ayrı ayrı yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Adinizi ve Soyadinizi Giriniz = ");
        String adSoyad = oku.nextLine();

        int boslukIndex = adSoyad.indexOf(" ");
        int boslukIndex2 = adSoyad.lastIndexOf(" ");

        String ad = adSoyad.substring(0,boslukIndex);
        String ad2 = adSoyad.substring(boslukIndex+1,boslukIndex2);
        String soyad = adSoyad.substring(boslukIndex2+1);

        System.out.println("Adiniz = "+ad);
        System.out.println("2.Adiniz ="+ad2);
        System.out.println("Soyadiniz ="+soyad);*/



















    }
}


