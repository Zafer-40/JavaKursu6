package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a = new A();// ETKISI YOK
        System.out.println("Mesaj = "+A.mesaj); //A

        B b = new B(); // CONSRUCTOR CALISTI -> STATIC DEGISKENIN DEGERI DEGISTI
        System.out.println("Mesaj = "+A.mesaj); //B

        A a2 = new A(); // STATICIN SON DEGERI NEYSE ONU VERDI
        System.out.println("Mesaj = "+A.mesaj); //B
    }
}
