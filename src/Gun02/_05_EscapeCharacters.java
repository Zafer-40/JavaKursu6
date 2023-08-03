package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        //  \n  -> satir basi yapar
        //  \t  -> tab tusu kadar bosluk birakir
        //  \b  -> backspace etkisi yapar 1 bosluk siler
        //  \"  -> tirnak yazdirmak icin kullanilir
        //  \\  -> ekrana bir tane slas \ yazar
        //  \r  -> satir basina git

        System.out.println("MerhabaDunya");
        System.out.println("Merhaba\tDunya");
        System.out.println("Merhaba\bDunya");
        System.out.println("\"MerhabaDunya\"");
        System.out.println("Merhaba\\Dunya");
        System.out.println("Merhaba\rDunya");

    }
}
