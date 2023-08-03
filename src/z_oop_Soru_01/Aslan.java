package z_oop_Soru_01;

public class Aslan extends Hayvan{
    public Aslan(String adi, String yasamAlani) {
        super(adi, yasamAlani);
    }

    @Override
    public void beslen() {
        System.out.println(adi+ " et yiyerek beslenir");
    }

    @Override
    public void sesCikar() {
        super.sesCikar();
        System.out.println(adi+ " kukreyerek ses cikartir");
    }
}
