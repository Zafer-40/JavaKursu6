package Tekrar.Gun29._03_Protected.Paket1;

public class SaglikBakanligi {
    public static void main(String[] args) {

        Doctor dr1 = new Doctor();
        dr1.adi = "Kemal";
        dr1.bolumu = "Dahiliye";
        dr1.hastaneAd = "Cerrah pasa";

        Doctor dr2 = new Doctor("Kutsi Doktor");


    }

}
