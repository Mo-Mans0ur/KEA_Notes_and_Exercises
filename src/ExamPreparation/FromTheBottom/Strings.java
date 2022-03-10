package ExamPreparation.FromTheBottom;

import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstName = "Mohammad";
        String lastName = "Mansour";

    /*
       fruit -----> b|a|n|a|n|a
                    0|1|2|3|4|5
       in programming you have elements in a sequence, and the
       characters in the sequence is called index so in the first
       element we have index 0 that is the character "b" and index 1 we
       have the character "a" and so on


       System.out.println(firstName.charAt(0));// charAt means what index is it going to choose
       the index that gets printed out is the character "M"
       if I wanted the "h" in my name I would have to put 2
       in the parentheses

       you can write it differently too, like this
       char firstCharacter = firstName.charAt(0)
       System.out.println(firstname);
       it should give the same output

       to call a method on a string write "." and then the method
       you want Like.

       System.out.println(firstName.toUpperCase());
       when it's inside the console
       it will write the name or line in uppercase's
       MOHAMMAD


      you can write it like this too
      String firstNameUppercase = firsName.toUppercase();
      and then print it out
      System.out.println(firstNameUppercase);

      and it's basically the same (name or line in UpperCase)
     */
        //Contains Method
     /*
        System.out.println(firstName.contains("yyy"));

        so basically this is a question to the pc "does my name
        contain "yyy" ? and the console will say false

        what if I write "mad"

        System.out.println(firstName.contains("mad"));

        it does contain "mad" so it will say true
      */

         //Exercises
        String name = firstName + " " + lastName;

        System.out.println(name);

        //Contains
        System.out.println(name.contains("mad"));

        //length
        System.out.println(name.length());

        /*
        the length method tells you how many characters there are in the name
        but there isn't 16 characters in my name its says so because it counts
        the spaces with

        to remove the spaces we have to -1
         */
        System.out.println(name.length()-1);


        //Exercise 2

        //Convert a string to upperCase
        System.out.println(name.toUpperCase());

        //return the index of a character
        System.out.println(name.charAt(0));

        //Concatenate (binds 2 strings together) two different string
        System.out.println(firstName.concat(lastName));

        //check these strings are equal to eachOther
        String greeting = "hello";
        String vehicle= "bike";
        String name1 = "name";
        String answer = "yes";

        System.out.println(greeting.contains("ollhe"));
        System.out.println(vehicle.contains("banana"));
        System.out.println(name1.contains("Name"));
        System.out.println(answer.contains("yes"));


        //substring()

        /*
        if we have a String lets say BareFoot and its index numbs are : 01234567

        what it does is that it returns a part of the original string

        Note: substring returns a String, CharAt returns a char
         */

        String word = "BareFoot";

        String sub1 = word.substring(0, 4); // we always have to get one above the one we want
        String sub2 = word.substring(4, 8);

        System.out.println("the sub of " + word + " (0, 4) is: " + sub1);
        System.out.println("the sub of " + word + " (4, 8) is: " + sub2);

        System.out.println(word.substring(4)); //this means that it will take from index 4 to end

        // so it's basically a from to tool


        //Exercise 3
        //1
        System.out.println("the character in index 8 is: " + name.charAt(3));

        //7
        String php = "PHP Exercise and";
        String python = "Python Exercises";

        System.out.println(php.concat(" " + python));

        //8
        System.out.println(php.contains("and"));

        //11
        String e = "example.com";
        System.out.println(e.length());

        //Exercise 3.1
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input a String");
        String input1 = scanner.nextLine();

        System.out.println("please input a substring to check");
        String input2 = scanner.nextLine();

        System.out.println("is jam part of Benjamin? " + input1.contains(input2));

        //Other method. the if method

        System.out.println("please input a String");

        if (input1.contains(input2)) {
            System.out.println("its true");
        } else if (input1 != input2) {
            System.out.println("its False");
        }





    }
}
