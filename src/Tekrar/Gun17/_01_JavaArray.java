package Tekrar.Gun17;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan
        // Random atayarak doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random()*10);
        }

        for (int i = 0; i < array.length; i++) {

        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                array[i]=0;
            else
                array[i]=1;
        }
        System.out.println(Arrays.toString(array));


    }
}
