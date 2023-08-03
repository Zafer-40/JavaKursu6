package Gun07;

public class _04_StringEquelsIgnoreCase {
    public static void main(String[] args) {
        /*EqualsIgnoreCase : equals ile ayni calisir ama buyuk kucuk harf ayrimi yapmaz */



        String s1 = "merhaba";
        String s2 = "MERHABA";

        System.out.println("Stringler esitmi = " + s1.equals(s2));
        System.out.println("Stringler esitmi = "+s1.equalsIgnoreCase(s2));
    }
}
