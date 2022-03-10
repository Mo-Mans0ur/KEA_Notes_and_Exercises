package ExamPreparation.CodingBatExercises.String1;

public class MakeAbba {
    /*
    Given two strings, a and b, return the result of
    putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        MakeAbba makeAbbaClass = new MakeAbba();

        System.out.println(makeAbbaClass.makeAbba("Hi", "Bye"));
        System.out.println(makeAbbaClass.makeAbba("Baby","Adult"));
    }
}
