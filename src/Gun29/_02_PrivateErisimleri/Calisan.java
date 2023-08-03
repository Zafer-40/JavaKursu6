package Gun29._02_PrivateErisimleri;

public class Calisan {
    int id;   // default
    String name; // default
    String surName; // default
    private String password;

    public void sifreAta(String sifre){
        if (sifre.length() < 8)
            System.out.println("Sifreniz zayif");
        else{
            this.password = sifre;
            System.out.println("Sifre Basariyla Atandi");
        }
    }
    public void sifreGoster(){
        System.out.println("****"+this.password.substring(4));
    }


}
