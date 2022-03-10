package FirstSemester.Basics;

public class Strings {
    public static void main(String[] args) {
        /*
        fruit -----> b|a|n|a|n|a
                     0|1|2|3|4|5
        in programming you have elements in a sequence, and the
        characters in the sequence is called index so in the first
        element we have index 0 that is the character "b" and index 1 we
        have the character "a" and so on

         */
        String firstName = "Mohammad";
        String lastName = "Mansour";

        /*
        System.out.println(firstName.charAt(0));// charAt means what index is it going to choose
         the index that gets printed out is the character "M"
         if I wanted the "h" in my name I would have to put 2
         in the parentheses

         you can write it differently too, like this
         char firstCharacter = firstName.charAt(0)
         it should give the same output
        */

         /*
         to call a method on a string write "." and then the method
         you want Like.
         */

         /*

        System.out.println(firstName.toUpperCase());
        when it's inside the console
        it will write the name or line in uppercase's
        MOHAMMAD
         */
        /*
        you can write it like this too
        String firstNameUppercase = firsName.toUppercase();
        and then print it out
        System.out.println(firstNameUppercase);

        and it's basically the same (name or line in UpperCase)
        */

        // contain Method

        /*

        System.out.println(firstName.contains("yyy"));

        so basically this is a question to the pc "does my name
        contain "yyy" ?" and the console will say false

        what if i write "mad"

        System.out.println(firstName.contains("mad"));

        it does contain "mad" so it will say true

        */
        // little exercise

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // there are 45 character in Mohammad Mansour
        //print this out


        System.out.println("there are " + 45 + " character in " + fullName);

        /*
        but there isnt 45 characters in my name
        we have to find out how many there is but how?
        well let me tell you
        with.
         */
        System.out.println("there are " + (fullName.length() - 1) + " character in " + fullName);

        /*
        with fullName.length()
        it tells you directly
        how many characters there are. but the space comes with
        so 16 you just - 1 to remove the space.

        that's all folks
         */

        /*
        type casting

        byte --> short --> int --> long -->
         */
    }
}
