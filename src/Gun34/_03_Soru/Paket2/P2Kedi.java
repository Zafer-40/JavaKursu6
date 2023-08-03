package Gun34._03_Soru.Paket2;

import Gun34._03_Soru.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String isim , String tur){
        super.ad = isim;
        super.cinsi = tur;
        //DEFAULTTAN FARKLI OLARAK
        //EXTEND EDILDIGINDE DIGER PAKETLERDENDE ERISILEBILIR
    }

}
