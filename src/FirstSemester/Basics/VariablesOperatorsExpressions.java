package FirstSemester.Basics;

public class VariablesOperatorsExpressions {
    public static void main(String[] args) {
        //integer means you are storing stuff for later!
        //Variable Declaration
        int age;
        //Variable Declaration
        int height;
        //Variable assignment
        age = 23;
        //variable assignment
        height = 2;

        //when using double its only decimal numbers
        double heightBetter = 1.78;

        //character
        char firstLetterOfName = 'M';
        //string means it stores your input for later!
        String name = "Mohammad";


        //if you want to print out your name or stuff use SOUT, and it will become like the one in segment 25!

        //prints out the text in the parantes
        System.out.println(name);

        // the numbers are an EXPRESSION and the + is an arithmetic OPERATOR
        int sum = 3678 + 8565 ;
        System.out.println(sum);

        int product = 3 * 5;

        // 23.5 / 56.9

        double product2 = 23.5 / 56.9;
        System.out.println(product2);

        // a foot to meter generator

        //number of foot per meter 0.3138535 used Google
        double feetPerMeter = 0.3138535;

        //put in your boat size in feet
        double boatSizeInFeet = 23;
        double boatSizeInMeters = boatSizeInFeet * feetPerMeter;
        System.out.println("your boat is " + boatSizeInMeters + " meters");

        //so our boat is 7.2186305 meters

        //that's all folks
    }
}
