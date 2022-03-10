package ExamPreparation.FromTheBottom;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    /*
    in selection sort, the algorithm tries to find the smallest
    unsorted element and adds it to the end of the sorted list

    in pseudocode:
        * Repeat until no sorted elements remain:

        * Search the unsorted part of the Data
        to find the smallest value

        * Swap the smallest found value with
        the first element of the unsorted part



          [ 5 ][ 2 ][ 1 ][ 3 ][ 6 ][ 4 ]

        so all the elements is unsorted

        so we go through the entire list and find the smallest value

        [ 1 ] in this case. now that's part 1

        part 2 is to swap it with the first element of the unsorted part

        [ 5 ]

          [ 1 *][ 2 ][ 5 ][ 3 ][ 6 ][ 4 ]

        and now again we go through the entire list and find the smallest value

        [ 2 ] in this case. but the 2 also happens to be the first element in the list

        so that is sorted
          [ 1 *][ 2 *][ 5 ][ 3 ][ 6 ][ 4 ]

        next [ 3 ] and swap it with [ 5 ] and now that's sorted
          [ 1 *][ 2 *][ 3 *][ 5 ][ 6 ][ 4 ]

        next [ 4 ] and swap it with [ 5 ] now that is sorted
          [ 1 *][ 2 *][ 3 *][ 4 *][ 6 ][ 5 ]

        and last but not least [ 5 ] swaps with [ 6 ] an sorted
          [ 1 *][ 2 *][ 3 *][ 4 *][ 5 *][ 6 *]

        worst-case scenario:
            we have to iterate over each the elements of the array
            (to find the smallest unsorted element) and repeat it
            n times since only 1 element gets sorted each time

        best-case scenario:
            Exactly the same there's no say the array is sorted
            until we go through the process for all elements
     */
        //Exercise

        static ArrayList<Integer> arrayListOfNumbers = new ArrayList<Integer>();

        static ArrayList<Integer> sort (ArrayList<Integer> list) {

            for (int i = 0; i < list.size(); i++) {
                int minimumIndex = i;
                for (int j = i + 1; j <list.size(); j++) {

                    if (list.get(minimumIndex) > list.get(j)) {
                        minimumIndex = j;
                    }
                    Collections.swap(list,minimumIndex,i);
                }
            }
            return list;
        }

    public static void main(String[] args) {
        arrayListOfNumbers.add(5);
        arrayListOfNumbers.add(2);
        arrayListOfNumbers.add(1);
        arrayListOfNumbers.add(3);
        arrayListOfNumbers.add(4);

        System.out.println(arrayListOfNumbers);

        System.out.println(sort(arrayListOfNumbers));
    }
}
