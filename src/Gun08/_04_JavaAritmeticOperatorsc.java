package Gun08;

public class _04_JavaAritmeticOperatorsc {
    public static void main(String[] args) {

        int a = 9;
        int b = 5;

        System.out.println("Toplama islemi");
        System.out.println("a+b sonucu = "+ (a+b));

        System.out.println("Cikartma islemi");
        System.out.println("a-b sonucu = "+ (a-b));

        System.out.println("Carpma islemi");
        System.out.println("axb sonucu = "+ (a*b));

        System.out.println("Bolme islemi");
        System.out.println("a/b sonucu = "+ (a/b)); //int i int a bolersen kusurati yazmaz
        System.out.println("a/b sonucu = "+ ((double)a/b)); // bu sebeple birisini double yaptik

        System.out.println("Modul islemi = bolumden kalan demek");
        System.out.println("a%b = "+ (a%b)); // 4
        System.out.println("b%a = "+ (b%a)); // 5

        int sonuc = 145/10; // int/int = int
        System.out.println("Sonuc = "+sonuc);





    }
}
