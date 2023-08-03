package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanicidan adini soyadini alarak ekrana yazdiriniz

        Scanner oku = new Scanner(System.in); // okuma islemini yapan degisken tanimlandi
        System.out.print("Adiniz ve Soyadiniz = ");
        String adSoyad = oku.nextLine(); //okuma islemi bu noktada yapiliyor

        System.out.println("adSoyad = " + adSoyad); //verinin gercekten okundugunu ekrana yazdirarak kont ettim.
    }
}
