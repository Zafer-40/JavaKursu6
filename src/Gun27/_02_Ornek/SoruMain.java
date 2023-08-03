package Gun27._02_Ornek;

public class SoruMain {
    public static void main(String[] args) {

      int max = myMath.getMax(5,6);

      int min = myMath.getMin(5,6);

      double us = myMath.getPow(2,3);

      double kareKok = myMath.getSqrt(4);

      int rndmSayi = myMath.getRandom(10);

        System.out.println("getMax="+max);
        System.out.println("getMin="+min);
        System.out.println("getPow="+us);
        System.out.println("getSqrt="+kareKok);
        System.out.println("getRandom="+rndmSayi);


    }
}
