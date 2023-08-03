package Gun38._02_AbstractClass;

public class Daire extends Sekil{


    private double yaricap;

    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yaricap;
    }


    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

}
