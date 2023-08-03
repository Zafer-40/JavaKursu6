package Gun07;

public class _08_StringStartsWith {
    public static void main(String[] args) {
        //StartsWith: bununla basliyor mu sorgusu gecer. cevap boolean olur.

        String text = "HCL Technology";

        System.out.println("HC ile basliyor mu? = "+text.startsWith("HC")); // true
        System.out.println("te ile basliyor mu? = "+text.startsWith("te")); // false
        System.out.println("h ile basliyor mu? = "+text.startsWith("t")); // false
        System.out.println("H ile basliyor mu? = "+text.startsWith("H")); // true



    }
}
