package Gun19;

public class _05_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();
        merhabaYaz();

        ismeMerhabaYaz("Zafer");

        ucKereYaz(3);

    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
    }

    public static void ismeMerhabaYaz(String ad){
        System.out.println("Merhaba "+ad);
    }

    public static void ucKereYaz(int miktar){
        for (int i = 0; i < miktar; i++) {
            System.out.println("Tekrarlanan cumle ");
        }

    }
}
