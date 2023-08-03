package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Sistem Calismaya Basladi");

        try{
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY,30);
        }
        catch (Exception ex) {
            System.out.println("Hata olustu :"+ex);
            System.out.println("Hata Mesaji :"+ex.getMessage());
        }
        System.out.println("Program Bitti");

    }
}
