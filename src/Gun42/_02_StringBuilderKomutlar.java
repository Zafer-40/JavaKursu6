package Gun42;

public class _02_StringBuilderKomutlar {
    public static void main(String[] args) {
        System.out.println("*********** STRINBUILDER *****************\n\n");
        //STRINBUILDER I YAKINDAN TANIYALIM

        StringBuilder sb = new StringBuilder();
        sb.append("Bugun ");
        sb.append("Hava ");
        sb.append("Biraz Soguk");
        System.out.println("sb = " + sb);
        System.out.println("===============");

        System.out.println("sb.length() = " + sb.length());
        System.out.println("===============");

        sb.append(4);
        System.out.println("sb = " + sb);
        System.out.println("===============");

        sb.reverse();
        System.out.println("sb reverse ters cevirir = " + sb);
        System.out.println("===============");
        sb.reverse();
        System.out.println("Geri duzelttik cumleyi = " + sb);

        sb.delete(0,5); // O DAHIL 5 HARIC SILER
        System.out.println("0 4 araligi indexi sil = " + sb);
        System.out.println("===============");

        sb.deleteCharAt(3); // SADECE BELIRTILEN INDEX NUMARASINDAKI KARAKTERI SILER
        System.out.println("Index 3 u sil = " + sb);
        System.out.println("===============");

        sb.insert(5,"kelime "); // 5 NOLU INDEXE KELIMEYI EKLE ARAYA EKLEME
        System.out.println("5 nolu indexe kelime ekle = " + sb);
        System.out.println("===============");

        String parca = sb.substring(5,8);// 5 DAHIL 8 DEGIL
        System.out.println("parca = " + parca);
        System.out.println("===============");

        //STRING FONKSIYONLARINI KULLANMAK ICIN toString DEMEK YETERLI
        sb.toString().endsWith("de");

        sb.replace(5,8,"Sac");//VERILEN ARALIGA KELIME EKLER
        System.out.println("Sac sozu eklendi = " + sb);
        System.out.println("===============");

        sb=new StringBuilder(); // TAMAMEN SIFIRLAMAK YENILEMEK
        System.out.println("sildik bosalttik = " + sb);
        System.out.println("===============");
        sb=new StringBuilder("Merhaba Dunya");
        System.out.println("sb = " + sb);
        System.out.println("===============");

        StringBuffer sBuffer = new StringBuffer(); //STRINGBUILDERLE TAMAMEN AYNI
                                                // FARKI PARALEL CALISAN YAZILIMLARDA KULLANILIR



    }
}
