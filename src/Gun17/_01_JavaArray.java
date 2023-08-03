package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.


        int[] sayi = new int[4];

        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = (int) (Math.random()*10);
            System.out.println("Random atanan sayilar = "+sayi[i]);

           }
        System.out.println("***************");

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]%2==0){
                System.out.println("Cift sayilar = "+ 0);
            }else
                System.out.println("Tek sayilar = "+ 1);

        }
        }


    }

