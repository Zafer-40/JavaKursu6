package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf : verilen karekterlerin indexini verir

        String cumle = "Merhaba Dunya";
        // h nin index numarasi kactir = 3
        // a nin index numarasi kactir = 4
        // du nun index numarasi kactir = 8

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h")); // 3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(Du) = " + cumle.indexOf("Du")); // 8
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok demek
        System.out.println("cumle.indexOf(z) = " + cumle.indexOf("z")); // -1

        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5)); // 6
        // 5 nolu indexten sonra a nin index nosu kac
        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a",7)); // 12
        // 7 nolu indexten sonra a nin index nosu kac
    }
}
