package Gun39._03_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Balik Cig et");

    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunde 1 defa");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("6 saat");

    }

    @Override
    void sesi() {
        System.out.println("Ciyak ciyak");

    }
}
