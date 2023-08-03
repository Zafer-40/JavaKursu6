package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        //DURATION LOCALTIME VE LOCALDATATIME LAR ARASINDAKI FARK ICIN KULLANILIR

        //LOCALTIME

        long startTime = System.currentTimeMillis();
        LocalTime dersBaslangic = LocalTime.of(19,0,0);
        LocalTime dersBitis = LocalTime.of(21,50,5);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toDays() = " + gunlukDersSuresi.toDays());
        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours());
        System.out.println("gunlukDersSuresi.getSeconds() = " + gunlukDersSuresi.getSeconds());
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes());
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis());
        System.out.println("gunlukDersSuresi.toNanos() = " + gunlukDersSuresi.toNanos());
        System.out.println("-----------------");

        System.out.println("******** Local Date Time ********");
        LocalDateTime from = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to = LocalDateTime.now();

        Duration fark = Duration.between(from,to);
        System.out.println("fark = " + fark);

        System.out.println("fark.toDays() = " + fark.toDays()); // FARKIN TOPLAM GUNU
        System.out.println("fark.toHours() = " + fark.toHours()); // FARKIN TOPLAM SAATI
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // FARKIN TOPLAM DAKIKASI
        System.out.println("-----------------");

        System.out.println("******** KODUN PERFORMANSI ********");

        long finishTime = System.currentTimeMillis(); //SUANDAKI MILISANIYE CINSINDEN ZAMAN
        System.out.println("Gecen sure = "+(finishTime-startTime)+" ms");



    }
}
