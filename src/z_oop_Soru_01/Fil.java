package z_oop_Soru_01;

public class Fil extends Hayvan{
    public Fil(String adi, String yasamAlani) {
        super(adi, yasamAlani);
    }

    @Override
    public void beslen() {
        System.out.println(adi+ " ot yiyerek beslenir");
    }

    @Override
    public void sesCikar() {
        System.out.println(adi+ " hortumuyla ses cikartir");
    }
}
