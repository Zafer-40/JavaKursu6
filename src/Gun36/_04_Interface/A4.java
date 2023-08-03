package Gun36._04_Interface;

public class A4 implements IYazdirir,IGosterir{

    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");
    }
}
