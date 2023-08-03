package Gun42;

import java.util.Arrays;

public class _03_JavaVeriTipleri {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 12;

        sayi1=sayi2;
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1); // 34
        System.out.println("sayi2 = " + sayi2); // 45
        System.out.println("============");

        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); // 1,2,3,4
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); // 5,6

        dizi1=dizi2;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); // 5,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); // 5,6
        System.out.println("============");

        dizi1[0]=67;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); //67,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); //67,6
        System.out.println("============");

        dizi2[0]=55;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1)); //55,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2)); //55,6
        System.out.println("============");


        String ad1 = "mehmet";
        String ad2 = "ismet";
        ad1=ad2;
        System.out.println("ad1 = " + ad1); //ismet
        System.out.println("ad2 = " + ad2); //ismet
        System.out.println("============");

        ad1="ali";
        System.out.println("ad1 = " + ad1);//ali
        System.out.println("ad2 = " + ad2);//ismet
        System.out.println("============");

        ad2="zeynep";
        System.out.println("ad1 = " + ad1); // ali
        System.out.println("ad2 = " + ad2); // zeynep
        System.out.println("============");








    }
}
