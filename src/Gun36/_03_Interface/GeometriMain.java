package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz();

        Dikdortgen d = new Dikdortgen();
        d.ciz();

        //INTERFACELERDEN NESNE URETILEMEZ
        //FAKAT REFERANS TIPI OLUSTURULABILIR
        //BU BIZE POLYMORPHISM

        ICizdirir c2 = new Cember();
        c2.ciz();

        // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişebilirsin

        cizdir(c);
        cizdir(d);
        cizdir(c2);


    }
    public static void cizdir(ICizdirir g){
        g.ciz();
    }
}
