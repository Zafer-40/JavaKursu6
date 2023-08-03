package Gun14;

public class _04_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayilari ekrana yazdirin

        int sayac = 1;
        while (sayac<=5){
            System.out.println("While ile sayac = "+sayac);
            sayac++;
        }
        // dögünün kaç kere döneceği belli ise
        // sayacın başlangıç değeri belli, artış değeri belli, şartı belli
        // ise bi güzellik yapalım döngüyü basitleştirelim.

        //başı belli,sonu belli, artışı belli : FOR DÖNGÜSÜ

        for (sayac=1; sayac<=5; sayac++){
            System.out.println("For lu sayac = "+sayac);
        }
//          Döngülerle ilgili sonuç özeti
//        1- Kaç kere döneceği belli ise : FOR düngüsü
//        2- Kaç kere döneceği belli değilse While veya doWhile
//           kontrol başta ise While,  sonda doWhile kullanacağız.
    }
}
