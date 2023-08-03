package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 3 notun ("83","95","56") ortalamasını bulunuz.

        String not1 = "82";
        String not2 = "95";
        String not3 = "56";

        int ortNot1 = Integer.parseInt(not1);
        int ortNot2 = Integer.parseInt(not2);
        int ortNot3 = Integer.parseInt(not3);
        
        double ortalama = (ortNot1+ortNot2+ortNot3)/(double)3;
        System.out.println("ortalama = " + ortalama);



    }
}
