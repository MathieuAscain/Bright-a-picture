package COM;

public class Picture {
    public static void main(String[] args) {

        System.out.println("Picture width selection");
        int pictureWidth = CheckInput.control();
        System.out.println("Picture height selection");
        int pictureHeight = CheckInput.control();
        int[][] myPicture = new int[pictureWidth][pictureHeight];

        for(int i = 0; i < pictureWidth; i++) {
            for(int j = 0; j < pictureHeight; j++) {
                System.out.println("Point at position (" + (i + 1) + "," + (j + 1) + ")");
                myPicture[i][j] = CheckColour.control();
            }
        }

        System.out.println();
        System.out.println("Matrix of the picture");
        Display.matrix(myPicture);

        System.out.println();
        int maximum = Calculation.countWhitePoints(myPicture);
        System.out.println("The maximum number of white points in the picture is " + maximum);

        int [][] myBrightPicture = Calculation.brightPicture(myPicture);
        System.out.println();
        System.out.println("Matrix of the bright picture");
        Display.matrix(myBrightPicture);
    }
}
