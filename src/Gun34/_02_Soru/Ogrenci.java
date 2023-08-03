package Gun34._02_Soru;

public class Ogrenci {

    private int id;
    private String isim;
    private ogrTip tipi;

    private static int sayacID = 1;

    public Ogrenci(String isim, ogrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        setId(sayacID++);
    }

    @Override
    public String toString() {
        return "\nOgrenci Bilgileri" +
                "\nid = " + id +
                "\nisim = " + isim +
                "\nTipi = " + tipi ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ogrTip getTipi() {
        return tipi;
    }

    public void setTipi(ogrTip tipi) {
        this.tipi = tipi;
    }
}
