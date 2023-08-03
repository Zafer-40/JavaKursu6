package Gun31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay = Aylar.AGUSTOS;

        System.out.println("Ay = "+ay);
        System.out.println("Ay no = "+ay.ayNo);
        System.out.println("Gun sayisi = "+ay.gunSayisi);
        System.out.println("Ay Adi = "+ay.ayAdi);
        System.out.println("******************");
        for (Aylar a : Aylar.values())
            System.out.println(a.ayNo+"->"+a.ayAdi+"->"+a.gunSayisi);
    }
}
