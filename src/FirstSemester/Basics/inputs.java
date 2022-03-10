package FirstSemester.Basics;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //create a scanner object
        String name = scanner.nextLine();
        System.out.println("string from input " + name);
        //input name


        //programmet kører
        //vi skal give det et INPUT.
        //når man skriver noget så skrives det tilbage (i know kinda creepy like an echo in your head)


        String productName = scanner.nextLine();
        System.out.println("product name " + productName);
        //input product name

        double productPrice = scanner.nextDouble();
        System.out.println("Product price " + productPrice);
        //input price of product

        //how many years are you in 100 years?
        // let's find out below

        int ageFromInput = scanner.nextInt(); //fordi vi bruger en int så skal vi bruge en nextInt();
        int ageIn100Years = ageFromInput + 100;
        System.out.println("in 100 years you would be " + ageIn100Years + " years old");

        String stringFromUser = scanner.nextLine();
        System.out.println(stringFromUser + " party emoji");

        //thats all folks
    }

}
