package Gun04;

public class _02_tipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1 = 98;
        byte ogrNot2 = 97;
        byte ogrNot3 = 99;
        byte ogrNot4 = 100;

        int toplamNot = ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamNot = " + toplamNot);

        byte toplam2 =(byte) toplamNot; //toplam notu byte olcusundeki alana atadim basina byte aciklamasi koymamlazim
        System.out.println("ogrNot2 = " + ogrNot2);

    }
}
