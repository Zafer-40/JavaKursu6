package Gun32._02_Soru;

public class ArabaMain {
    public static void main(String[] args) {

        Araba car1 = new Araba();

       car1.setRenk("Kirmizi");
       car1.setModel(2023);
       car1.setKapiSayisi(8);
       car1.setMotorHacmi(1900);

        System.out.println("Car 1 = "+car1);

        Araba car2 = new Araba("Siyah",2045,5000,23);
        System.out.println("Car 2 = "+car2);

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

    }
}
