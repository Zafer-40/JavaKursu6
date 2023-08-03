package Gun07;

public class _06_StringSubString {
    public static void main(String[] args) {
        //SubString: Stringin belirtilen bir bolumunu almaya yarar

        String s1 = "Merhaba arkadaslar";

        String parca1 = s1.substring(3,9); // 3 den 9 a kadar al 9 dahil degil
        System.out.println("Parca 1 i yazdir = "+parca1);

        String parca2 = s1.substring(8,15);
        System.out.println("Parca 2 yi yazdir = "+parca2);

        String parca3 = s1.substring(8);// 8 den baslayip sonuna kadar al
        System.out.println("Parca 3 u yazdir = "+parca3);




    }
}
