package Tekrar.Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz(); // giden yok, donen yok
        toplamYaz(5,14); // giden var, donen yok
        enBuyukYaz(12,70);
        int enb = enBuyukBulGonder(19,49);
        System.out.println("En buyuk sayi = "+enb);



    }
    public static int enBuyukBulGonder(int sayi1 , int sayi2){
        int enb = 0;
        if (sayi1 > sayi2)
            enb =sayi1;
        else
            enb = sayi2;
        return enb;
    }
    public static void enBuyukYaz( int s1 , int s2){
        if (s1 > s2)
            System.out.println("En buyuk sayi = "+s1);
        else System.out.println("En buyuk sayi = "+s2);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
        System.out.println();
    }

    public static void toplamYaz(int sayi1 , int sayi2){
        System.out.println("Toplam = "+(sayi1+sayi2));

    }



    }

