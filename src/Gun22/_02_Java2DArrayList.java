package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> liste=new ArrayList<>();// her bir satır(hücresi)
                                                    // Integer bir sayı saklayabilecek, atıldıkça
                                                    // Integer ın listi, uzunluk değişken

        ArrayList<Integer> matNotlari=new ArrayList<>(); //tek boyut
        ArrayList<Integer> fizNotlari=new ArrayList<>(); //tek boyut
        ArrayList<Integer> kimNotlari=new ArrayList<>(); //tek boyut

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        //ArrayListlerin ArrayListi
        ArrayList< ArrayList<Integer> > tumNotlar=new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizNotlari);
        tumNotlar.add(kimNotlari);

        tumNotlar.get(0); // matNotlarimiz
        tumNotlar.get(0).get(0); // ilk matematik notu

        System.out.println("Matematik notlari = "+tumNotlar.get(0));
        System.out.println("Fizik notlari = "+tumNotlar.get(1));
        System.out.println("Kimya notlari = "+tumNotlar.get(2));
        System.out.println();

        //ilk matematik notu
        System.out.println("ilk matematik notu = "+tumNotlar.get(0).get(0));

        System.out.println();

        //Satir yazdirma

        for (int i = 0; i < tumNotlar.size(); i++) {
            System.out.println("Tum Notlar = "+tumNotlar.get(i));
        }

        System.out.println();

        //satir sutun yazdirma

        for (int i = 0; i < tumNotlar.size(); i++) {
            for (int j = 0; j < tumNotlar.get(i).size(); j++) {
                System.out.println("Tek Tek Notlar = "+tumNotlar.get(i).get(j));
            }
            System.out.println();
        }






















    }
}
