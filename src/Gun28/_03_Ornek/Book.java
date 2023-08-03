package Gun28._03_Ornek;

public class Book {
    String name;
    int yayinYili;
    String yazar;

    public Book() {
    }

    public Book(String name, int yayinYili, String yazar) {
        this.name = name;
        this.yayinYili = yayinYili;
        this.yazar = yazar;
    }

    public Book(String name, int yayinYili) {
        this.name = name;
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yayinYili=" + yayinYili +
                ", yazar='" + yazar + '\'' +
                '}';
    }
}

