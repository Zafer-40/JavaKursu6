package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        DateTimeFormatter ozel5 = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih MMMM EEEE dd.MM.yyyy = " + tarih.format(ozel5));

        System.out.println("***baska dilde formatta gosterma***");
        //LOKALDEN ALDIGIM TARIHI BASKA DILDE FORMATTA GOSTERME
        System.out.println("Almanca tarih="+tarih.format(ozel5.withLocale(Locale.GERMANY)));

        Locale lCince = new Locale("zh","CH"); //CIN IN ZH DILI KONUSULAN BOLGESI
        System.out.println("Cince Tarih = "+tarih.format(ozel5.withLocale(lCince)));

        //KULLANILABILIR LOKALLERI BULMA
        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller){
            if (!l.getDisplayCountry().toLowerCase().contains("tur")) continue;

            System.out.println("Dili="+l.getDisplayLanguage());
            System.out.println("Ulkesi="+l.getDisplayCountry());
            System.out.println("Dili="+l.getLanguage());
            System.out.println("Ulkesi="+l.getCountry());
            System.out.println();
        }

        Locale lTurkiye = new Locale("tr","TR");
        System.out.println("Turkce Tarih ="+tarih.format(ozel5.withLocale(lTurkiye)));

        System.out.println("\n**********************");
        //MESELA 2053.05.20 TARIHINI YANI KENDI ISTEDIGIMIZ TARIHI NASIL YAZDIRIRIZ
        LocalDate tarih1 = LocalDate.of(2053,05,20);
        LocalDate tarih2 = LocalDate.of(2053, Month.MAY,20);
        System.out.println("Tarih="+tarih1.format(ozel5));


    }
}
