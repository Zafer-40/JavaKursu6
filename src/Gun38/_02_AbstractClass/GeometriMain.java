package Gun38._02_AbstractClass;

public class GeometriMain {
    public static void main(String[] args) {
        Daire dr = new Daire(4);
        dr.setName("Daire");
        dr.ciz();
        System.out.println(dr);



        Dikdortgen d = new Dikdortgen(5,4);
        d.setName("Dikdortgen");
        d.ciz();
        System.out.println(d);

    }

}
