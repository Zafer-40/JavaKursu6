package Gun31._03_Enum;

public enum Aylar {
    tanimsiz(0,0,"") ,
    OCAK (1,31,"Ocak"),
    SUBAT (2,28,"Subat"),
    MART (3,31,"Mart"),
    NISAN (4,30,"Nisan"),
    MAYIS (5,31,"Mayis"),
    HAZIRAN (6,30,"Haziran"),
    TEMMUZ (7,31,"Temmuz"),
    AGUSTOS (8,31,"Agustos"),
    EYLUL (9,30,"Eylul"),
    EKIM (10,31,"Ekim"),
    KASIM (11,30,"Kasim"),
    ARALIK(12,31,"Aralik");

    final int ayNo;
    final int gunSayisi;
    final String ayAdi;

    Aylar(int ayNo, int gunSayisi, String ayAdi) {
        this.ayNo=ayNo;
        this.gunSayisi = gunSayisi;
        this.ayAdi=ayAdi;
    }
}
