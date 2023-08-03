package Gun30._03_Soru;

public class KimlerDinledi {

        int a;

        static int b = 0; // sen bitanesin 2 tane zaten olamaz

    void artir(){

        a++;
        b++;
    }

    public static void main(String[] args) {

        KimlerDinledi kd1 = new KimlerDinledi();
        kd1.a = 5;

        KimlerDinledi kd2 = new KimlerDinledi();
        kd2.a = 7;

        //Soru1 a nin degeri suanda kactir.
        // burada her nesnenin a si var ve kd1 in 5 kd2 nin ise 7 degeri var

        System.out.println("kd1a = "+kd1.a);
        System.out.println("kd2a = "+kd2.a);

        //soru2 b nin degeri kactir? tek bir degeri vardir o da sifirdir

        kd1.artir();
        kd2.artir();

        // soru 3 a ve b nin degeri kactir
        System.out.println("a nin degeri = "+kd1.a);
        System.out.println("a nin degeri = "+kd2.a);
        System.out.println("b nin degeri = "+b);

    }



}
