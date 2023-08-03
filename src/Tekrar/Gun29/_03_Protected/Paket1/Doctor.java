package Tekrar.Gun29._03_Protected.Paket1;

public class Doctor {

    public String hastaneAd; // PUBLIC YAPILDI DIGER PAKETLERDEN ERISIM IZNI VERILDI.

    String adi;  //DEFAULT
    protected String bolumu; //DEFAULT AYNI
    private String sicilNo;  //PRIVATE YAPILDI SADECE CLASS ICINDEN ERISILEBILIR.

    Doctor(){
        // SADECE KENDI PAKETINDEKILER ERISEBILIR
    }

    public Doctor(String adi){
        this.adi = adi;
    }



}
