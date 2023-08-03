package Gun08;

public class _05_JavaAritmeticOperatorsc {
    public static void main(String[] args) {

        int sayac = 0;

        sayac=sayac+1;  //sayacin degerini 1 artiriyor:1
        sayac++;        //sayacin degerini 1 artiriyor:2
        ++sayac;        //sayacin degerini 1 artiriyor:3

        sayac = sayac-1;    //sayacin degerini 1 azaltir:2
        sayac--;            //sayacin degerini 1 azaltir:1
        --sayac;            //sayacin degerini 1 azaltir:0

        System.out.println("Sayacin rakamsal degeri = " + sayac);

        int toplam = 0; int sayi = 0;
        //islemden once toplam 0 sayi 0 dir
        toplam = 5 + sayi++;
        //islemden sonra toplam 5 sayi 1 dir

        int tplm = 0; int sayi1 = 0;
        //islemden once tplm 0 sayi1 0 dir
        tplm = 5 + ++sayi1;
        //islemden once tplm 6 sayi1 1 dir

        // ++ lar sagda ise once islem sonra 1 artis olur
        // ++ lar solda ise once 1 artis sonra islem olur




    }
}
