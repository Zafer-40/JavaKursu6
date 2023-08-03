package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        Utility.getString2(56);

        Utility ut = new Utility();

        ut.getString(56);

        //static metodlar: class a yani tipe ait
        //bu sebeple tipin adi ile cagirilirlar

        //static olmayanlar: nesneye ait
        // bu sebeple nesne adi ile cagirilirlar
    }
}
