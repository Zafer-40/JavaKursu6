package Tools;

public class MyFunc {
    public static void main(String[] args) {

    }
    public static int enbBul(int s1, int s2){
        int enb=0;
        return (s1>s2 ? s1 : s2);
    }

    public static void bekle (int sn){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
