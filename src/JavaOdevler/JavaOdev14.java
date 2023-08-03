package JavaOdevler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaOdev14 {
    public static void main(String[] args) {
//        Soru 1 - totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//        hashset ; 4,2,3,1,7
//        cevap: 5

        /*HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(4);
        hs1.add(2);
        hs1.add(3);
        hs1.add(1);
        hs1.add(7);
        System.out.println("HashSet = " + hs1);

        System.out.println("cevap: " + totalCount(hs1));
    }

    public static int totalCount(HashSet<Integer> hs1) {
        return +hs1.size();

        //Soru 2 - changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> meyveler=new HashSet<String>();
        meyveler.add("banana");
        meyveler.add("strawberry");
        meyveler.add("kiwi");
        meyveler.add("pineapple");
        changeSet(meyveler,"banana","peach");

        for (String meyve : meyveler) {
            System.out.println(meyve);
        }
    }

    public static HashSet<String> changeSet(HashSet<String>h1,String str1,String str2){

            if(h1.contains(str1)){
                h1.remove(str1);
                h1.add(str2);
            }



        return h1;

        //Soru 3- commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        //**ÖRNEĞİN:**
        //İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //Ortak değerleri ArrayListe ekleyiniz.
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //ArrayListi yazdırınız.

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Germany");
        hs1.add("England");
        hs1.add("South Africa");
        hs1.add("Brazil");
        hs1.add("USA");

        HashSet<String> hs2 = new HashSet<>();
        hs1.add("Germany");
        hs1.add("China");
        hs1.add("Brazil");
        hs1.add("France");
        hs1.add("USA");

        ArrayList<String> ortaklar = commonValues (hs1,hs2);
        System.out.println("Ortak Ulkeler = "+ortaklar);


    }
    public static ArrayList <String> commonValues (HashSet<String>hs1 , HashSet<String>hs2  ){
        ArrayList<String> ortaklar = new ArrayList<>();
        for (String eleman : hs1){
            if (hs2.contains(eleman)){
                ortaklar.add(eleman);
            }
        }
        return ortaklar;


        //Soru 4-removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //Return tipi linkedhashset
        //Örneğin,
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String 1= Germany
        //String 2 = USA
        //**Germany ve USA 'i sil.**
        //Set'i döndür.

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Germany");
        lhs.add("France");
        lhs.add("USA");
        lhs.add("Canada");
        lhs.add("Mexico");
        lhs.add("Brazil");
        String s1 = "Germany";
        String s2 = "USA";
        System.out.println("Orjinal Hali = "+lhs);

        LinkedHashSet<String> lhs1 = removing (lhs,s1,s2);
        System.out.println("Sonraki Hali = "+lhs1);


    }
    public static  LinkedHashSet<String> removing (LinkedHashSet<String> lhs ,String s1 , String s2){
        lhs.remove(s1);
        lhs.remove(s2);
        return lhs;

        //Soru 5- 2D ArrayList
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        //[ 1, 2, 3 ],
        //[ 4, 5, 6 ],
        //[ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] dizi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] eleman1 : dizi) {
            for (int eleman2 : eleman1) {
                System.out.print(eleman2 + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> dizi2 = new ArrayList<>();
        for (int[] eleman3 : dizi) {
            for (int eleman4 : eleman3) {
                dizi2.add(eleman4);
            }
        }
        System.out.println("Sonraki hali = "+dizi2);*/

    }
}





