package ExamPreparation.CodingBatExercises.Recursion1;

public class Factorial {
    /*
    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
    Compute the result recursively (without loops).
     */

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorialClass = new Factorial();

        System.out.println(factorialClass.factorial(3));    //6
        System.out.println(factorialClass.factorial(5));    //120
    }
}
