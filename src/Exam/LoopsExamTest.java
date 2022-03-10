package Exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class LoopsExamTest {
    static Random random =new Random();
    static ArrayList<Integer> numbers = new ArrayList<Integer>(100);
    private int numb = 1;
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {


        numbers.add(i);
            System.out.println(random.nextInt(numbers.get(i-1)));
        }


        pattern();
    }

    public void AverageNumber() {

    }

    public static void pattern() {
        int numb = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {

            }
             numb = 1 + numb;
            System.out.print(numb);

            

        }
        //Loops Exam Test
        /*
        1. create an ArrayList with 100 random integers between 1 and 100.
        2. calculate the average number's int the arraylist.
        3. print out the following pattern

        1
        12
        123
        1234
        12345:
         */
    }
}
