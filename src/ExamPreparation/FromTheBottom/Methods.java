package ExamPreparation.FromTheBottom;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    /*
        methods can be useful to make... yeah a method that's when
        you ask if this user is logged in it can give
        the answer "yes this user is logged in" or "no, there's no
        user logged in"

        2. example for a method is you can put a for example a
        facebook post, and you ask it "can you find the comments
        under the post for me"

        or you can make a new user like "hey method I wish to
        make a new user I have this name, age, where I live, my dead
        aunts name ect." and it will fill out the rest

        OR you can get some new structure in your code.


        public int max(int x, int y){
         if (x > y) {
             return x;
         } else {
            return y;
         }
        }

       public = modifier
       int = return-type
       max = method-name
       (int x, int y) = parameter-list or just parameter

       if (x > y) {
         return x;       = body of the method
        } else {
         return y;
        }

        sometimes a method returns something with int it returns a value
        String returns strings and so on so fourth

        if its not returning anything we have a void method like

        public void sayHi(){
        System.out.println("Hi!");
        }

        Calling a method

        if we made a method that shows that a number is doubled,
        and we want to "call it"

        int intThatIsDoubled = doubleNumber(4);
        System.out.println(intThatIsDoubled); //8

        doubleNumber(4); - Here we call the method by writing the name of the method
        followed by parenthesis. What is inside the parenthesis is called an argument
    */

    //Example
    public static String getFullName(String firstname, String lastname) {
        String fullname = firstname + " " + lastname;
        return fullname;
    }

    /*
    public static                                       = modifier
    String                                              = return-type
    getFullName                                         = method-name
    (String firstname, String lastname)                 = parameters
    {                                                   = scope start
    String fullname = firstname + " " + lastname;       = Function body
    return fullname;                                    = return statement
    }                                                   = scope end

    fullname1                                           = variable to capture return
    getFullName("Sharmila", "Jensen");                  = method call/run/invoke
    ("Sharmila", "Jensen")                              = arguments
     */

    //Exercises


    //Exercise 1.1
    public static int sumOfTwoInts(int a, int b, int c) {   //<-- this makes it look like a constructor

        int sum = a + b + c;

        return sum; // if it returns something we can input it like constructor and print it out
    }


    // Exercise 2
    public static void twoStrings(String string1) {
        System.out.println(string1);
        System.out.println(string1);
    }


    // Exercise 3
    public static double bmi(double height, double weight) {
        double result = (weight / (height * height)) * 1000 ;

        return result;
    }

    // Exercise 4
    public static String toUppercaseString(String string1) {
        String str = string1.toUpperCase(Locale.ROOT);

        return str;
    }

    // Exercise 5
    public static int charInString(String string1) {
        int str = string1.length()-2;

        return str;
    }

    //Exercise 6
    public static void throwDice() {
        int eyes = random.nextInt(7);

        if (eyes == 6) {
            System.out.println("6. lucky you!");
        } else {
            System.out.println(eyes);
        }
    }

    //Exercise 7
    public static String getFullname(String firstname, String surname) {
        String fullname = firstname + " " + surname;

        return fullname;
    }

    public static void main(String[] args) {


        String fullname1 = getFullName("Sharmila", "Jensen");
        System.out.println(fullname1); // Sharmila Jensen

        String fullname2 = getFullName("Mads", "Hansen");
        System.out.println(fullname2); // Mads Hansen



        System.out.println(sumOfTwoInts(5,8,6)); //19

        twoStrings("hello");

        double bmi1 = bmi(180, 87);
        System.out.println(String.format("%.2f", bmi1)); // this shows only 2 decimals after point


        System.out.println(toUppercaseString("full metal alchemist")); // FULL METAL ALCHEMIST


        System.out.println(charInString("im the boss")); // 9

        throwDice();

        String firstBooker = getFullname(scanner.nextLine(),scanner.nextLine());
        System.out.println(firstBooker); //works



        //Exercise 8
        int temp = scanner.nextInt();

        if (temp == 0) {
            System.out.println("jacket, maybe two pair of socks");

        } else if (temp < 0) {
            System.out.println("definitely a jacket, and some ski underwear");

        } else if (temp < 10) {
            System.out.println("jeans and long sleeve");

        } else if (temp > 20) {
            System.out.println("shorts and t-shirts hoooo!");
        }


    }
}