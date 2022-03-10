package FirstSemester.ProgramFlow;

public class Boolean {
    public static void main(String[] args) {
    /*
    a boolean is a type which can only be true or false
    on or off ect..

    let take an example

     */

        boolean remeberMe = false;

        //or

        boolean isTheSunShining = true;
        /*
        in boolean there is some operators. we have talked
        about one operator, the math operator with: multiplication
        modulus ect.

        but now we have 2 more operators

        - relational operators
        - logical operators

        the relational operator

        how does one value relate to the other is it equal to
        each other, is it bigger or smaller than the other, is
        it NOT equal to a thing.

        there is 6 different relational operators

        * x == y  <-- x is equal to y
        * x != y <-- x is NOT equal to y
        * x > y <-- x is greater than y
        * x < y <-- x is less than y
        * x >= y <-- x is greater or equal to y
        * x <= y <-- x is less or equal to y

        lets take another example

         */

        int cowMilkPrice = 12;
        int veganMilkPrice = 14;

        System.out.println(cowMilkPrice == veganMilkPrice); //false
        System.out.println(cowMilkPrice != veganMilkPrice); //true
        //cowMilk is not greater than veganMilk
        boolean isCowMilkMoreExpensiveThanVeganMilk = 12 > 14;

        System.out.println(isCowMilkMoreExpensiveThanVeganMilk);//false
        System.out.println(cowMilkPrice < veganMilkPrice);//true

        //you can use strings too

        //is hej the same as hej
        System.out.println("hej" == "hej"); //true
        //is hej the same as hejsa
        System.out.println("hej" == "hejsa"); //false



        /*
        logical operator

        there is 2 types of logical operators

        * && <--- AND operator
        * || <--- OR operator


        the AND operator

        lets take and example

        System.out.println(true && true);

        if the one on the left AND on the right is true
        THEN the whole segment is TRUE

        if the one on the left is false AND the one on right
        is true THEN the whole segment is FALSE


         */

        System.out.println(true && true);//true
        System.out.println(true && false);//false

        /*
        the OR operator

        if JUST ONE of them is true THEN the whole
        segment is true

        in the AND operator if one of them is true and the
        other one is false the the whole thing is false in
        the OR operator there just have to be one that is
        true then the whole thing is true (i know... hard
        to take in)
         */

        System.out.println(true || false);//true
        System.out.println(true || false);//still true

        /*
        what are we gonna use it for?
        well let me tell you
        lets take an example
         */

        boolean isPostPublic = true;
        boolean isfriendOfUser = false;

        /*
        some user has logged in on facebook he wants to
        comment on a post, as a developer i have find out
        does this user have permission to post?

        lets say "you can comment IF the post is public"

        OR
        "if you are friend with the person that posted"
         */
        boolean canUserComment = isPostPublic || isfriendOfUser;
        System.out.println(canUserComment); //true

        /*
        he CAN comment but only because the post is public
        change it if you want :)

        thats all folks
         */


        //Switch statement
        int day = 4;
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
    }

}
