package Gun16;

public class _06_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar = {"TRT", "KanalD", "ATV", "FOX", "STAR"};

        int randonIndex = (int) (Math.random()*kanallar.length);
        System.out.println("Secilen kanal = " +kanallar[randonIndex]);
    }
}
// TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
// TODO : fakat bir buldunu tekrar bulmasın
