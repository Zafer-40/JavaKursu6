package Gun07;

public class _05_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty: bir Stringin icinde birsey var mi yokmu boolean olarak yanit verir.

        String s1 = "Merhaba";
        String s2 = "";

        System.out.println("String 1 bos mu? = " +s1.isEmpty());
        System.out.println("String 2 bos mu? = " +s2.isEmpty());

        boolean bosMu = s2.isEmpty();
        System.out.println("Bosmu = "+ bosMu);

    }
}
