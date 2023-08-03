package Gun33._03_Soru;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatSayisi;

    public void maasHesapla(){
        double esasMaas = maas*maasKatSayisi;
        System.out.println("Net Maas = "+esasMaas);
    }

    public Calisan(String isim, double maas, double maasKaySayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKaySayisi(maasKaySayisi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKaySayisi() {
        return maasKatSayisi;
    }

    public void setMaasKaySayisi(double maasKaySayisi) {
        this.maasKatSayisi = maasKaySayisi;
    }

    @Override
    public String toString() {
        return
                "Isim = " + isim + " "+
                "Maas = " + maas + " "+
                "MaasKaySayisi =" + maasKatSayisi ;
    }
}
