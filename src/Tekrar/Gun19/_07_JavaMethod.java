package Tekrar.Gun19;

import java.util.Arrays;

public class _07_JavaMethod {
    public static void main(String[] args) {

        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int[] array = new int[20];

        arrayiYaz(array);
    }
    public static void arrayiYaz(int[] array){
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random()*100);

        }
        System.out.println(Arrays.toString(array));
    }
}
