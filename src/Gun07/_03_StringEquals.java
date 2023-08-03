package Gun07;

public class _03_StringEquals {
    public static void main(String[] args) {
        /* Equals: 2 Stringin birbirine esit olup olmadigini kontrol eder sonucu boolean verir*/

        String s1 = "Merhaba";
        String s2 = "mErhabA";

        boolean esitMi = s1.equals(s2);
        System.out.println("Stringler Esit mi? = "+esitMi);

        System.out.println("Stringler Esit mi? = "+s1.equals(s2));

        System.out.println("Stringler Esit mi? = "+s1.equals("Merhaba"));

    }
}
