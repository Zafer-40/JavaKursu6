package z_oop_Soru_01;

public class Kartal extends Hayvan{
    public Kartal(String adi, String yasamAlani) {
        super(adi, yasamAlani);
    }

    @Override
    public void beslen() {
        System.out.println(adi+ " balik yiyerek beslenir");
    }

    @Override
    public void sesCikar() {
        System.out.println(adi+ " cey cey diyerek ucuyor");
    }
}
