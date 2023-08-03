package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {

        int[] dizi = new int[5]; // 0,1,2,3,4 indexli 5 elemanli dizi
        int[] dizi2 = {2,33,4,567,11}; // 5 elemanli dizi hem tanimlandi hemde deger atandi

        String[] cumleler = new String[5]; // 5 tane cumle saklayabilen bir String dizi degiskeni
        boolean[] dizi3 = new boolean[5];  // 5 tane true false saklayabilen bir dizi degiskeni
        double[] oranlar = new double[5]; // 5 tane double saklayabilen bir dizi degiskeni

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizi = "+dizi[i]);

        }
        for (int i = 0; i < cumleler.length; i++) {
            System.out.println("cumleler = "+cumleler[i]);
        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("Boolean dizi = " + dizi3[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " + oranlar[i]);
        }




    }
}
