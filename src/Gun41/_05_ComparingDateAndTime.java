package Gun41;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean sonrami = bugun.isAfter(dun); //BUGUN DUNDEN SONRAMI
        System.out.println("sonrami = " + sonrami);
        System.out.println("---------");

        boolean oncemi = bugun.isBefore(dun); // BUGUN DUNDEN ONCEMI
        System.out.println("oncemi = " + oncemi);
        System.out.println("---------");

        boolean esitmi = bugun.isEqual(dun); // BUGUN DUNE ESITMI
        System.out.println("esitmi = " + esitmi);
        System.out.println("---------");

        boolean artikYilmi = bugun.isLeapYear(); //BUGUNUN BULUNDUGU YIL ARTIK YILMI
        System.out.println("artikYilmi = " + artikYilmi);

    }
}
