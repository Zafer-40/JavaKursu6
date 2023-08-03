package Gun34._02_Soru;

public class OkulMain {
    public static void main(String[] args) {
        LiseOgrencisi lo1 = new LiseOgrencisi("Can Bonomo","FIZIK");
        LiseOgrencisi lo2 = new LiseOgrencisi("Yildiz Tilbe","MUZIK");
        LiseOgrencisi lo3 = new LiseOgrencisi("Cem karaca","MUZIK");
        ilkOgrencisi io1 = new ilkOgrencisi("Ali Demir","IZCI");
        ilkOgrencisi io2 = new ilkOgrencisi("Ahmet Tasci","IZCI");

        System.out.println(lo1);
        System.out.println(lo2);
        System.out.println(lo3);
        System.out.println(io1);
        System.out.println(io2);
    }
}
