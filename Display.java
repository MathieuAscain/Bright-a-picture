package COM;

public class Display {
    public static void matrix(int[][] my2DArray) {
        for(int i = 0; i < my2DArray.length; i++) {
            for(int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
