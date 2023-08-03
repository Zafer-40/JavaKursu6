package JavaOdevler;

import java.util.Scanner;

public class JavaOdev9Proje {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean qecerliSiparis=false;
        while (!qecerliSiparis){
            System.out.println("Kahfe sifariw et:");
            String ks = sc.nextLine();
            if(ks.equals("Turk kafesi")){
                System.out.println("Turk kafesi hazirlaniyo");
                qecerliSiparis=true;
            } else if (ks.equals("Espreso")) {
                System.out.println("Espreso hazirlaniyo");
                qecerliSiparis=true;
            } else {
                System.out.println("Yeniden dene");
            }
        }

    }



}





