package COM;

public class Calculation {
    public static int countWhitePoints(int[][] my2DArray) {
        int theMax = 0;
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                if (my2DArray[i][j] == 255) {
                    theMax++;
                }
            }
        }
        return theMax;
    }

    public static int[][] brightPicture(int[][] my2DArray) {
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                if (my2DArray[i][j] + 30 > 255) {
                    my2DArray[i][j] = 255;
                } else {
                    my2DArray[i][j] += 30;
                }
            }
        }
        return my2DArray;
    }
}

