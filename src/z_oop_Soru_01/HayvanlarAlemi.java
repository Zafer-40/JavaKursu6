package z_oop_Soru_01;

public class HayvanlarAlemi {
    public static void main(String[] args) {
        Aslan aslan1 = new Aslan("Aslan Kral","Afrika Savanalari");
        Fil fil1 = new Fil("Gri Buyuk Fil","Afrika duzlukleri");
        Kartal kartal1 = new Kartal("Kel Kartal","Alaska");

        aslan1.bilgileriYazdir();
        aslan1.beslen();
        aslan1.sesCikar();
        System.out.println("===========");
        fil1.bilgileriYazdir();
        fil1.beslen();
        fil1.sesCikar();
        System.out.println("===========");
        kartal1.bilgileriYazdir();
        kartal1.beslen();
        kartal1.sesCikar();
    }
}
