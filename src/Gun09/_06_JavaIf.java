package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku = new Scanner(System.in);

        System.out.print("Cumle giriniz = ");
        String cumle = oku.nextLine();

        boolean varMi = cumle.contains("a");
        if (varMi==true)
            System.out.println("EVET");
        if (varMi==false)
            System.out.println("HAYIR");

        if (cumle.contains("a")==true)
            System.out.println("evet");
        if (cumle.contains("a")==false)
            System.out.println("hayir");

        if (cumle.contains("a"))
            System.out.println("Evet");
        if (!cumle.contains("a"))
            System.out.println("Hayir");
    }
}
