package Gun29._03_Protected.PaketBir;

public class SaglikBakanligi {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor();
        doc1.hastaneAdi = "Numune hastanesi";
        doc1.adi = "Servet";
        doc1.bolumu = "Dahiliye";

        Doctor doc2 = new Doctor("Mehmet");

    }
}
