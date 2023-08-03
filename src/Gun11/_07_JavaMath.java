package Gun11;

public class _07_JavaMath {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri pozitifini verir = " + Math.abs(a));//12
        System.out.println("a ve b den buyuk olani = " + Math.max(a,b));//4
        System.out.println("a ve b den kucuk olani = " + Math.min(a,b));//-12
        System.out.println("2 nin 3. kuvveti = "+ Math.pow(2,3)); //2x2x2
        System.out.println("b nin karekoku = "+Math.sqrt(b));//2
        System.out.println("Round yuvarlama = "+Math.round(3.1));//3
        System.out.println("Round yuvarlama = "+Math.round(3.5));//5

        System.out.println("ceil buyuk en yakin rakam yuvarlama = "+Math.ceil(3.1));//4
        System.out.println("ceil buyuk en yakin rakama yuvarlama = "+Math.ceil(3.9));//4
        System.out.println("flour kucuk en yakin rakama yuvarlama = "+Math.floor(3.1));//3
        System.out.println("flour kucuk en yakin rakama yuvarlama = "+Math.floor(3.9));//3



    }
}
