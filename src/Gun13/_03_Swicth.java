package Gun13;

import java.util.Scanner;

public class _03_Swicth {
    public static void main(String[] args) {
        //girilen bir ay numarasina gore ayin kac gun surdugunu yazdiriniz

        Scanner oku = new Scanner(System.in);

        System.out.print("Ayin numarasini giriniz = ");
        int ay = oku.nextInt();

        /*switch (ay){
            case 1 : System.out.println("31");break;
            case 2 : System.out.println("28");break;
            case 3 : System.out.println("31");break;
            case 4 : System.out.println("30");break;
            case 5 : System.out.println("31");break;
            case 6 : System.out.println("30");break;
            case 7 : System.out.println("31");break;
            case 8 : System.out.println("31");break;
            case 9 : System.out.println("30");break;
            case 10 : System.out.println("31");break;
            case 11 : System.out.println("30");break;
            case 12 : System.out.println("31");break;
            default: System.out.println("Hatali giris yaptiniz");*/

            //2.yol pratik
                switch (ay){
                    case 1 :
                    case 3 :
                    case 5 :
                    case 7 :
                    case 8 :
                    case 10 :
                    case 12 :System.out.println("31");break;

                    case 2 : System.out.println("28");break;

                    case 4 :
                    case 6 :
                    case 9 :
                    case 11 : System.out.println("30");break;

                    default: System.out.println("Hatali giris yaptiniz");



        }


    }
}
