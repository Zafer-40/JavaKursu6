package Gun34._02_Soru;

public class LiseOgrencisi extends Ogrenci{

    private String brans;
    private static int sayacID = 1;
    public LiseOgrencisi(String isim, String brans) {
        super(isim, ogrTip.LISE);
        setBrans(brans);
        setId(sayacID++);
    }

    @Override
    public String toString() {
        return super.toString()+"\nBrans = "+this.brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
