package FirstSemester.ProgramFlow;

import java.util.Scanner;

public class Methodstwo {
    //write a method to see if the input is larger than 100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number");


        boolean isTheNumbLargerThan100 = largerOrSmallerThan(scanner.nextInt());
        System.out.println(isTheNumbLargerThan100);

        //write a method is a string and the first  character is a "y"

        String name = "yasmin";

    }
        /*
    public static String isTheFirstLetterY(String letter) {
        if (letter.charAt() == "y") {

        }

    }

         */
    public static boolean largerOrSmallerThan(int number) {

        if (number > 100) {
            return true;
        } else {
            return false;
        }
    }
}
