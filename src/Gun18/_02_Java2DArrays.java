package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int [][] tablo = new int[2][3]; // 2 satir 3 sutun

        int [][] tablo2 = {
                {2,3,44} , // 1. satir 3 elemanli
                {45,66,5}   // 2. satir 3 elemanli
        };
        for (int satir = 0; satir < 2; satir++) { // o,1
            for (int sutun = 0; sutun < 3; sutun++) { // her bir satirin sutunlari yazdiran for
                System.out.print(tablo2[satir][sutun]+" ");

            }
            System.out.println();
        }







    }
}
