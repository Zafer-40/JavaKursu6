package Gun39._03_Soru;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Hazir mama");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunde 2 defa");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("12 Saat");

    }

    @Override
    void sesi() {
        System.out.println("Miyav Miyav");

    }
}
