package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("Karabas");
        //kopek1.ses(); // HAVLADI
        //kopek1.kokladi(); //KOKLADI

        Kedi kedi1 = new Kedi("Cat");
        //kedi1.ses();    // MIYAVLADI
        //kedi1.tirmaladi(); // TIRMALADI

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        //HAYVANLARDAN KEDI
        //HAYVANLARDAN KOPEK
        //HAYVANLARDAN HAYVAN

        Hayvan hayvan1 = new Hayvan("Ordek");  //HAYVANLARDAN 1 HAYVAN
        Hayvan hayvan2 = new Kopek("Kangal"); //HAYVANLARDAN 1 KOPEK
        Hayvan hayvan3 = new Kedi("Boncuk"); //HAYVANLARDAN 1 KEDI

        System.out.println("----------------");
        hayvan1.ses(); // SES CIKARDI
        hayvan2.ses(); // HAVLADI
        hayvan3.ses();  // MIYAVLADI
        System.out.println("----------------");

        ((Kopek)hayvan2).kokladi();
        ((Kedi)hayvan3).tirmaladi();

        //Polymorphism -
        //çok formluluk  - Çok çeşitlilik
        //şizofren bir konu
        //:  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        //ve bu şekilde kullanılabilmesine Polymorphism denir.
         //öğretmenin okulda "fizik öğretmeniyim" demesi,
         //mahallede "öğretmenim" demesi gibi.



    }
    public static void hayvanSesi(Hayvan hayvan){
        hayvan.ses(); // SES CIKARDIMI HAVLADIMI
        if (hayvan instanceof Kopek)
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi)
            ((Kedi)hayvan).tirmaladi();


    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }

}
    //  Hayvan classından türettiğimiz-extend yaptığımız için
    //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
    //  köpek ve kedi için classlarında Override yaparak yazdığımız
    //  özellikleri alarak yazdı.
    //  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
    //  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
