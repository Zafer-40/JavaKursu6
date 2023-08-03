package Tekrar.Gun29._02_PrivateErisim;

public class Calisan {

    int id;  //DEFAULT
    String name;  //DEFAULT
    String surname;  //DEFAULT
    private String password; // PRIVATE

    public void sifreAta(String sifre){
        if (sifre.length() < 8)
            System.out.println("Zayif Sifre");
        else{
            this.password = sifre;
        System.out.println("Sifre Basariyla atandi");
    }
    }


    public void sifreGoster(){
        System.out.println("***"+this.password.substring(4));
    }

}
