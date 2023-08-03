package Gun28._02_Ornek;

public class Book {
    String name;
    int yayinYili;
    String yazar;

    public Book(){

    }


    public Book(String name , int yayinYili , String yazar){

        this.name = name;
        this.yayinYili = yayinYili;
        this.yazar = yazar;

    }
    public Book(String name , int yayinYili ){

        this(name,yayinYili," ");

    }
    public String toString(){
        return this.name+" "+this.yazar+" "+this.yayinYili;
    }

}
