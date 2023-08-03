package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    public static void main(String[] args) throws InterruptedException {
        // Soru = CANLI DIGITAL SAAT YAPINIZ

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true)
        {
            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            Thread.sleep(1000);
        }
    }
}
