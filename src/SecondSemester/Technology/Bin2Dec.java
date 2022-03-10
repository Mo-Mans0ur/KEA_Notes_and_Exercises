package SecondSemester.Technology;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        //print out program from function to screen
        System.out.println("convert binary to decimals");

        //create an object of a scanner
        Scanner sc = new Scanner(System.in);

        //write to the screen that you want to convert
        System.out.print("write your binary number: ");

        String binaryStr = sc.next();

        System.out.println("Your input in Decimals is: " + Integer.parseInt(binaryStr,2));


       //conversion
        /*
        for (int i = 0; i < num.length; i++) {

            //convert from binary to decimals
            result = result + Math.pow(2,i)* num[i];
        }
         */



    }
}
