package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_LocalTime {
    public static void main(String[] args) {

        // TARIH BILGISI ICERMEZ SADECE SAAT DK SANIYE VERIR

        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());
        System.out.println();
        System.out.println("Kendimize ait format");
        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat hh:mm:ss = " + saat.format(of1));

        DateTimeFormatter of2 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm = " + saat.format(of2));

        DateTimeFormatter of3 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat hh:mm a= " + saat.format(of3));

        System.out.println("Kendimiz saat yazdiracagiz");
        LocalTime saat1 = LocalTime.of(20,30,45);
        System.out.println("Kendimizin belirledigi saat="+saat1.format(of1));

    }
}
