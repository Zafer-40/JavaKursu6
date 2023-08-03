package Gun17;

public class _05_StringTrim {
    public static void main(String[] args) {
        // trim : String basindaki ve sonundaki bosluklari siler

        String text = "   Merhaba Dunya   ";

        System.out.println("Orjinal halini goreceksin = ->"+text+"<-");

        System.out.println("Trimli halini goreceksin = ->"+text.trim()+"<-");

    }
}
