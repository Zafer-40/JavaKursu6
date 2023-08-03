package Gun34._02_Soru;

public class ilkOgrencisi extends Ogrenci{
    private String klup;
    private static int sayacID = 1;

    public ilkOgrencisi(String isim,String klup) {
        super(isim, ogrTip.ILK);
        setKlup(klup);
        setId(sayacID++);
    }

    @Override
    public String toString() {
        return super.toString()+"\nKlup = "+this.klup;
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}
