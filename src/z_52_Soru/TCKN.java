package z_52_Soru;

import java.util.Random;

public class  TCKN {
    private long id;
    private String dogumYeri;
    private String tckn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getTckn() {
        return tckn;
    }
    boolean kontrol = true;
    public void setTckn(String tckn) {


        if (tckn.length()==6){
            for (int i = 0; i < tckn.length(); i++) {
                char karakter = tckn.charAt(i);
                if (Character.isDigit(karakter)){
                    kontrol = true;
                }else {
                    kontrol = false;
                    sonucuYazdir("Tum karakterler Rakam girilmelidir");
                    break;
                }
            }
            if (kontrol){
                Random random = new Random();
                int giseNo = random.nextInt(100);
                sonucuYazdir("GISE NO : "+giseNo);
            }
        }else {
        sonucuYazdir("TC kimlik numarasi 6 karakterli olmak zorundadir");
        }

    }
    public void sonucuYazdir(String sonuc){
        System.out.println(sonuc);
    }
}
