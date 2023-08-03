package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        // esitleyebiliyorsak donen var esitleyemiyorsan donen yok
        //parantez ici dolu ise giden var bos ise giden yok

        merhabaYaz(); // giden yok donen yok
        toplamYaz(4,5);// giden var donen yok
        int enb = Math.max(4,5); // giden var donen var
        double rndSayi = Math.random(); //giden yok donen var

        /************************************/
        enbBulYaz(4,5);
        enb = enbBulGeriGonder(4,5);
        System.out.println("En buyuk = "+enb);

        // javaya ait herhangi bir metodun uzerine CTRL ile tikladiginizda
        //metodun icerigini ve kodlari gorebilirsiniz

    }
    public static int enbBulGeriGonder (int s1, int s2){
    // donderecegimiz metodun Void ini kaldirip yerine uygun degiskeni "int ,double veya string"yaziyoruz.
        int enb = 0;
        if (s1>s2)
            enb=s1;
        else enb=s2;

        return enb;
    }
    public static void enbBulYaz (int s1, int s2){
        if (s1>s2)
            System.out.println("En buyuk = "+s1);
        else
            System.out.println("En buyuk = "+s2);
    }
    public static void toplamYaz ( int s1, int s2){
        System.out.println("Toplam = "+s1+s2);
    }
    public static void merhabaYaz (){
        System.out.println("Merhaba dunya");
    }

}
