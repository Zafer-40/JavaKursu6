package Tekrar.Gun30._01_StaticVariables.Ornek2;

public class Student {

    int id=1;  // suan nesneye ait
    String fullName; // suan nesneye ait

    static int sayac = 1; // CLASS A AIT SAYAC OLUSTURDUK

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student " +
                "id=" + id +
                " FullName='" + fullName ;
    }
}
