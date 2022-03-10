package ExamPreparation.FromTheBottom;

public class Debugging {
    public static void main(String[] args) {
        /*
        in software development it can be tricky to code maybe
        an error you can't see even if it's right in front of
        your face, or It's not even an error, but it won't run

        debugging is a tool that can help it lets you go deeper
        in the code tot try and see what will fix mistake/error

        let take an example
         */

        String mood = "happy";

        if (mood == mood) {
            System.out.println("you look happy");
        } else if (mood == "mad") {
            System.out.println("someone woke up with an attitude");
        } else {
            System.out.println("i have no idea how your mood is");
        }

        System.out.println("done");

        int[] productPrices = {1, 3, 90};
        int sum = getSumFromArray(productPrices);
        System.out.println("the sum of the array is " + sum);

        /*
         the sum is 94, but it
         shows the sum is 3, so we debug

        in the debugger we could see that the sum runs 3 times
        and pluses with 1

        so in between the for loop and the int we write
        "int currentPrice = array[i]"

        and change the i int the sum to sum + currentPrice



        when you debug you come in to a different console
        there is some arrows

        * step over
        * step into
        * force step into
        * step out

        step over: doesn't step into method but steps over

        step into: steps into the method that is defined

        force step into: steps into javas definition of that line

        step out: takes a step back up
      */
    }

    public static int getSumFromArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentPrice = array[i];
            sum = sum + currentPrice;
        }
        return sum;
    }
}
