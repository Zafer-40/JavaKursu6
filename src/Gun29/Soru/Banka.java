package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.ad = "Zafer";
        mus1.soyad = "Cansiz";
        mus1.musteriNo = 12;

        mus1.musHesap.paraYatir(100);
        mus1.musHesap.paraYatir(200);
        mus1.musHesap.paraCek(50);

        System.out.println("Musteri hesap hareketleri ="+mus1.musHesap);




    }
}
