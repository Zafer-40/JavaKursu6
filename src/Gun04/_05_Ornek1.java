package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

        int bolunen = 10;
        int bolen = 3;

        double sonuc = bolunen / bolen; // Kural int/int her zaman sonucta int verir.
        System.out.println("sonuc = " + sonuc);

        double sonuc2 = bolunen / (double) bolen; // sonucu double almak icin int degerin birisini double yaptik
        System.out.println("sonuc2 = " + sonuc2);  // int/double sonuc double verir
    }
}
