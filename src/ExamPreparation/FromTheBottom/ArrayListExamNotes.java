package ExamPreparation.FromTheBottom;

import java.util.ArrayList;

public class ArrayListExamNotes {
    public static void main(String[] args) {
        /*
        an ArrayList is a Datastructure and datastructure is
        a predefined method to organise data in a computer, so
        the elements in the datastructure can be pulled and used
        as pleased.

        an ArrayList is based on an Array but with some tweaks

        an Array has a limit its size is 10 elements +-

        an ArrayList on the other hand it starts at 10 everytime
        when we add an element we use a method (.add) when the limit
        is reached, because the rules haven't changed, the Array
        wil make a new Array and move the elements to that Array.

        when this new Array has been made and the old elements has been
        moved to the new we can continue adding elements
------------------------------------------------------------------------
        so to sum up: when making an ArrayList, and we keep adding elements,
        the ArrayList will make a new and bigger Array then it will transfer
        the old ones into the new
------------------------------------------------------------------------
        Wrapper Classes

        a little detail in an ArrayList it can only take objects, and it will
        make a problem if we use primitive types (ints, doubles, booleans,char) in an
        ArrayList

        the solution is that Oracle in Java's site has made wrapper classes
        which makes an object that encapsulate primitive types and that happens
        in the newer versions of java

        what happens is the primitive value gets "boxed" in a Wrapper class and
        then to the ArrayList

        so they convert primitive data (ints, doubles, char and booleans) into objects
        int becomes Integer, double becomes Double with big D and, char becomes Character
        ect. inside the Arraylist, think of it like a box where the name is the box
        and what's inside it is the primitive type Integer(int), Character(char)

        if we have an example in wrapping around an integer

        int num = 10;

        Integer intObject = new Integer(num);

        and printing it out

        System.out.println(intObject); // 10
-------------------------------------------------------------------------

        first we have to specify what type ArrayList it is because it
        can contain different kinds data and its recommended that you specify
        with these <>

        ArrayList<integer> listOfNumbers = new ArrayList<integer>();
        ArrayList<String> listOfNumbers = new ArrayList<String>();
        ArrayList<Double> listOfNumbers = new ArrayList<Double>();

        now lets try it out
         */
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();                                //<---- Wrapper Class

        //Adding Numbers to the ArrayList

        listOfNumbers.add(150);     //[0]
        listOfNumbers.add(200);     //[1]
        listOfNumbers.add(3300);    //[2]

        //Remember!
        /*
        when you add an element into the arraylist it will take the first spot that's
        available in this case so its 0 and upwards.
         */

        //when printing it out
        /*
        when printing out in this case if we want a specific element we use the method
        type .get(place of element)

        if we want to se how many elements there is in the arrayList we use the method
        type .size
         */
        System.out.println(listOfNumbers.get(1));
        System.out.println(listOfNumbers.get(0));
        System.out.println(listOfNumbers.get(2));
        System.out.println(listOfNumbers.size());

        //removing an element
        /*
        if we want to remove an element from the list we use the method type
        .remove(place of element)
         */

        listOfNumbers.remove(1); //200
        System.out.println(listOfNumbers.get(1)); //3300

        //enhanced for loop print every element
        /*
        if we want to print out every element in the arraylist foreach loop is
        great
         */

        for (Integer e:listOfNumbers) {
            System.out.println(e);
        }

        //sum of the elements in the arraylist
        /*
        so if you want the sum of the elements in the array list first make
        a variable called sum and everytime it runs it will add the elements together
         */

        int sum = 0;
        for (Integer e:listOfNumbers) {
            sum = e + sum;
        }
        System.out.println(sum);

        //Other List that i have to look at
        //LinkedList<String> linked = new LinkedList<String>();
    }
}
