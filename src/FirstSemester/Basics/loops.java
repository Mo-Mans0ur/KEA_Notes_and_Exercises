package FirstSemester.Basics;

import java.util.Random;

public class loops {
    public static void main(String[] args) {
        //note
        /*
        loops is to use again and again instead of using the same code
        multiple times.
        there is different kinds of loops the one in focus right
        now is "for" loops

        examples on loops:
        While loops
        do while loops
        ect.
         */
        //example on the video

        /*
        for (int i = 0; i < 3; i++) {
            System.out.println(i);

        }
        */
        //note

        /*
        the first part of the segment chooses where the loop starts
        its seperated with a semicolon

        the second segment says how many times the loop will go
        in this case the loop is going to go when an (I) is lower than 3

        but when is it going to do that when the (I) is zero
        that happens in the third segment

        it tells us that when we run the code we put 1 to (I)


      is 0 lower than 3?
      yes = it gets printed out
      is 1 lower than 3?
      yes = it gets printed out
      is 2 lower than 3?
      yes = it gets printed out
      is 3 lower than 3?
      no = the loop ends
     */
        //example on 12 to 15

        /*

        for (int i = 12; i < 16; i++) {
            System.out.println(i);

        }
        System.out.println("done with loop");

         */

        //example on minus
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
         */

        //world example
        //print all characters in a string
        /*
        String flower = "Rose";
        System.out.println(flower.length());
        for (int i = 0; i < flower.length(); i++) {
            System.out.println(i + 1 + " karakter er " + flower.charAt(i));
        }
        System.out.println("done with loop");

         */

        //exercise 1.1
        /*

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
         */

        //it runs until the statement isn't true
        // a do while runs the code "once" to checks if the statement is true
        // if its true it will run again
        //if not the loop ends

        //exercise 1.2
        /*
            the "false" changes to "true" WHEN the program finds the
            character "e" in Umbrella and then jumps out of the loop
             */

        //exercise 1.3
        //for loops

        /*
        // 1.3.1
        String greeting = "Hello World";
        for (int i = 0; i < 3; i++) {
            System.out.println(greeting);
        }
        */
        /*
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        */
        /*
        char star = '*';
        for (int i = 0; i < 10; i++) {
            System.out.println(star);
        }
        */
        /*
        for (int i = 5; i > -6; i--) {
            System.out.println(i);
        }

         */
        /*
        for (int i = 5; i < 31; i = i + 3) {
            System.out.println(i);

        }
        */

        //while loops
        /*
        1.3.1

        int i = 0;
        while (i < 3) {
            System.out.println("hello World");
            i++;
        }
        */


        // exercise 2
        /*
        for (int i = 1; i < 11; i++) {
            System.out.println("i am now printing for the " + i+ " th time");
        }
        */

        //exercise 2.1

        Random random = new Random();
        for (int i = 0; i < random.nextInt(10); i++ ) {
            i = random.nextInt(i);
            System.out.println("#");
            i++;
        }



        // anden metode
        /*
        Random random = new Random();
        String hashtag = "";
        for (int i = 0; i < random.nextInt(100); i++) {

            hashtag = "#" + hashtag;

        }
        System.out.println(hashtag);
         */

        //exercise ⭐

        // (a)

        String hashtag = "";
        for (int i = 0; i < 8; i++) {
            System.out.println(hashtag);
            hashtag = "#" + hashtag;

        }

        //(b)
        /*
        String hashtag2 = "";
        for (int i = 8; i > 0; i--) {
            System.out.println(hashtag2);
            hashtag2 = "#" + hashtag2;
        }

        //kunne ikke gå nedad
        */


    }

}
