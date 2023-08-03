package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1 = new Kisi();
        //kisi1.ad = "Ismet";
        //kisi1.soyad = "Temur";
        //kisi1.yas = -25;

        kisi1.setAd("Ismet");
        kisi1.setSoyad("Temur");
        kisi1.yasAta(-25);

        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());
        System.out.println(kisi1.yasVer());

        //DEGISKENE DIREKT ERISIMI KAPATIP
        //BIR METOD ILE KORUMALI VERI GONDERME VE ALMA
        //ISLEMINE Encapsulation DENIR

    }
}
