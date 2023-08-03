package Gun15;

public class _07_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****

        for (int satir =1; satir<=5; satir++){ // 5 satir icin for olusturuldu

            for (int i =1; i<=5; i++) // her satirdaki 5 yildiz icin for olusturuldu

                System.out.print("*");

                System.out.println(); // satir basi yapmak icin konuldu


        }
    }
}
