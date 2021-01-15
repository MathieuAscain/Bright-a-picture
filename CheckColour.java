package COM;

public class CheckColour {
        public static int control() {
            int number;
            do {
                number = CheckInput.control();
            }while(number < 0 || number > 255);
            return number;
        }
    }
