package ExamPreparation.FromTheBottom;

import java.util.StringTokenizer;

public class Arrays {
        /*
        an Array is a form of list/box which can only hold 10 things in it

        [] this is what implicate it's an Array

        and it can be used in a String, integer and a double

        String[] names = {"peter", "jens", "camilla", "luna"};

        int[] numbers = [1,2,3,4,5,6,];

        double[] numbers = [2.4, 3.2, 2.5];

         */





    //Example of making an Array method
    public static String getLastElement(String[] arrayFromUser) {
        System.out.println(arrayFromUser.length - 1);

        return arrayFromUser[arrayFromUser.length - 1];
    }

    //Example of making an Array method int version
    public static int[] intArrayMethod() {

        return new int[]{1,2,3};
    }




    //Exercise 2
    public static String exercise2(String[] names, int n) {
        String input = names[n];
        return input;
    }

    //Exercise 4
    public static int lowestValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Exercise 5
    public static int findNumbOfWords(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        String[] words = string.split("\\s+");
        return words.length;
    }
    /*
    \s is a character class to detect space including tabs,
    since \ needs to be escaped in Java, it becomes \\s and
    because there could be multiple spaces between words we made this regular expression greedy by adding +,
    hence \\s+ will find one more space and split the String accordingly.


    Read more: https://www.java67.com/2016/09/3-ways-to-count-words-in-java-string.html#ixzz7GvOcqIkz
     */

    //different method
    public static int findNumbOfWords2(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(string);
        return tokens.countTokens();
    }


    public static void main(String[] args) {

        //iterating over Arrays
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x;
        for (int j = 0; j < intArray.length; j++) {

            x = intArray[j];

            System.out.print(x + " ");

        }

        //Example Strings

        String[] usernames = {"\nAtomic-disco", "ActualPhant0m", "peterpedal"};

        //taking an element out of an Array
        String firstUsername = usernames[0];    //Atomic-disco
        System.out.println(firstUsername);

        String secondUsername = usernames[1];   //ActualPhant0m
        System.out.println(secondUsername);

        //to see how many elements there are in the array
        System.out.println(usernames.length);

        //sometimes i, or you make a mistake but mostly me luckily we can work around that

        usernames[2] = "NeonNeo";
        System.out.println(usernames[2]);

        //Examples with ints and double

        int[] prices = {1, 99};
        double[] prices2 = {1.1, 99.9};

        System.out.println(prices[1]);      // 99

        System.out.println(prices2[0]);     // 1.1

        //Example of making an Array method

        String lastElement = getLastElement(usernames);
        System.out.println("the last element is: " + lastElement); // NeonNeo

        //Example of making an Array method int version
        int array[] = intArrayMethod();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        //------------------------------------------------------


        //Exercise 1.2
        String[] musicTitles = {"My Side of The Fence","I dont want to write this song",
                "Like i loved you", "One good reason", "Not over you","Tell me"};

        System.out.println(musicTitles[0]);

        //Exercise 1.21
        int[] arrayOfInts = {1,5,6,7,4,3,2,};

        arrayOfInts[1] = 2;
        System.out.println(arrayOfInts[1]);

        //Exercise 1.22
        boolean[] rainingSummer = {true,false,true,false};
        rainingSummer[3] = true;
        System.out.println(rainingSummer[3]);

        //Exercise 1.4
        String[] names = {"sarah","ali","jens","michael","jens"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].replaceAll("jens", "jens 🔥🔥");
            System.out.println(names[i]);
        }

        //Exercise 2
        String[] names2 = {"peter", "mads", "phillip", "joey"};
        System.out.println(exercise2(names2,3));

        //Exercise 4
        int[] numbArray = {4, 3, 5, 6, 2, 7, 1};

        System.out.println(lowestValue(numbArray));

        //Exercise 5
        String story = "der var enGang";
        System.out.println(findNumbOfWords(story));

        //different method
        String songTitle ="Like i loved you";
        System.out.println(findNumbOfWords2(songTitle));


    }
}
