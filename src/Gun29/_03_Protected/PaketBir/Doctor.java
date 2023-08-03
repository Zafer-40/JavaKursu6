package Gun29._03_Protected.PaketBir;

public class Doctor {
    public String hastaneAdi;//diger paketlerden erisim izni verildi
    String adi; // default
    protected String bolumu; // default ayni
    private String sicilNo; // sadece classin icinden erisilebilir

    Doctor() { // sadece kendi paketindekiler erisebilir

    }

    public Doctor(String adi) { // diger tum paketlerden de erisilebilir
        this.adi = adi;
    }
}
