package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo = {
                {2,3,44} , // 1. satir 3 elemanli
                {45,66,5}   // 2. satir 3 elemanli
        };

        System.out.println(Arrays.toString(tablo[0])); // 0. satirin tumu
        System.out.println(Arrays.toString(tablo[1])); // 1. satirin tumu
        System.out.println("0. satirin uzunlugu = "+tablo[0].length);//0. satirin uzunlugu
        System.out.println("1. satirin uzunlugu = "+tablo[1].length);//1. satirin uzunlugu

        System.out.println("Tablo = "+tablo.length); // kac satir var satir uzunlugu

        for (int satir = 0; satir < tablo.length; satir++) { // o,1
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) { // her bir satirin sutunlari yazdiran for
                System.out.print(tablo[satir][sutun]+" ");

            }
            System.out.println();
        }

    }
}
