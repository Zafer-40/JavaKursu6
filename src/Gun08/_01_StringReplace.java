package Gun08;

public class _01_StringReplace {
    public static void main(String[] args) {
        //Replace: bir string  icerindeki karakter ya da karakterleri verilen degerle degistirmeye yarar

        String text = "Merhaba Dunya";
        System.out.println("Orjinal Cumlemiz = " + text);
        System.out.println("Stringde a olanlari e ile degistir = " +text.replace("a","e"));
        System.out.println("Stringde ba olanlari de ile degistir = " +text.replace("ba","de"));
        System.out.println("Stringde Merhaba yi Hello ile degistir = " +text.replace("Merhaba","Hello"));
        System.out.println("Stringde a yerine bosluk yap = "+text.replace("a",""));


    }
}
