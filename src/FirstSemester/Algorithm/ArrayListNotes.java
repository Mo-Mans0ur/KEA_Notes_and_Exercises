package FirstSemester.Algorithm;

import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args) {
        /*
        an arrayList is a datastructure and datastructures is
        a predefined method to organise data in a pc, so the
        elements in the datastructure can be pulled and used
        as pleased.

        an arraylist is based on an array but has a lot more
        elements

        an array has its limits it has a size so when we have
        initialized and instantiated (made) an array then its
        made with a limit

        the solution to that is an ArrayList

        it's a class that uses arrays as its intern datastructure
        but makes it easier to use an array

        when we make an arraylist we start in some capacity like 10
        everytime we add an element with the help of a method called
        (.add). then when the array is full, because the rules hasn't
        changed, the array will (without us doing anything) make a new
        array and move the elements to a that array.

        when this new array has been made and the old elements has been
        moved to the new we can continue adding elements
----------------------------------------------------------------------------------
        so to sum up: when making an arraylist, and we keep adding elements,
        the arraylist will make a new and bigger array then it will transfer
        the old ones into the new
----------------------------------------------------------------------------------
        Wrapper Classes

        a minor detail in an arraylist it can only take objects, and it will make a
        problem if we use primitive types (ints, doubles, booleans) in an arraylist

        the solution on that is that Oracle in java's site has made wrapper classes
        which makes an object that encapsulate a primitive types and that happens in
        the newer versions of java

        what happens is the primitive value gets "boxed" in a Wrapper class and then
        gets added to the arrayList.
----------------------------------------------------------------------------------
         */

        //lets talk Syntax

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        //specify what type of array it is.
        /*
        the thing with Arraylists is that they can contain different kind of data
        and its recommended that you specify what type of Arraylist it is with these
        <>

        ArrayList<integer> listOfNumbers = new ArrayList<integer>();
        ArrayList<String> listOfNumbers = new ArrayList<String>();
        ArrayList<double> listOfNumbers = new ArrayList<double>();

         */

        listOfNumbers.add(150);//[0]
        listOfNumbers.add(200);//[1]
        listOfNumbers.add(3300);//[2]

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
        System.out.println(listOfNumbers.size());


        //removing an element
        /*
        if we want to remove an element from the list we use the method type
        .remove(place of element)
         */

        listOfNumbers.remove(1);
        System.out.println(listOfNumbers.get(1));

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

        //that's all folks

        //some other lists
        /*
        LinkedList<String> linked = new LinkedList<String>();

         */
    }
}
