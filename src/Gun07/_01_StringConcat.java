package Gun07;

public class _01_StringConcat {
    public static void main(String[] args) {

        // concat : bir stringi digerine birlestirmeye yarar

        String s1 = "Merhaba";
        String s2 = "Dunya";

        System.out.println("Birlesik hali = " +s1+s2);
        System.out.println("Concat li birlestir = " +s1.concat(s2));
        System.out.println("Birkac Concatli birlestir = "+s1.concat(" ").concat(s2));
        System.out.println("Birkac concat degisik birlestir = "+s1.concat(" "+s2));

        System.out.println("S1 =" + s1); //s1 in degeri degismedi
        System.out.println("S2 =" + s2); //s2 nin degeri degismedi



    }
}

