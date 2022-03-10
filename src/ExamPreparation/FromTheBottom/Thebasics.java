package ExamPreparation.FromTheBottom;

public class Thebasics {
    public static void main(String[] args) {
        //Variables
         /*
        int = Numbers
        String = Words
        double = decimals
        char = Characters
       ------------------------------------------------------------

        if we made an example then it will look like this:

        int x = 22

        so int = variable
        the x = the name of the variable
        the number 22 = the value we assign to the variable x
       ------------------------------------------------------------

        its the same with the variables String, double and char

        String:

        String x = word

        String = variable
        the x = the name of the Variable
        word = the value we assign the variable x

        double:

        double x = 2.5

        double = variable
        the x = the name of the Variable
        word = the value we assign the variable x

        char:

        char x = H

        char = variable
        the x = the name of the Variable
        H = the value we assign the variable x

       ------------------------------------------------------------

       to let the system print out the variable we use the keyword sout or System.out.println

       if we take a real world scenario:

       int salary = 4000

       or

       String country = Hungary

       or

       char character = D

       and if we want to print it out we put it int the "printer"

       System.out.println(salary);
       System.out.println(country);
       System.out.println(character);

       and the system will print out

       4000
       Hungary
       D

      ------------------------------------------------------------

       we have a keyword which is Final that means that which ever variables is named IT CANT BE CHANGED!!
       like CPR-number

       example:

       final Int = 2106738593

      ------------------------------------------------------------
      */
       //Expressions and Operators.
         /*
       + = addition
       - = subtraction
       * = multiplication
       / = division
       % = modulus

       its like math so to say

       if we have an expression that goes like

       int result = 3 * 5 / 5 + 1 ;

       it will take the addition first, multiplication second and the division last

       so 3 * 5 / 6 <--     first
       15 <-- / 6           second
       2.5                  last
      ------------------------------------------------------------
      */
        //Exercises

        //1.2 write a sum of 2 numbers

        int sumOfTwoNumbers = 4 + 8;
        System.out.println(sumOfTwoNumbers); //sum = 12

       //-------------------------------------------------------------

        //1.3 write a program that prints out the result of following operators
        /*
          1.  -5 + 8 * 6
          2.  (55 + 9) % 9
          3.  20 + -3 * 5 / 8
          4.  5 + 15 / 3 * 2 - 8 % 3
         */

        int sum1 = -5 + 8 * 6;
        int sum2 = (55 + 9) % 9;
        int sum3 = 20 + -3 * 5 / 8;
        int sum4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(sum1);   // sum = 43
        System.out.println(sum2);   // sum = 1
        System.out.println(sum3);   // sum = 19
        System.out.println(sum4);   // sum = 13



        //Exercise 2 convert 100 Fahrenheit to Celsius

        double fahrenheit = 100;

        double celsius = ((5 * (fahrenheit - 32.0))/9);

        System.out.println("100 fahrenheit is " + celsius + " in Celsius");

        //Exercise 3 print out all that in one println
        System.out.println("\nSoftware development\nThe best subject ev-er\n" +
                "Learning \"Java\" is the most fun you can have\n" + "2 + 2 = 5;" );

        System.out.println();


        //Exercise 4 Compute the following and print the result of (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)

        double result = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println(result); // sum = 0.8392857142857143



        //Exercise 5 compute 19 kilometers to miles

        double kilometers = 19;

        double miles = kilometers / 0.621371192;

        System.out.println("19 kilometers is " + miles + " in miles");



        //Exercise 6 find area of the rectangle

        double width = 5.5;
        double height = 8.5;

        double areaOfRectangle = width * height;

        System.out.println("Area of the rectangle is " + areaOfRectangle);

    }
}
