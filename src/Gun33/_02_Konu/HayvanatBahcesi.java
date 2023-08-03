package Gun33._02_Konu;

public class HayvanatBahcesi {
    public static void main(String[] args) {

        Kedi kedi1 = new Kedi("Boz" , 1 , "Tekir");
        System.out.println("Kedi 1 = "+kedi1);
        kedi1.konustu();

        Kopek kopek1 = new Kopek("Beyaz" , 6 , "Hasky");
        System.out.println("Kopek 1 = "+kopek1);
        kopek1.konustu();

        Yilan yilan1 = new Yilan("Kirmizi" , 3, "Kobra" , 3);
        System.out.println("Yilan 1 = "+yilan1);
        yilan1.konustu();

        Ordek ordek1 = new Ordek("Beyaz" , 5,"Yaban",1);
        System.out.println("Ordek 1 = "+ordek1);
        ordek1.konustu();
    }
}
