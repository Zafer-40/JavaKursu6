package Gun33._03_Soru;

public class SirketMain {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan("Can Yilmaz" ,5000,1.2);
        System.out.println("Personel  "+cal1);
        cal1.maasHesapla();

        GenelMudur gnl1 = new GenelMudur("Hakan Tuna" , 10000,2 ,2000);
        System.out.println("Genel Mudur "+gnl1);
        gnl1.maasHesapla();
    }
}
