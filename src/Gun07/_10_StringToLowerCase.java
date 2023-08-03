package Gun07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {
        //ToLowerCase: Stringi kucuk harfe cevirir

        String text = "Merhaba Dunya";

        System.out.println("Orjinal halini yazdir = "+text);

        System.out.println("ToLowerCase ile yazdir = "+text.toLowerCase());

        boolean basliyormu = text.startsWith("M"); //true
        boolean basliyormu2 = text.startsWith("m"); // false
        boolean basliyormuIgnorCase = text.toLowerCase().startsWith("m"); // true

        System.out.println("basliyormu = " + basliyormu);
        System.out.println("basliyormu2 = " + basliyormu2);
        System.out.println("basliyormuIgnorCase = " + basliyormuIgnorCase);
    }
}
