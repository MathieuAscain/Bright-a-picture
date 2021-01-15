package COM;

import java.util.Scanner;

public class CheckInput {
    public static int control() {
        int number = 0;
        Scanner myObj = new Scanner(System.in);
        boolean correct = false;
        do {
            try {
                System.out.print("Enter a number ");
                String input = myObj.nextLine();
                number = Integer.parseInt(input);
                correct = true;
            } catch (NumberFormatException e){
                System.out.println("The input was not a number");
            }
        }while(!correct);
        System.out.println();
        return number;
    }
}
