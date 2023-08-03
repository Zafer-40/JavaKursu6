package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        //PERIOD 2 TARIH ARASINDAKI FARKI TUTAR
        //LOCALDATE LER ICIN KULLANILIR

        LocalDate dogumTarihi = LocalDate.of(1982,7,12);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);
        System.out.println("Kac yil ay ve gun = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yasindasiniz");
        System.out.println("-------------");

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);
        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra1 = bugun.plus(period3Gun);
        System.out.println("ucGunSonra1 = " + ucGunSonra1);

        LocalDate ucGunSonra2 = bugun.plusDays(3);
        System.out.println("ucGunSonra2 = " + ucGunSonra2);
        
        LocalDate ucAySonra = bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);
        System.out.println("-------------");

        //KURSUN KACINCI GUNUNDESINIZ

        LocalDate kursBaslangic = LocalDate.of(2023,5,15);
        LocalDate bgn = LocalDate.now();

        Period kursBitisTarihi = Period.between(kursBaslangic,bgn);
        System.out.println("Kac yil ay ve gun = " + fark);

        System.out.println("fark.getYears() = " + kursBitisTarihi.getYears());
        System.out.println("fark.getMonths() = " + kursBitisTarihi.getMonths());
        System.out.println("fark.getDays() = " + kursBitisTarihi.getDays());
        System.out.println("-------------");

        //KURSUN BITIS TARIHINI BULUNUZ
        LocalDate kursBaslangic2 = LocalDate.of(2023,5,15);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic2.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        System.out.println("-------------");

        // KURSUN BITMESINE NE KADAR SURE KALDI

        Period neKadarSureKaldi = Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        System.out.println("-------------");

        //KURS NE KADAR SUREDIR DEVAM EDIYOR

        Period neKadarSuredirDevamEdiyor = Period.between(kursBaslangic,bgn);
        System.out.println("neKadarSuredirDevamEdiyor = " + neKadarSuredirDevamEdiyor);
        







    }
}
