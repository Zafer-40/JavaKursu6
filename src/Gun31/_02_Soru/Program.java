package Gun31._02_Soru;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Ismet",Role.ADMIN,Statu.AKTIF);
        User user2 = new User("Mehmet",Role.SATIS,Statu.PASIF);
        User user3 = new User("Ayse",Role.MUDUR,Statu.AKTIF);

        User.userSil(user1); // Admin oldugu icin silinemez
        User.userSil(user2); // Admin olmadigi icin User silindi
        User.userSil(user3); // Admin olmadigi icin User silindi


    }
}
