package Tekrar.Gun29._04_Soru;

public class Hesap {
    private int yatan = 0;
    private int cekilen = 0;
    private int bakiye = 0;

    public void paraYatir(int yatanPara){
        this.yatan += yatanPara;
        this.bakiye += yatanPara;
    }
    public void paraCek (int cekilenPara){
        this.cekilen += cekilenPara;
        this.bakiye -= cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap Ekstresi \n" +
                "\nYatan para = " + yatan +
                "\nCekilen para = " + cekilen +
                "\nBakiye = " + bakiye ;
    }
}
