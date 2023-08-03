package Gun27._01_Ornek;

public class Utility {

    public String getString(int sayi){

        return String.valueOf(sayi);
        //Stringe cevir

        //Eğer bir metod nesnenin özelliklerini
        // kullanıyorsa nesne oluşturulmadan
        // kullanılamaz.Dolayısıyla STATİC olamaz
        // NEsne şart
    }

    public static String getString2 (int sayi){

        return String.valueOf(sayi);
        //Stringe cevir

        // Bağımsız metodlar yani STATİC metodlar
        // herhangi bir nesneye bağlı çalışması gerekmeyen
        // metodlardır.

    }
}
