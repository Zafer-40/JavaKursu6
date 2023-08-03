package Gun33._02_Konu;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        //super.konustu();
        System.out.println("Havladi");
    }
}
