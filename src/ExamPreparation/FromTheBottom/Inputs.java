package ExamPreparation.FromTheBottom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inputs {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        /*
        there's different types of scanners that makes it possible to write
        in the system/prompt/terminal/console

        scanner.nextLine() = Strings
        scanner.nextInt() = Integers
        scanner.nextDouble() = Decimals


         */

        //Exercise 1.1
        System.out.println("please input a String of your Choosing ");
        String name = scanner.nextLine(); //inputs your name
        System.out.println(name); //prints out your name

        //Exercise 2
        System.out.println("Write a number that can be halved");
        int input = scanner.nextInt();
        System.out.println(input / 2);

        //Exercise 3
        System.out.println("choose a number between 0 - 100 and ill multiply it");
        int inputt = scanner.nextInt();
        System.out.println(inputt + inputt);

        //Exercise 4
        System.out.println("input 5 numbers of your choosing");
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        double input3 = scanner.nextDouble();
        double input4 = scanner.nextDouble();
        double input5 = scanner.nextDouble();

        double sum = input1 + input2 + input3 + input4 + input5;
        System.out.println("the sum of the 5 numbers are: " + sum);
        System.out.println("the average is: " + sum /5 );

        //Exercise 5
        System.out.println("input name, height, weight.");


        System.out.println("input height");
        double height = scanner.nextInt();
        System.out.println("input weight");
        double weight = scanner.nextDouble();
        System.out.println("input name");
        scanner.nextLine();
        String names = scanner.next();

        double bmi = (weight / (height * height)* 1000);

        System.out.println("Name " + names + "\nBMI is " + bmi );

        //Exercise 6.1
        //this Long keyword can be used
        System.out.println("please input minutes");

        int minutesInYear = 60 * 24 * 365;
        int minutes = scanner.nextInt();

        long years = (long) (minutes / minutesInYear); //this gives you the years

        int days = (int) (minutes / 60 / 24) % 365;


        System.out.println(minutes + " is approximately " + years + " years and " + days + "days");


        //Exercise 6.3
        System.out.println("please input 1st input");
        int userInput = scanner.nextInt();
        System.out.println("input 1 is: " + userInput);
        System.out.println("please input 2nd input");
        int userInput2 = scanner.nextInt();
        System.out.println("input 2 is " + userInput2);
        System.out.println("--------------------------");

        System.out.println("the sum of them both is: " + (userInput + userInput2)); // sum
        System.out.println("the difference of them both is: " + (userInput - userInput2)); //difference
        System.out.println("the product of them both is: " + userInput * userInput2); // addition
        System.out.println("the average of the them both is: " + (userInput + userInput2 / 2)); //Average
        System.out.println("the distance of them both is: " + (userInput - userInput2)); // distance
        System.out.println("the max: " + Math.max(userInput, userInput2)); // max
        System.out.println("the min: " + Math.min(userInput,userInput2)); //min



    }
}
