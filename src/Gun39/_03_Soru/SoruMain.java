package Gun39._03_Soru;

public class SoruMain {
    public static void main(String[] args) {
        Kedi cat = new Kedi("Karakedi",false,"Eylul 15");
        System.out.println("-------------");
        System.out.println(cat.getClass().getSimpleName());
        System.out.println(cat);
        cat.gunlukUykuSuresi();
        cat.yiyecegi();
        cat.yemekMiktari();
        cat.sesi();
        System.out.println("-------------");

        Kartal kelKartal = new Kartal("Kel Kartal",true,"Haziran 8");
        System.out.println(kelKartal.getClass().getSimpleName());
        System.out.println(kelKartal.toString());
        kelKartal.gunlukUykuSuresi();
        kelKartal.yiyecegi();
        kelKartal.yemekMiktari();
        kelKartal.sesi();
    }
}
