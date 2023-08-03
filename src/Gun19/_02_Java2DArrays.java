package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = new int[2][3];

        int[][] tablo2 = {
                {4,5},
                {12,45,77},
                {4,5,8,5,87,65,43},
                {4,5,12},
                {14}
        };

        for (int i = 0; i < tablo2.length; i++) {
            for (int j = 0; j < tablo2[i].length; j++)
                System.out.print(tablo2[i][j]+" ");
            System.out.println();
        }


    }
}
