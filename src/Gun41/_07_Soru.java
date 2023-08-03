package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        // yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.

        // Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        // Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        //TARIHI ALALIM
        System.out.print("Taksit baslangic tarihi (01.05.2023) = ");
        String strTarih = okuStr.nextLine();
        LocalDate basTarih = LocalDate.parse(strTarih,f);

        //TOPLAM PARA MIKTARINI ALALIM
        System.out.print("Taksitlendirilecek miktar = ");
        int toplamPara = okuInt.nextInt();

        //TAKSIT SAYISI
        System.out.print("Taksit Sayisi = ");
        int takSay = okuInt.nextInt();

        int taksitMik = toplamPara/takSay; // 1 AYA DUSEN ODEME

        System.out.println("Odeme Planiniz");
        for (int i = 1; i <= takSay ; i++) {
            System.out.print(i);
            System.out.print(" "+ basTarih.plusMonths(i-1).format(f));
            System.out.println(" "+ taksitMik + " TL");

            
        }









    }
}
