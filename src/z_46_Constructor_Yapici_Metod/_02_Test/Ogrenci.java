package z_46_Constructor_Yapici_Metod._02_Test;

public class Ogrenci {
    public int id; // DEGISKEN FIELD PROPERTY
    public String isim; // DEGISKEN FIELD PROPERTY
    public String soyisim; // DEGISKEN FIELD PROPERTY

    //CONSTRUCTOR : YAPICI METOD DEMEK
    public Ogrenci(int id , String isim , String soyisim) //PARANTEZ ICINE PARAMETRE YERLESTIRIYORUM
    {
        //this SUAN UZERINDE CALISTIGIM KLAS DEMEK
        this.id = id;  // BU KLASTAKI ID YE PARAMETRE ICINDEKI ID YI ATA
        this.isim = isim; // BU KLASTAKI ISIM E PARAMETRE ICINDEKI ISIM I ATA
        this.soyisim = soyisim; // BU KLASTAKI SOYISIME PARAMETRE ICINDEKI SOYISIMI ATA
    }
}
