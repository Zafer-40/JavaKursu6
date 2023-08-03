package Gun33._02_Konu;

public class Yilan extends Hayvan{
    private int uzunluk;

    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);

        setUzunluk(uzunluk);
    }


    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public String toString() {
        return super.toString() + " Uzunluk = "+this.uzunluk;
    }

    @Override
    public void konustu() {
        System.out.println("Tiiisladi");
    }
}
