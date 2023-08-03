package Tekrar.Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();
        merhabaYaz();
        System.out.println();

        merhabaYazIsime("Zafer");
        System.out.println();
        cokMerhabaYaz(3);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba");

    }

    public static void merhabaYazIsime(String ad){
        System.out.println("Merhaba "+ad);
    }

    public static void cokMerhabaYaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");
        }


    }
}
