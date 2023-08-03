package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        //veri kaybi olur dikkatli olmak lazim

        int toplam = 6700;
        byte sayi = 5;

        sayi = (byte) toplam;
        System.out.println("sayi = " + sayi);

        double oran = 3.7;
        toplam = (int) oran;
        sayi = (byte) oran;
        System.out.println("toplam = " + toplam);

    }
}
