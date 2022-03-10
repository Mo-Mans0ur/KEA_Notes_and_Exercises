package FirstSemester.Basics;

import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*


        System.out.println("please input your name ");

        String name = scanner.nextLine();
        System.out.println("welcome " + name + " lets see what your school grades are");
        System.out.println("your quiz score ");

        String quizScore = scanner.nextLine();

        System.out.println("hmmm alright what is your midterm score? ");
        String midtermScore = scanner.next();

        System.out.println("ah-ha, and what is your finals score? ");

        String finalsScore = scanner.nextLine();

        int average = scanner.nextInt();
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70 && average < 90) {
            grade = 'B';
        } else if (average >= 50 && average < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("your grade is " + grade);
        */

        System.out.println("please input your unit price ");
        double unitPrice = scanner.nextDouble();
        System.out.println("alright, please input your quantity ");
        int quantity = scanner.nextInt();

        System.out.println("the revenue from sale " + unitPrice * quantity + "$");

        double discountRateZeroPercent = unitPrice * 0;
        double discountRateTenPercent = unitPrice * 0.1;
        double discountRateFifteenPrecent = unitPrice * 0.15;

        if (discountRateTenPercent >= 100 && discountRateTenPercent <=120) {
            System.out.println("after discount " + discountRateTenPercent + " (10.0)%");
        } else if (discountRateFifteenPrecent >= 120 ) {
            System.out.println("after discount " + discountRateFifteenPrecent + " (15.0)%");
        } else if (discountRateZeroPercent >= 100 && discountRateZeroPercent <= 0){
            System.out.println();
        }


    }
}
