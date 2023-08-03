package Gun30._02_FinalVariables.Ornek2;

public class Vatandas {

    String ad;
    String adres;
    final int tcNo;

    private static int sayac=202301;

    public Vatandas(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
        this.tcNo = sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas Adi =" +
                 ad + '\'' +
                ", adres='" + adres + '\'' +
                ", tcNo=" + tcNo ;
    }
}
