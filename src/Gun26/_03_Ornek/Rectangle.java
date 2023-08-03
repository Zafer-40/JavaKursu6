package Gun26._03_Ornek;

public class Rectangle {
    int width;
    int lenght;

    public int cevre(){
        int cevre = (this.lenght+this.width)*2;
        return cevre;
    }

    public void cevre2() {
        int cevre2 = (this.lenght + this.width) * 2;
        System.out.println("Cevre = " + cevre2);
    }
    public void alan(){

        int alan = (this.lenght)*(this.width);
        System.out.println("Alan = "+alan);

    }
}
