package ExamPreparation.CodingBatExercises.WarmUp2;

public class XxCounter {
    /*
    Count the number of "xx" in the given string.
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */
    public int XCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        XxCounter xxCounterClass = new XxCounter();

        System.out.println(xxCounterClass.XCounter("xxxCounter"));      //2
        System.out.println(xxCounterClass.XCounter("ForRealxx"));       //1
    }
}
