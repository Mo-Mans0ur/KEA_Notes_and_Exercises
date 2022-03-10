package ExamPreparation.FromTheBottom;

import ExamPreparation.FromTheBottom.ExamPreparationClasses.RandomNumberGenerator;

public class BinarySearch {
    public static void main(String[] args) {//19.10.21//
        //Binary Search
        /*
        binary search is also an algorithm to find an element in an
        array but unlike the linear search the binary search has some
        special conditions to be made before it works

        the binary search it reduces the search area by half each time
        its trying to find an element

        but in order to reduce the time our array has to be sorted

        in pseudocode:

        (sub)array = smaller pieces of the array

        repeat until the (sub)array is of size 0
            calculate the middle point of the current (sub)array.

            if the target element is at the middle, stop.

            otherwise, if the element is less than what's in the middle,
            repeat, changing the end point to be just to the left of
            where we just looked(stopped)

            otherwise, if the target is greater than what's at the middle,
            repeat, changing the start point to be just at the right of
            where we just looked(stopped)

            example:



            [11, 23, 8, 14, 30, 9, 6, 17, 22, 28, 25, 15, 7, 10, 19]
            [0,  1,  2, 3,  4,  5, 6, 7,  8,  9, 10, 11, 12, 13, 14]


            so are we ready?
            not quite yet remember we have to sort the array first

            so step one is to sort the array with (not yet learned)

            [6, 7,  8, 9, 10, 11, 14, 15, 17, 19, 22, 23, 25, 28, 30]
            [0, 1,  2, 3,  4,  5, 6,  7,  8,  9, 10, 11, 12, 13, 14]

            now we are ready!

            Target = 19
            Start = index 0
            End = index 14
            Middle = 0 + 14 /2 = 7

            is 15 what we are looking for

            no, and because 15 is lower than our target, we change the
            start point to be just to the right of the middle.

            and now we have this

           [17, 19, 22, 23, 25, 28, 30]
           [8,  9, 10, 11, 12, 13, 14]

           and it looks like this

            Target = 19
            Start = index 8
            End = index 14
            Middle = 8 + 14 /2 = 11

            so are 23 what we are looking for?

            nope, and because our target is lower than our target, we change the
            start point to be just to the left of the middle.

            [17, 19, 22, 23]
            [8,  9, 10, 11]

            now our target list has to be changed to this

            Target = 19
            Start = index 8
            End = index 10
            Middle = 8 + 10 /2 = 9

            is 19 what we are looking for?

            yep, and we are done.

            alright but what if the target is 16 which is not in
            the array would it still run?

            well yeah, but it will end to have the size of the
            array to be 0

            worst-case scenario:
            we have to divide a list of elements in half repeatedly
            to find the target element the target will be at
            the end of the last element, or it doesn't exist

            best-case scenario:
            the target is the midpoint of the array, so we can stop
            immediately after we stop.

         */

        //Exercise Binary search

        RandomNumberGenerator generator = new RandomNumberGenerator();

        int[] toSearch = generator.getNumbers();


        binarySearch(toSearch, 8);


    }

    public static int binarySearch(int[] arrayToSearch, int numberToFind) {
        int start = 0;
        int end = arrayToSearch.length -1;
        int middle = end/2;

         //[1][2][3][4][5][6][7][8][9][10]
        // [0][1][2][3][4][5][6][7][8][9]

        //target = 4
        //Middle = 4
        //Start = 0
        //End = 9

        while (true) {
            if (arrayToSearch[middle] == numberToFind) {
                System.out.println("Yay great success");
                return middle;

            } else if (arrayToSearch[middle] < numberToFind) {
                start = middle + 1;
                middle = (start + end) / 2;

            } else if (arrayToSearch[middle] < numberToFind) {
                end = middle -1;
                middle = end / 2;
            }
        }
    }
}
