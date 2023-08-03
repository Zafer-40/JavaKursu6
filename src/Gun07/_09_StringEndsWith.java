package Gun07;

public class _09_StringEndsWith {
    public static void main(String[] args) {
    //EndsWith:verilen karakter veya karakterler ile bitiyormuyu sorgular sonuc boolean verir.

        String text = "Merhaba Dunya";

        System.out.println("ya ile bitiyor mu? = "+text.endsWith("ya")); //true
        System.out.println("YA ile bitiyor mu? = "+text.endsWith("YA")); // false
        System.out.println("a ile bitiyor mu? = "+text.endsWith("a")); // true
        System.out.println("Dunya ile bitiyor mu? = "+text.endsWith("Dunya")); // true
        System.out.println("dunya ile bitiyor mu? = "+text.endsWith("dunya")); // false





    }
}
