package Gun34._01_Soru;

public class Arac {
    private String renk;
    private int motorHacmi;
    private String marka;

    public Arac(String renk, int motorHacmi, String marka) {
        setRenk(renk);
        setMotorHacmi(motorHacmi);
        setMarka(marka);
    }

    @Override
    public String toString() {
        return
                "\nRenk= " + renk +
                "\nMotor Hacmi= " + motorHacmi +
                "\nMarka= " + marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

}
