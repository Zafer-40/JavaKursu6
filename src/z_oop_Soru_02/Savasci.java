package z_oop_Soru_02;

public class Savasci extends Karakter{
    private int guc=10;
    public Savasci(String ad, String seviye, int saglik) {
        super(ad, seviye, saglik);



    }
    public void ozelYetenekKullan(int guc){
         int exGuc = getSaglik()+guc;
        System.out.println("Extra Guc :"+exGuc);

    }

    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Guc :"+guc);
    }
}
