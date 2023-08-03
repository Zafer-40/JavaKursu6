package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        //SUANDA BENIM BULUNDUGUM YERIN DEFAULT ZAMANINI VERIR
        //LOCALDATETIME.NOW GIBI SAAT OLARAK
        //DIGER ULKE ZONE LARI ICIN ZonedDateTime.now(ZoneId)

        System.out.println("zdt = " + zdt);
        //2023-07-20T22:03:25.990019300+04:00[Asia/Baku]
        // ASIA BAKU :ZONE ID

        Set<String>zamanZoneIdler = ZoneId.getAvailableZoneIds();

        for (String z : zamanZoneIdler){
            if (z.toLowerCase().contains("Bul"))
                continue;

            System.out.println("zone lar = " + z);
        }

        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);
    }
}
