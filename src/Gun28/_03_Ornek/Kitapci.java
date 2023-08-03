package Gun28._03_Ornek;

import Gun28._02_Ornek.Book;

public class Kitapci {
    public static void main(String[] args) {

        Gun28._02_Ornek.Book kitap1 = new Book();

        Book kitap2 = new Book("Yuzukler" , 1984 , "JR Alfo");
        Book kitap3 = new Book("uzum ve cay" , 2023);

        System.out.println("Kitap1 = "+kitap2);
    }
}
