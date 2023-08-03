package Gun26._02_Ornek;

public class Person {

    String name ;
    String surName ;
    int age ;
// 1. yazdirma yontemi
    public void bilgiYazdir(){
        System.out.println("Adi = "+this.name);
        System.out.println("Soyadi = "+this.surName);
        System.out.println("Yasi = "+this.age);
    }

    //2.yazdirma yontemi
    public String toString(){
        String yazilacakYazi = this.name+"\t"+
                            this.surName+"\t"+
                            this.age;
        return yazilacakYazi;
    }
    public void getBirthYear(){
        int dogumGunu = 2023-(this.age);
        System.out.println("Dogum yili = "+dogumGunu);
    }
    public int getBirthYear2(){
        int dogumGunu2 = 2023-(this.age);
        return dogumGunu2;
    }

}
