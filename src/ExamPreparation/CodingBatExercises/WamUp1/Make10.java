package ExamPreparation.CodingBatExercises.WamUp1;

public class Make10 {
    //Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Make10 make10Class = new Make10();

        System.out.println(make10Class.makes10(3, 7));//True
        System.out.println(make10Class.makes10(10, 4));//True
        System.out.println(make10Class.makes10(3, 4));//False

    }
}
