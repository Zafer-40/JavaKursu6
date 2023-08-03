package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //KULLANICIDAN ALINAN VE STRING DURUMUNDAKI TIME VE TARIH
        // BILGISININ TIME VEYA TARIH BILGISINE CEVRILMESI

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023) = ");
        String strTarih = oku.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih = LocalDate.parse(strTarih,f);
        System.out.println("Tarih = "+tarih.format(f));


    }
}
