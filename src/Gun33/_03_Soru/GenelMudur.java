package Gun33._03_Soru;

public class GenelMudur extends Calisan{
    private double tazminat;
    public GenelMudur(String isim, double maas, double maasKaySayisi,double tazminat) {
        super(isim, maas, maasKaySayisi);
        setTazminat(tazminat);

    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public void maasHesapla() {
     double netMaas=(this.getMaas()*this.getMaasKaySayisi())+this.getTazminat();
        System.out.println("Net Maas = "+netMaas);
    }

    @Override
    public String toString() {
        return super.toString()+" Tazminat = "+this.tazminat;
    }
}
