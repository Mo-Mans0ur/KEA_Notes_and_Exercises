package FirstSemester.ProgramFlow;

public class ConditionalStatements {
    public static void main(String[] args) {

        boolean isSunShining = true;

        /*
        we would like a code that ONLY runs if the statement
        is true
         */
        /*
        if (isSunShining == false) {
            System.out.println("THE SUN IS SHINING!!!!🔅🔅");

        } else{
            System.out.println("sorry bro its raining");
        }

         */
        //it runs because the statement is true
        //if its false it will go down to else
        //and then pops out to print this
        //System.out.println("do i reach this code?");

        //real world example
        /*
        a man wants to buy a tv which cost
        and we know how much he has in his account
         */

        int televisionPrice = 30000;
        int accountbalance = 30000;

        /*
        as a developer we have to find out "can he buy
        the tv"

        we have to code a statement that says "yes you can
        buy it" and or "no you cant buy it" or "yes you can
        but you wont have that much money left"
         */

        int difference = accountbalance - televisionPrice;
        System.out.println(difference);

        if (difference > 2000) {
            System.out.println("nice bro you can buy the tv. enjoy");
        }else if (difference >= 0 && difference <= 2000) {
            System.out.println("you can buy it, but you wont have much left");
        }else{
            System.out.println("sorry bro, no tv for you");
        }
        /*
        that's all folks
         */
    }
}
