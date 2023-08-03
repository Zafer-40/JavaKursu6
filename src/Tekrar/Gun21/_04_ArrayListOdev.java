package Tekrar.Gun21;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_ArrayListOdev {
    public static void main(String[] args) {

        //Soru 1- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

        /*int[][] arrays2d = {{1, 2, 3},{ 4, 5, 6},{7,8,9}};
        for (int i = 0; i < arrays2d.length; i++) {
            for (int j = 0; j < arrays2d[i].length; j++) {
                System.out.print(arrays2d[i][j]+ " ");
            }
            System.out.println();
        }
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < arrays2d.length; i++) {
            for (int j = 0; j < arrays2d[i].length; j++) {

                alist.add(arrays2d[i][j]);
            }

        }
        System.out.println(alist); */

        //Soru 2-ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Orange");
        myArrayList.add("Kiwi");
        myArrayList.add("Peach");
        myArrayList.add("Banana");
        myArrayList.add("Orange");

        int sayac = getCount(myArrayList , "Orange");

        System.out.println(sayac);
    }
    public static int getCount(ArrayList<String> a, String str){
        int sayac = 0;
        for (int i = 0; i < a.size(); i++) {

            if (a.get(i).equalsIgnoreCase("Orange"))
                sayac++;
        }

        return sayac;
    }

}
