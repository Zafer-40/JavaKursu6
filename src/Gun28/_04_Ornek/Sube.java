package Gun28._04_Ornek;

public class Sube {
    String adi;
    int subeSayisi;
    int kurulusYili;


    public Sube() {
    }

    public Sube(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Sube(String adi, int subeSayisi) {
        this(adi,subeSayisi,0);
    }

    @Override
    public String toString() {
        return "Sube " +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
