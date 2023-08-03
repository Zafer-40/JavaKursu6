package JavaOdevler;

import java.util.Scanner;

public class JavaOdev2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("isminizi giriniz = ");
        String isim = oku.nextLine();
        System.out.println("isim = " + isim);

        System.out.print("bir sayi giriniz = ");
        int rkm = oku.nextInt();
        System.out.println("rkm = " + rkm);

        System.out.print("Sevdiginiz meyveyi yaziniz = ");
        String meyve = oku.nextLine();
        System.out.println("meyve = " + meyve);

        System.out.print("Arabanizdaki kapi sayisi =");
        int kapi = oku.nextInt();
        System.out.println("kapi sayisi = " + kapi);

        System.out.print("10 sene onceki yasadiginiz sehir = ");
        String sehir = oku.nextLine();
        System.out.println("sehir = " + sehir);

        System.out.print("Dogum gununuzu giriniz =");
        String gun = oku.nextLine();
        System.out.println("Dogum gunu = " + gun);

        System.out.print("Bir banka hesabiniz var mi = ");
        boolean hesap = oku.nextBoolean();
        System.out.println("hesabiniz varmi = " + hesap);

        System.out.print("Kg giriniz = ");
        byte kg = oku.nextByte();
        System.out.println("kg = " + kg);

        System.out.print("Boyunuzu giriniz = ");
        float boy=oku.nextFloat();
        System.out.println("Boyunuz = " + boy);

        System.out.print("1.Sayiyi giriniz = ");
        double sayi1 = oku.nextDouble();
        System.out.print("2.Sayiyi giriniz = ");
        double sayi2 = oku.nextDouble();

        double toplam = sayi1+sayi2;
        double cikartma = sayi1-sayi2;
        double bolme = sayi1/sayi2;
        double carpma = sayi1*sayi2;

        System.out.println("toplam = " + toplam);
        System.out.println("cikartma = " + cikartma);
        System.out.println("bolme = " + bolme);
        System.out.println("carpma = " + carpma);

        System.out.print("1.Ogrencinin notu = ");
        double not1 = oku.nextDouble();
        System.out.print("2.Ogrencinin notu = ");
        double not2 = oku.nextDouble();
        System.out.print("3.Ogrencinin notu = ");
        double not3 = oku.nextDouble();

        double ortalama = (not1+not2+not3)/3;
        System.out.println("3 Ogrenci Not ortalamasi = " + ortalama);






        

    }
}
