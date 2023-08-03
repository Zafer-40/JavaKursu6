package Gun35._02_Polymorphism;

public class Hayvan {
    private String name;

    public void ses(){
        System.out.println("Ses cikardi");
    }

    public Hayvan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
