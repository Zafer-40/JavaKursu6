package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll: replace gibi calisir.Farki kriter (regex) verilebiliyor.
        // TODO yapilacak = regex olarak neler yazilabiliyor google dan arastiralim.
        String text = "Merhaba1 Dunya234";
        System.out.println("Orjinal Cumlemiz = " + text);
        System.out.println("abn harflerini _ yap = " + text.replaceAll("[abn]","_"));
        System.out.println("A dan Z ye kadar harfleri * yap = " + text.replaceAll("[A-Z]","*"));
        System.out.println("0-9 arasi rakamlari sil = " + text.replaceAll("[0-9]",""));
        System.out.println("0-9 arasi rakamlar disindakileri sil = " + text.replaceAll("[^0-9]",""));

    }
}
