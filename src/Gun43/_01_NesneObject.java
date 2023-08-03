package Gun43;

import java.util.ArrayList;

public class _01_NesneObject {
    public static void main(String[] args) {
        ArrayList<Object> genelList = new ArrayList<>();
        genelList.add(1);
        genelList.add("Zafer");
        genelList.add(true);
        genelList.add(3.5);

        System.out.println("Genel List = " +genelList);
    }
}
