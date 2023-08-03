package Gun08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {
        //ReplaceFirst: bir string  icerindeki karakter ya da karakterleri sadece ilkini degistirmeye yarar

        String text = "Merhaba Dunya";
        System.out.println("Orjinal Cumlemiz = " + text);
        System.out.println("Stringde a olanlari e ile degistir = " +text.replaceFirst("a","e"));
        System.out.println("Stringde ba olanlari de ile degistir = " +text.replaceFirst("ba","de"));
        System.out.println("Stringde a yerine bosluk yap = "+text.replaceFirst("a",""));

    }
}
