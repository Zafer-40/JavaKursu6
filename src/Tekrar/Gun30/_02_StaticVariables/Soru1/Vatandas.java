package Tekrar.Gun30._02_StaticVariables.Soru1;

public class Vatandas {
    String name;
    String adres;
    final int tcNo;

    private static int sayac = 202301;

    public Vatandas(String name, String adres) {
        this.name = name;
        this.adres = adres;
        this.tcNo = sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas Bilgileri" +
                "\nAdi = " + name +
                "\nAdres = " + adres +
                "\nTcNo = " + tcNo ;
    }
}
