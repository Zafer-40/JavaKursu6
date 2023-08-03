package Gun43;

public class _07_TryCatchFinaly {
    public static void main(String[] args) {
        String str = "";
        long startTime = 0;

        try {
            System.out.println("Hatadan onceki kisim");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kisim");
        }
        catch (Exception ex){
            System.out.println("Catch kismi calisti");
        }
        finally { //HATA OLSADA OLMASADA CALISIYOR
            System.out.println("Try-Catch bloguyla ilgili son yapilacaklar");
            System.out.println(System.currentTimeMillis()-startTime);
        }
        System.out.println("Diger calisacak kodlar");
        System.out.println("Program bitti");
    }
}
