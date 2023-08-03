package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1 ="Bugun hava cok guzel";
        String cumle2 ="Bugun hava cok guzel";

        //ILKEL TIPLERI KARSILASTIRDIGINDA DEGERLERI KARSILASTIRIR CUNKU
        //BASKA BIRSEYLERI YOK

        if (cumle1==cumle2){
            System.out.println("Cumle1 Cumle2 ye ESITTIR");
        }else
            System.out.println("Esit DEGILDIR");
        System.out.println("***************");

        if (cumle1.equals(cumle2)){
            System.out.println("ESIT");
        }else System.out.println("DEGIL");
        System.out.println("***************");

        //REFERANS TIPLERDE ISE DURUM
        //SCANNER ILE EKRANDAN OKUDUGUNDA ASAGIDAKI GIBI OLUR

        String cumle3 = new String("Bugun hava cok guzel");
        String cumle4 = new String("Bugun hava cok guzel");

        //MANASI REFERANSLARI AYNIMI
        if (cumle3==cumle4){
            System.out.println("Cumle1 Cumle2 ye ESITTIR");
        }else
            System.out.println("Esit DEGILDIR");
        System.out.println("***************");

        //DEGERLERI AYNIMI
        if (cumle3.equals(cumle4)){
            System.out.println("ESIT");
        }else System.out.println("DEGIL");

        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır




    }
}
