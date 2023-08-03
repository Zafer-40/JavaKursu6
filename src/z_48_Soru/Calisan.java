package z_48_Soru;

public class Calisan {

    public String ad;
    public String soyisim;
    public int maas;
    public int tecrube;
    public String departman;



    public Calisan(String ad, String soyisim, int maas, int tecrube, String departman) {
        this.ad = ad;
        this.soyisim = soyisim;
        this.maas = maas;
        this.tecrube = tecrube;
        this.departman = departman;
    }

    public void calisanBilgileriGoster(){
        System.out.println("** CALISAN BILGILERI **");
        System.out.println("Isim = "+this.ad);
        System.out.println("Soyisim = "+this.soyisim);
        System.out.println("Maas = "+this.maas);
        System.out.println("Tecrubesi = "+this.tecrube);
        System.out.println("Departmani = "+this.departman);
    }

    public void maasArtisi(int artisRakami){
        System.out.println(this.ad +" "+this.soyisim+" isimli personele "+artisRakami+ " TL zam yapildi");
        System.out.println("Guncel Maasi = "+ (this.maas+artisRakami));
    }

    public void testYap(String testAdi , String testYapan ){
        System.out.println("Suan "+testYapan+" "+testAdi+" testini gerceklestiriyor");
    }

    public void departmanDegisimi(String yeniDepartman , String kisi){
        System.out.println(kisi+" artik"+this.departman+" departmaninda degil "+yeniDepartman+" departmaninda calisiyor");
    }
}
