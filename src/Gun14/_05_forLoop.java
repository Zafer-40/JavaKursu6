package Gun14;

public class _05_forLoop {
    public static void main(String[] args) {
        // 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
        // 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)

        int i;

        for (i=0; i<=10; i++){
            System.out.println(i+".sayi = "+i);
        }
        System.out.println("");
        for (i=10; i>=0; i--){
            System.out.println(i+".sayi = "+i);
        }
    }
}
