package ExamPreparation.FromTheBottom;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // REALLY IMPORTANT
        //  >   <-- bigger than
        //  <   <-- smaller than
        //  >=  <-- bigger or like
        //  <=  <-- lower or like

        /*
        Loops is to use again and again instead of using the same code multiple times.
        theres different kinds of loops the one in focus is the "for" loop

        examples on loops:
        while loops
        do while loops
        ect.
         */
        //example on video

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        /*
        the first part chooses where the loop starts it separates
        where the semicolon is

        the second segment says how many times the loop will go in
        this case it loops 3 times or when (I) is lower than 3

        in the third segment it tells us that every loop adds 1 to
        the loop or puts 1 to (I)


        is 0 lower than 3?
        yes = it gets printed out
        is 1 lower than 3?
        yes = it gets printed out
        is 2 lower than 3?
        yes = it gets printed out
        is 3 lower than 3?
        no = the loop ends

        it doesn't just loop with multiplication we can do it
        with minus or addition
         */
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        //Example
        // print all characters in a String

        String flower = "Rose";
        System.out.println(flower.length());
        for (int i = 0; i < flower.length(); i++) {
            System.out.println(i + 1 + " = " + flower.charAt(i));
        }
        System.out.println("done with loop");

        //Exercise
        int k = 0;
        while (k < 5) {
            System.out.println(k);
            k++;
        }
        /*
        the while loop runs until the statement isn't true

        1. Control falls into the while loop.
        2. The flow jumps to Condition
        3. Condition is tested.
        4. If Condition is true, the flow goes into the Body.
        5. If Condition is false, the flow goes outside the loop

         or in dry-splaining

        1. Program starts.
        2. i is initialized with value 1.
        3. Condition is checked. 1 < 6 yields true.
             3.a) "Hello World" gets printed 1st time.
             3.b) Updation is done. Now i = 2.
        4. Condition is checked. 2 < 6 yields true.
             4.a) "Hello World" gets printed 2nd time.
             4.b) Updation is done. Now i = 3.
        5. Condition is checked. 3 < 6 yields true.
             5.a) "Hello World" gets printed 3rd time


        in a do while loop the loop runs the code "once" to check if the
        statement is true

        if its true it will run again
        if not, the loop ends

        1. Control falls into the do-while loop.
        2. The statements inside the body of the loop get executed.
        3. The flow jumps to Condition
        4. Condition is tested.
        5. If Condition yields true, goto Step 6.
        6. If Condition yields false, the flow goes outside the loop

        7. Flow goes back to Step 2.

        or in dry-splaining

        1. Program starts.
        2. i is initialized with value 1.
        3. Execution enters the loop
            3.a) "Hello World" gets printed 1st time.
            3.b) Updation is done. Now i = 2.
        4. Condition is checked. 2 < 6 yields true.
        5. Execution enters the loop
             5.a) "Hello World" gets printed 2nd time.
             5.b) Updation is done. Now i = 3.
        6. Condition is checked. 3 < 6 yields true.
        7. Execution enters the loop
             7.a) "Hello World" gets printed 3rd time
        ect.

         */

        //exercise
        /*
         the "false" changes to "true" WHEN the program finds the
         character "e" in Umbrella and then jumps out of the loop
         */

        //Exercise 1.1

        for (int l = 0; l < 3; l++) {
            System.out.println("hello world");
        }

        for (int m = 0; m < 11; m++) {
            System.out.println(m);
        }

        char star = '*';
        for (int n = 0; n < 10; n++) {
            System.out.println(star);
        }

        for (int b = -5; b < 5; b++) {
            System.out.println(b);
        }

        for (int v = 5; v < 31; v++) {
            System.out.println(v);
        }

        int b = -5;
        while (b < 5) {
            System.out.println(b);
            b++;
        }
        System.out.println("end of loop");

        //Exercise 2 Example on While loop                                              <---------- while loop
        int iterations = 1;

        while (iterations < 11) {
            System.out.println("i am now printing for the " + iterations + " th time");
            iterations++;
        }
        System.out.println("end of loop");


        //Not Exercise                                                                 <----------- Do while loop
        int does = 0;
        do {
            System.out.println("Hello world");
        } while (does < 6);
        System.out.println("end of loop");

        //Exercise 2.1
        Random random = new Random();
        int hashtag = random.nextInt(10);

        for (int u = 0; u < hashtag; u++) {

            System.out.print("#");
            u++; // adds a hashtag every line
        }
        System.out.println();
        //Exercise Star

        // (a)
        String hashtags = "";
        for (int g = 0; g < 8; g++) {
            System.out.println(hashtags);
            hashtags = "#" + hashtags;
        }
        System.out.println();

        //(b)
        String hashtag2 = "#";
        int num = 8;
        while (num > 0) {
            for (int f = 1; f <= num; f++) {
                System.out.print(hashtag2);
            }
            System.out.print("\n");
            num--;
        }

        //Exercise Star *2
        // (a)
        System.out.println("how many rows do want?");
        int userChoice = scanner.nextInt() -1;
        for (int a = 0; a <= userChoice; a++) {
            System.out.println(hashtags );
            hashtags = "#" + hashtags;

        }
        System.out.println();

        //(b)
        System.out.println("now downwards how many rows?");
        int num2 = scanner.nextInt();
        while (num2 > 0) {
            for (int s = 1; s <= num2; s++) {
                System.out.print(hashtag2);
            }
            System.out.print("\n");
            num2--;
        }
        System.out.println();

        //Exercise 5   Make your name to initials but not the last name
        System.out.println("write your name");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("your full name is: " + name);
        System.out.println("initials with surname is: ");

        int length = name.length() ;
        name = name.trim();
        String spaces = " ";

        for (int i = 0; i < length; i++) {
            char character = name.charAt(i);
            if (character != ' ') {
                spaces = spaces + character;
            } else {
                System.out.println(Character.toUpperCase(spaces.charAt(0))+ ". ");
                spaces = "";
            }

        }
        String space2 = "";
        for (int j = 0; j < spaces.length(); j++) {
            if (j == 0) {
                space2 = space2 + Character.toUpperCase(spaces.charAt(0));
            } else {
                space2 = space2 + Character.toLowerCase(spaces.charAt(j));
            }
        }
        System.out.print(space2);
        // M. A. Mansour

    }

}
