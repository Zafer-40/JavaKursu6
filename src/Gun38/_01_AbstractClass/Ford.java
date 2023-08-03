package Gun38._01_AbstractClass;

public class Ford extends BinekOto{
    public Ford(String marka, String model, int kapiAdedi) {
        super(marka, model, kapiAdedi);
    }

    @Override
    int hizlanmaSuresi() {
        return 0;
    }
}
