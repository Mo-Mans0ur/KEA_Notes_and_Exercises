package ExamPreparation.CodingBatExercises.WamUp1;

import java.util.Scanner;

public class MissingChar {
    /*

    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
     */

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public static void main(String[] args) {
        MissingChar missingCharClass = new MissingChar();
        Scanner scanner = new Scanner(System.in);

        String kitten = "Kitten";
        String input = scanner.nextLine();

        System.out.println(missingCharClass.missingChar(kitten, 1)); //Ktten
        System.out.println(missingCharClass.missingChar(kitten,3));  //kiten

        //other method with scanner

        System.out.println(missingCharClass.missingChar(input,2));  //socer
    }
}
