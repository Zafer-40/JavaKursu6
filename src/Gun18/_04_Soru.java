package Gun18;

public class _04_Soru {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo = new int[2][3]; // 2 ye 3 luk bir tablo

        //tabloyu random 100 e kadar sayılarla doldurunuz
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {

                tablo[satir][sutun] = (int) (Math.random() * 100);
            }
        }
        //tabloyu yazdırınız
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print(tablo[satir][sutun] + " ");
            }
            System.out.println();
        }
        int tekSayiMik=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
              if (tablo[satir][sutun]%2==1)
                  tekSayiMik++;
            }
        }
        System.out.println("Tek sayi miktari = "+tekSayiMik);
    }
}

