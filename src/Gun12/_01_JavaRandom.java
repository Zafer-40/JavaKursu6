package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {

        double randomSayi = Math.random(); // 0 ile 0,999999999 arasi rastgele sayi verir

        System.out.println("Random Sayi = "+randomSayi);

        int rndTamSayi = (int) (randomSayi*10);
        System.out.println("Random Tam Sayi = "+rndTamSayi);

        int rnd = (int) (Math.random()*10);
        System.out.println(rnd);


    }
}
