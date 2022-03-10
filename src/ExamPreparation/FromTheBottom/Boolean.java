package ExamPreparation.FromTheBottom;

import java.util.Scanner;

public class Boolean {
    static Scanner sc = new Scanner(System.in);

    /*
    A boolean is java type that says either true or false
    on or off ect.

    an example can be a checkbox which says "remember me"

    if its checked (true) if not (false)

    let's try an example

    in boolean there's some operators. we have talked
    about one operator, the math operator with: multiplication
    modulus ect.

    now we have 2 more

    - relational operators
    - logical operators


    the relational operator

    how does one value relate to the other is it equal to
        each other, is it bigger or smaller than the other, is
        it NOT equal to a thing.

        there is 6 different relational operators

        *    x == y  <-- x is equal to y
        *    x != y <-- x is NOT equal to y
        *    x > y <-- x is greater than y
        *    x < y <-- x is less than y
        *    x >= y <-- x is greater or equal to y
        *    x <= y <-- x is less or equal to y

        let's take an example on relational

        logical operator

        there is 2 types of logical operators

        * && <--- AND operator
        * || <--- OR operator


        //the AND operator//

        System.out.println(true && true);

        if the one on the left AND on the right is true
        THEN the whole segment is TRUE

        if the one on the left is false AND the one on right
        is true THEN the whole segment is FALSE

        let's take and example
       ----------------------------------------------------
        //the OR operator//

        if JUST ONE of them is true THEN the whole
        segment is true

        in the AND operator if one of them is true and the
        other one is false the whole thing is false

        in the OR operator there just have to be one that is
        true then the whole thing is true

        (I know... hard to take in)

        let's take an example
       --------------------------------------------------
       if a user has logged in on Facebook and wants to comment
       on a post, as a developer I have to find out does this
       user have permission to comment?

       we can say "you can comment If the post is public"

       OR

       "IF he's a friend with the person that posted"

       Let's try it out

       ------------------------------------------------------
       //Conditional Statements//

       conditional statements is a mechanism which a computer
       makes decisions the typical conditional statement is an
       if sentence

       Example time!!

       ------------------------------------------------------

        the Switch statement
        the firs one "break" will break out from the switch block
        ones a condition is checked.

        the "Default" will be executed in case none of the conditions
        is what we are looking for.

        if you don't put "break" it will run but take the result and
        the "default" with it will make a disaster.

        in a standard programming logic, it can be made by using
        an if...else condition but won't look good or readable. in
        programs involving more difficult task/cases, and maybe we have
        to call multiple methods so instead of having to many if...else
        statements

        also... the switch is faster...

        there's no limit on how many cases you want.

     */
    //Exercise 2
    public static boolean isItMoreThan4(String[] names) {
        if (names.length > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean posOrNeg(int numb) {
        if (numb > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Example
        boolean rememberMe = false;
        System.out.println(rememberMe);

        boolean isMyCarDriving = true;
        System.out.println(isMyCarDriving);


        //relational Example
        int cowMilkPrice = 12;
        int veganMilkPrice = 14;

        System.out.println(cowMilkPrice == veganMilkPrice); //False
        System.out.println(cowMilkPrice != veganMilkPrice); //True

        boolean isCowMilkMoreExpectanciesVegan = 12 > 14;
        System.out.println(isCowMilkMoreExpectanciesVegan); //False
        System.out.println(cowMilkPrice < veganMilkPrice);  //True

        //with strings
        System.out.println("hey" == "hey"); //True
        System.out.println("hey" == "hello"); //false
        //-------------------------------------------------------------

        //Example on logical operators //AND//
        System.out.println(true && true); //True
        System.out.println(true && false); //False

        //Example on logical operators //OR//
        System.out.println(true || true); //True
        System.out.println(true || false); //Still True

        //-------------------------------------------------------

        //Facebook Example
        boolean isPostPublic = true;
        boolean isFriendOfUser = false;

        boolean canUserComment = isPostPublic || isFriendOfUser;
        System.out.println(canUserComment); //True

        // He can comment but only because the post is public

        //----------------------------------------------------------

        //Example on Conditional statements
        boolean isSunShining = false;   //<-- you can change this
        if (isSunShining) {
            System.out.println("the sun is shining ☀"); //If true
        }else {
            System.out.println("not today sorry"); //If false
        }

        /*
        if we wanted to say that it's not shining we have the (else)

        if we want to write some more, then we have the (else if)

        let's take another example
         */
        int age = 13;

        if (age < 16) {
            System.out.println("no alcohol for you 🤚");
        } else if (age > 16 && age < 18) {
            System.out.println("beer time!! 🍺");
        } else {
            System.out.println("beer and something stronger please!! 🍻 🍻");
        }

        //---------------------------------------------------------------


        //Real world Example

        int userAge = 13;
        int accountAmount = 100;

        // Let's say this comes from the user
        int accountToWithdraw = 50;
        boolean canUserWithdraw = accountAmount - accountToWithdraw > 0;

        if (userAge >= 13 && canUserWithdraw) {
            System.out.println("Withdrawing " + accountToWithdraw + " dollars 💵");
        } else {
            System.out.println("Sorry you cannot withdraw any money");
        }

        //-----------------------------------------------------------------

        //Switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("your calender is different than mine");
        }
        //---------------------------------------------------------

        //Exercise 2

        String[] names = {"Laura", "Elisa", "Mo", "Søs", "Sara"};

        boolean largerThan4 = isItMoreThan4(names);
        System.out.println(largerThan4);


        //Exercise 2.2

        System.out.println(posOrNeg(-28)); // as a method activation

        // System.out.println(posOrNeg(sc.nextInt())); // as an input

        int numb = -2;

        System.out.println(posOrNeg(numb)); // as an argument


        //Exercise 3
        System.out.println("input a letter");
        /*
        String inputFromUser = sc.nextLine();



        switch (inputFromUser) {
            case "a", "A":
            case "e", "E":
            case "i", "I":
            case "o", "O":
            case "u", "U":
            case "y", "Y":
                System.out.println(inputFromUser + " is a vowel");
                break;
            default:
                System.out.println(inputFromUser + " is a consonant");



                if (inputFromUser.length() > 1) {
                    System.out.println("error");
                }
        }

         */
        //Exercise 3.1




        System.out.println("player 1 what number do you think player 2 will guess");
        int player1Guess1 = sc.nextInt();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("player 2 what number do you think player 1 will guess");
        int player2Guess1 = sc.nextInt();

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("player 1 guess");
        int player1Guess2 = sc.nextInt();

        System.out.println("player 2 guess");
        int player2Guess2 = sc.nextInt();


        System.out.println("player 1 was " + (player1Guess1 - player2Guess2) + " off, "
                + "player 2 was " + (player2Guess1 - player1Guess2) + " off.");

        if (player1Guess1 >= player2Guess1) {
            System.out.println("player 2 wins");
        } else if (player2Guess1 >= player1Guess2) {
            System.out.println("player 1 wins");
        }


        /*


        //Exercise 4
        System.out.println("enter salary");
        int salary = sc.nextInt();
        System.out.println("enter year of service");
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            System.out.println("bonus is " + (0.05 * salary));
        } else {
            System.out.println("no bonus");
        }

         */
        /*
        //Exercise 5 (4)
        System.out.println("how many rows do want?");
        int rows = sc.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {

                //print i,
                //as i =1 in first outer loop, so it will print 1
                //i=2 in second outer loop, so it will print 22
                //i=3 in third outer loop, so it will print 333
                System.out.print(i);
            }
            System.out.println();
        }

         */

        //Exercise 5
        System.out.println("how many rows?");
        int rowsOfDiamond = sc.nextInt();

        int midRow = (rowsOfDiamond)/2;

        //Initializing row with 1

        int row = 1;

        System.out.println("Here Is Your Diamond : ");

        //Printing upper half of the diamond
        for (int i = midRow; i > 0; i--) {

            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing j *'s at the end of each row
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();

            //Incrementing the row
            row++;
        }

        //Printing lower half of the diamond
        for (int i = 0; i <= midRow; i++) {

            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            //Printing j *'s at the end of each row
            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();

            //Decrementing the row
            row--;
        }

        //Exercise 6
        System.out.println("input first digits");
        int firstDigits = sc.nextInt();
        System.out.println("input second digits");
        int secondDigits = sc.nextInt();
        System.out.println("input third digits");
        int thirdDigits = sc.nextInt();

        if (firstDigits < secondDigits && secondDigits < thirdDigits) {
            System.out.println("its increasing");
        } else if (firstDigits > secondDigits && secondDigits > thirdDigits) {
            System.out.println("its decreasing");
        } else {
            System.out.println("neither");
        }

    }
}
