package Gun28._02_Ornek;

public class Kitapci {
    public static void main(String[] args) {

        Book kitap1 = new Book();

        kitap1.name = "Beyaz geceler";
        kitap1.yayinYili = 1980;
        kitap1.yazar = "Tolstoy";

        System.out.println("Kitap 1 ="+kitap1.toString());

        Book kitap2 = new Book("Yuzukler" , 1984 , "JR Alfo");
        Book kitap3 = new Book("uzum ve cay" , 2023);


        System.out.println("Kitap 1 = "+kitap1);
        System.out.println("Kitap 2 = "+kitap2);
        System.out.println("Kitap 3 = "+kitap3);


    }
}
