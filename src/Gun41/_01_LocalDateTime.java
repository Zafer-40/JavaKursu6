package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01_LocalDateTime {
    public static void main(String[] args) {
        //LOCALDATATIME HEM TARIH HEMDE SAAT BILGISINI TUTAR

        //aşağıdakiler birer zaman tutuyor
        //LocalDate -> tarih
        //LocalTime -> saat(saat,dak,san,ns)
        //LocalDateTime -> tarih + saat
        //DateTimeFormatter -> format

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonth().getValue = " + dt.getMonth().getValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) = "
                + dt.format(DateTimeFormatter.ISO_DATE_TIME));

        //OZEL FORMATTA ISTEDIGIMIZ GIBI YAZMA

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm");
        System.out.println("dt.format(f) = " + dt.format(f));
    }
}
