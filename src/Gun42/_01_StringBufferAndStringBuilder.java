package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        cumle = cumle + "Bugun";
        cumle = cumle + " Hava";
        cumle += " Cok Soguk";
        System.out.println("cumle = " + cumle);
        System.out.println("------------");

        System.out.println(cumle+ " degilmi");
        System.out.println("cumle.concat(\" dun degildi\") = " + cumle.concat(" dun degildi"));
        System.out.println("cumle = " + cumle);
        cumle.concat("merhaba");
        cumle=cumle.concat(" merhaba");
        System.out.println("-----------------");

        /*******StringBuilder******/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun");
        cumle2.append(" Hava");
        cumle2.append(" Soguk");
        System.out.println("Stringbuilder cumle2 = " + cumle2);
        System.out.println("*********************");

        // + Concat ve StringBuilder 3 modelin hiz testi asagidadir

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 30000; i++) {
            test1=test1+ " Merhaba";
        }
        System.out.println("+ icin gecen sure :"+(System.currentTimeMillis()-startTime));
        System.out.println("================");

        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 30000; i++) {
            test2=test2.concat(" Merhaba");
        }
        System.out.println("Concat icin gecen sure :"+(System.currentTimeMillis()-startTime));
        System.out.println("================");

        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 30000; i++) {
            test3.append(" Merhaba");
        }
        System.out.println("StringBuilder icin gecen sure :"+(System.currentTimeMillis()-startTime));

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.




    }
}
