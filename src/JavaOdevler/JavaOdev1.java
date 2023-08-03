package JavaOdevler;

public class JavaOdev1 {
    public static void main(String[] args) {
        String s1 = "Soru 1 Cevaplari";
        System.out.println(s1);

        boolean dogrumu = true;
        System.out.println("dogrumu = " + dogrumu);

        double oran = 10.01;
        System.out.println("oran = " + oran);

        boolean esitmi = false;
        System.out.println("esitmi = " + esitmi);

        byte sayi = 5;
        System.out.println("sayi = " + sayi);

        byte sayi1 = -4;
        System.out.println("sayi = " + sayi1);

        char harf = 'a';
        System.out.println("harf = " + harf);

        char harf1 = 'z';
        System.out.println("harf = " + harf1);

        char sembol = '&';
        System.out.println("Sembol = " + sembol);

        double dSayi = 120;
        System.out.println("1.Double Sayi = " + dSayi);

        double dSayi1 = 120.005;
        System.out.println("2.Double Sayi = " + dSayi1);

        double dSayi2 = 550.24;
        System.out.println("3.Double Sayi = " + dSayi2);

        float fSayi = 121.005f;
        System.out.println("1.Float Sayi = " + fSayi);

        float fSayi1 = 123.3365f;
        System.out.println("2.Float Sayi = " + fSayi1);

        float fSayi2 = 3.55f;
        System.out.println("3.Float Sayi = " + fSayi2);

        int iSayi = 5;
        System.out.println("1.Integer Sayi = " + iSayi);

        int iSayi1 = 100;
        System.out.println("2.Integer Sayi = " + iSayi1);

        int iSayi2 = 120;
        System.out.println("3.Integer Sayi = " + iSayi2);

        int iSayi3 = -6500;
        System.out.println("4.Integer Sayi = " + iSayi3);

        short sSayi = 12;
        System.out.println("1. Short Sayi = " + sSayi);

        short sSayi1 = 23;
        System.out.println("2. Short Sayi = " + sSayi1);

        short sSayi2 = -100;
        System.out.println("3. Short Sayi = " + sSayi2);

        System.out.println("----------------------------");

        String s2 = "Soru 2 nin Cevabi";
        System.out.println(s2);

        String para1 = "100";
        String para2 = "200";
        String para3 = "300";

        int tPara1 = Integer.parseInt(para1);
        int tPara2 = Integer.parseInt(para2);
        int tPara3 = Integer.parseInt(para3);
        int toplam = tPara1+tPara2+tPara3;
        System.out.println("Toplam Para= " + toplam);

        System.out.println("----------------------------");

        String s3 = "Soru 3 un Cevabi";
        System.out.println(s3);

        String taksit1 = "150";
        String taksit2 = "185";
        String taksit3 = "95";

        double oTaksit1 = Double.parseDouble(taksit1);
        double oTaksit2 = Double.parseDouble(taksit2);
        double oTaksit3 = Double.parseDouble(taksit3);
        double ort = (oTaksit1+oTaksit2+oTaksit3)/3;
        System.out.println("Taksit Ortalamasi = " + ort);
        
        





        
    }
}
