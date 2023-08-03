package Gun07;

public class _11_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase:Stringin hepsini buyuk harfe cevirir.


        String text = "Merhaba Dunya";

        System.out.println("Orjinal Hali = " + text);
        System.out.println("ToUpperCase ile yazildiginda = " + text.toUpperCase());

        boolean bununlaBasliyormu = text.toUpperCase().startsWith("M");
        System.out.println("M veya m ile basliyor mu = "+bununlaBasliyormu);

    }
}
