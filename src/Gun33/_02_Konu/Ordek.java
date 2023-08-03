package Gun33._02_Konu;

public class Ordek extends Hayvan{
    private int kanatAcikligi;
    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }



    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public String toString() {
        return super.toString() + " Kanat Acikligi = "
                +this.kanatAcikligi;
    }

    @Override
    public void konustu() {
        System.out.println("Vak Vakladi");
    }
}
