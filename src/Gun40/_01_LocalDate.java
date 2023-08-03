package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_LocalDate {
    public static void main(String[] args) {

        //localdate SADECE GUN AY YIL BILGISINI TUTAR
        LocalDate tarih = LocalDate.now(); // SUANDAKI TARIHI VERIR

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        //KENDISINDEKI HAZIR FORTMATLAR

        System.out.println("ISO-DATE = "+tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        //ISTEDIGIMIZ GIBI OZELLESTIRME
        System.out.println("\n*** FORMATI OZELLESTIRME ***");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozel1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih.format(ozel1) dd/MM/yyyy = " + tarih.format(ozel1));

        DateTimeFormatter ozel2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy= " + tarih.format(ozel2));

        DateTimeFormatter ozel3 = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(ozel3));

        DateTimeFormatter ozel4 = DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(ozel4));

        DateTimeFormatter ozel5 = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih MMMM EEEE dd.MM.yyyy = " + tarih.format(ozel5));

        //KISACA YAZILMA YONTEMI
        System.out.println("Tarih MMMM dd EEEE yyyy ="
                +tarih.format(DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy")));





    }
}
