package Gun38._02_AbstractClass;

public class Dikdortgen extends Sekil{

    private double kisaKenar;
    private double uzunKenar;



    @Override
    double alan() {
        return 0;
    }

    @Override
    double cevre() {
        return 0;
    }

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
