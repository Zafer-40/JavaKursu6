package Gun38._01_AbstractClass;

public abstract class BinekOto { //PARENT CLASS
    private String marka;
    private String model;
    private int kapiAdedi;

    abstract int hizlanmaSuresi(); //ABSTRACT EKLENIYOR

    public BinekOto(String marka, String model, int kapiAdedi) {
        setMarka(marka);
        setModel(model);
        setKapiAdedi(kapiAdedi);

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKapiAdedi() {
        return kapiAdedi;
    }

    public void setKapiAdedi(int kapiAdedi) {
        this.kapiAdedi = kapiAdedi;
    }
}
