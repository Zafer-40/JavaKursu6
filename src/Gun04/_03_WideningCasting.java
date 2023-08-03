package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // 1. küçük alanı -> büyüğe atılabiliyor (genişleme-Widening)
        // byte-> short-> int-> long-> float-> double
        // veri kaybı kesinlikle yok

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;

        oran = sayi ;// int -> double genis hafizaya atiliyor.Veri kaybı yok.
        System.out.println("oran = " + oran);

        toplam = sayi; //int -> long Veri kaybı yok.
        System.out.println("toplam = " + toplam);

        oran = toplam ; // long -> double Veri kaybı yok.
        System.out.println("oran = " + oran);

    }
}
