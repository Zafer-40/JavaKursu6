package Gun42;

import java.util.Arrays;

public class _04_VeriTipleriMetodda {
    public static void main(String[] args) {

        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);

        sayi=sayiArtir2(sayi);
        System.out.println("sayi = " + sayi);
        System.out.println("==========");
        //REFERANS TIPLERDE YANI NEW LE OLUSTURULANLARDA

        int[] dizi = {1,2,3,4};
        diziSifirla(dizi);//GIDEN REFERANSI ISE 0000 DEGILSE 1234 YAZACAK
        System.out.println("Dizi = "+ Arrays.toString(dizi));
        System.out.println("==========");

        //NESNE TIPLER
        String kelime = "ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);// ismet

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.
        // Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri,
        // bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler.
        // Eşitlemelerde referanslar eşitlenir.


    }
    public static void kelimeSifirla(String kelime){
        kelime="";
    }




    public static void diziSifirla(int[] dizi5){
        //GELEN REFERANSI ISE 0000 DEGILSE 1234 YAZACAK
        dizi5[0]=0;
        dizi5[1]=0;
        dizi5[2]=0;
        dizi5[3]=0;
    }


    public static void sayiArtir(int sayi){
        sayi++;
    }

    public static int sayiArtir2(int sayi){
        sayi++;
        return sayi;
    }
}
