package Gun28._05_Ornek;



public class Tedas {
    public static void main(String[] args) {

        Musteri abone1 = new Musteri("Zafer");

        abone1.elkHesap.tuketimEkle(50);
        abone1.elkHesap.tuketimEkle(60);
        abone1.elkHesap.tuketimEkle(70);

        System.out.println("Toplam tuketim = "+abone1.elkHesap.toplamTuketim);

        abone1.elkHesap.faturaYaz();






    }

    }

