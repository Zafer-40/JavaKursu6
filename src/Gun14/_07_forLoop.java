package Gun14;

public class _07_forLoop {
    public static void main(String[] args) {
        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        //toplam 50 yi gectiginde 50 gecildi diye mesaj yazsin

        int toplam=0;
        boolean sinirAsildi = false;

        for (int i=0; i<=100; i++){
            if (i%2==0){
                toplam = toplam+i;
            }if (toplam>=50 && sinirAsildi==false){
                System.out.println("50 gecildi");
                sinirAsildi=true;
            }
        }
        System.out.println("Toplam = "+toplam);
    }
}
