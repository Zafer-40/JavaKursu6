package JavaOdevler;

import java.lang.reflect.Array;

public class JavaOdev8 {
    public static void main(String[] args) {

        //Soru 1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin.
        //Array'i yazdırınız.

       /*int [][] tablo = {{2,3,2} , {4,1,5} , {7,2,5}};


        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
            if (tablo[i][j]==2)
                tablo[i][j]=6;
            }
        }
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {


                System.out.print(tablo[i][j] + " ");
            }
            System.out.println();
        }
        //Soru 2-Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız.
        //toplamı yazdırınız.
        //Sonuç 32 olmalıdır.

       int[][] tablo = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int toplam = 0;


        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                toplam+=tablo[i][j];
            }
        }
        System.out.println("Sonuc = "+toplam);

        // Soru 3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","ohio"} ,
        //{"ohio","new york", "new jersey"}]
        //Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.

        String[][] sehirler = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "ohio"},
                {"ohio", "new york", "new jersey"}
        };

        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++) {

                if (sehirler[i][j].equals("ohio")) {
                    sehirler[i][j] = "florida";
                }
            }
        }
        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++){
                System.out.print(sehirler[i][j]+" ");
            }
            System.out.println();
        }*/


    }
}


