package z_48_Soru;

import java.util.Scanner;

public class MainMain {
    public static void main(String[] args) {


        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        System.out.print("Personel Adi :");
        String ad = okuStr.nextLine();
        System.out.print("Personel Soyadi :");
        String soyad = okuStr.nextLine();
        System.out.print("Maas tutari :");
        int maas = okuInt.nextInt();
        System.out.print("Tecrube yili :");
        int tyil = okuInt.nextInt();
        System.out.print("Departman Adi :");
        String departman = okuStr.nextLine();

        Calisan personel = new Calisan(ad,soyad,maas,tyil,departman);



           int secim;
        do {
           System.out.println("*** Uygulamaya Hosgeldiniz ***");
           System.out.println("1-Calisan Bilgileri Goster");
           System.out.println("2-Maas Artisini Belirle Goster");
           System.out.println("3-Test Yaptir");
           System.out.println("4-Departman Degisimi Yaptir");
           System.out.print("Seciminizi giriniz = ");
           secim = okuInt.nextInt();

           switch (secim) {
               case 1:
                   personel.calisanBilgileriGoster();
                   break;
               case 2:
                   System.out.print("Zam tutarini giriniz = ");
                   int zamTutari = okuInt.nextInt();
                   personel.maasArtisi(zamTutari);
                   break;
               case 3:
                   System.out.print("Test Adini Girin = ");
                   String testAd = okuStr.nextLine();
                   System.out.print("Test Yapacak Kisi = ");
                   String testYapan = okuStr.nextLine();
                   personel.testYap(testAd, testYapan);
                   break;
               case 4:
                   System.out.print("Degisilen Departman Adi = ");
                   String degisenDepartman = okuStr.nextLine();
                   System.out.print("Departman Degisecek Personel = ");
                   String degisenPersonel = okuStr.nextLine();
                   personel.departmanDegisimi(degisenDepartman, degisenPersonel);
                   break;
               default:
                   System.out.println("Belirtilen aralikta RAKAM giriniz!!");
           }



       }while (secim<5);
        System.out.println("Programdan Cikiliyor");

    }
}
