package Gun26._03_Ornek;

public class Sekil {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.lenght = 5;
        r.width = 4;

        int cevre = r.cevre();
        System.out.println("Return lu Cevre = "+r.cevre());
        r.alan();
        r.cevre2();


    }

}
