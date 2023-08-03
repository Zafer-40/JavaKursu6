package Gun31._01_Enum;
enum Aylar{
    Tanimsiz , OCAK , SUBAT, MART , NISAN ,MAYIS ,HAZIRAN ,TEMMUZ ,AGUSTOS ,EYLUL ,EKIM ,KASIM ,ARALIK
}

public class Ornek1 {
    public static void main(String[] args) {

        //ENUMARATION : NUMARALANDIRILMIS SIMGELER
        // Yazılım dillerinde enum, enumaration ve enum sabitleri
        // olarak adladırılmaktadır. Tanımlanan değişkenlerin
        // sabit değer alması için kullanılır. Tanımlanan
        // bu sabit değerler bir grup oluşturur. Erişilmesi,
        // yönetilmesi ve anlaşılması kolay hale gelir.

        Aylar ay = Aylar.AGUSTOS;

        switch (ay){

            case OCAK :System.out.println(31);break;
            case SUBAT: System.out.println(28);break;
            case MART: System.out.println(31);break;
            case NISAN: System.out.println(30);break;
            case MAYIS: System.out.println(31);break;
            case HAZIRAN: System.out.println(30);break;
            case TEMMUZ: System.out.println(31);break;
            case AGUSTOS: System.out.println(31);break;
            case EYLUL: System.out.println(30);break;
            case EKIM: System.out.println(31);break;
            case KASIM: System.out.println(30);break;
            case ARALIK: System.out.println(31);break;

        }

        System.out.println("Aylar = "+ay);
        System.out.println("Ay name = "+ay.name());
        System.out.println("Ay Ordinal = "+ay.ordinal());

        for (Aylar a: Aylar.values())
            System.out.println(a.name()+"---"+a.ordinal());

    }
}
