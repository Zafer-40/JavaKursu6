package Gun04;

public class _08_Ornek4 {
    public static void main(String[] args) {

        String ad = "Zafer";
        int sinifNo = 5;
        char subesi = 'A';
        boolean gectimi = true;

        System.out.println(ad+sinifNo+subesi+gectimi);

        //+ nin herhangibir tarafinda String var ise diger degiskenler otomatik String e donusur.

        System.out.println("Merhaba" +1+2); // birlestirme islemi soldan saga ilerler
        System.out.println(1+2+ "Merhaba");
    }
}
