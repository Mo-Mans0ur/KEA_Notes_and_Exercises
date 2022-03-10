package ExamPreparation.CodingBatExercises.WarmUp2;

public class AltPairs {
    public String altPairs(String str) {
        /*
        Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
         */

        String result = "";

        //run i by 4
        for (int i = 0; i < str.length(); i += 4) {
            //append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();

            }   //from i to end
            result = result + str.substring(i, end);
        }
        return result;
    }

    public static void main(String[] args) {
        AltPairs altPairsClass = new AltPairs();

        System.out.println(altPairsClass.altPairs("Kitten"));       //Kien
        System.out.println(altPairsClass.altPairs("Chocolate"));    //Chole
    }
}
