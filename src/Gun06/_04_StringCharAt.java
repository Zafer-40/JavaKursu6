package Gun06;

public class _04_StringCharAt {
    public static void main(String[] args) {

        //istenilen noktadaki indexteki karakteri verir

        String cumle = "Merhaba Dunya"; // uzunlugu 13 ama 0 dan basladigi icin 12 karakter.

        System.out.println("Uzunlugu = "+ cumle.length());

        char ilkHarf = cumle.charAt(0); // 0 daki karakteri ver diyor.
        System.out.println("ilkHarf = " + ilkHarf);

    }
}
