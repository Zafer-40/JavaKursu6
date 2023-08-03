package Gun28._04_Ornek;

public class Banka {
    public static void main(String[] args) {

        Sube sub1 = new Sube();
        sub1.adi = "Karakoy";
        sub1.subeSayisi = 3;
        sub1.kurulusYili = 1989;


        Sube sub2 = new Sube("mecidiyekoy" , 2 , 1980);
        Sube sub3 = new Sube("Kadikoy" , 4);

        System.out.println("Sube 1 bilgileri = "+sub1);
        System.out.println("Sube 2 bilgileri = "+sub2);
        System.out.println("Sube 3 bilgileri = "+sub3);

    }
}
