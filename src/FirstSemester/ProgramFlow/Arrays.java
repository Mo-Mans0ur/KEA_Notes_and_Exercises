package FirstSemester.ProgramFlow;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
    /*
    Arrays is a list

    like shopping list, comments ect.

    [] this is an Array you can use in strings

    String[] names = {"peter", "jens", "camilla", "luna"};

    in integers and doubles

    int[] numbers = [1,2,3,4,5,6,];
    double[] numbers = [2.4, 3.2, 2.5];

    lets take an example downstairs

    remember [] is an Array
     */

        String[] usernames = {"Atomic-disco", "ActualPhant0m", "peterpedal"};

        //how to take an element out of an array

        String firstUsername = usernames[0];
        System.out.println(firstUsername);
        //taking the first username in the String array "Atomic-disco"
        String secondUsername = usernames[1];
        System.out.println(secondUsername);
        //taking the second username in the String array "ActualPhant0m"


        //to check how many usernames there's in the array
        System.out.println(usernames.length);

        /*
        what if you want to change the second username because
        someone made a mistake... (Mo)
        well
         */
        usernames[1] = "ActualFirebird";
        System.out.println(usernames[1]);
        /*
        like that :)


        like I told before you can put anything lets try an int
        and a double
         */

        int[] prices = {1, 99};
        double[] prices2 = {1.1, 9.9};

        String lastElement = getLastElement(usernames);
        System.out.println("last element is: " + lastElement);


        int[] randomNumber = randomArray(7);
        System.out.println(randomNumber);

    }

    //how to make a string array method
    public static String getLastElement(String[] arrayFromUser) {
        System.out.println(arrayFromUser.length - 1);


        return arrayFromUser[arrayFromUser.length - 1];
    }

    // that was a string lets try an int
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] randomNumb = new int[size];
        for (int i = 0; i < randomNumb.length; i++) {
            randomNumb[i] = random.nextInt(100);
        }
        return randomNumb;
    }
    /*
    so we put [1] because its the last element in the username
    String array, but what if there was 3 element
    then we put [2] in because that becomes the last element

    but what is we dont change the int everytime
    we use (.lenght - 1) so no matter how many usernames we put
    in we always get the last

    thats all folks
     */

}
