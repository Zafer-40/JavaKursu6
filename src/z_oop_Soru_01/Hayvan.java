package z_oop_Soru_01;

public class Hayvan implements IHayvan{

    String adi;
    String yasamAlani;

    public Hayvan(String adi, String yasamAlani) {
        this.adi = adi;
        this.yasamAlani = yasamAlani;
    }

    public void beslen(){
        System.out.println(adi+" besleniyor..");
    }

    public void bilgileriYazdir(){
        System.out.println("Adi : "+this.adi);
        System.out.println("Yasam Alani : "+this.yasamAlani);
    }

    @Override
    public void sesCikar() {
        System.out.println(adi+" ses cikariyor");

    }
}
