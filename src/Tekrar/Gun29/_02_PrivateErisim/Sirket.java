package Tekrar.Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id = 12;
        cal1.name = "Can";
        cal1.surname = "Bonomo";

        cal1.sifreAta("12345");
        cal1.sifreAta("12345abcde");
        cal1.sifreGoster();

    }
}
