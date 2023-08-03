package Gun07;

public class _02_StringContains {
    public static void main(String[] args) {
        /* Contains : bir stringin icerisinde olan karakter ya da karakterlerin var olup olmadigini boolen
        cinsinden True ya da False olarak yanitlar */

        String cumle = "Merhaba Dunya";
        boolean varMi = cumle.contains("a");
        System.out.println("a Harfi var mi? = "+varMi);

        System.out.println("a Harfi var mi? = "+cumle.contains("a"));
        System.out.println("ya hecesi var mi? = "+cumle.contains("ya"));
        System.out.println("z harfi var mi? = "+cumle.contains("z"));



    }
}
