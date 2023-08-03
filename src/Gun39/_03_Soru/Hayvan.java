package Gun39._03_Soru;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    private static int sayacID=1;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = sayacID++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                "\nIsim=" + isim +
                "\nVahsi=" + vahsi +
                "\nDogumTarihi=" + dogumTarihi
                ;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
