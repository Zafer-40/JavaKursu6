package Gun33._02_Konu;

public class Kedi extends Hayvan{

    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); //SUPER MIRAS ALINAN KISIM
    }

    @Override
    public void konustu() {

        System.out.println("Miyavladi");
    }
}
