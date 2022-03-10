package FirstSemester.ProgramFlow;

public class Debugging {
    public static void main(String[] args) {
        /*
        when you are a developer it can be tricky to code
        maybe its says there is an error you don't understand
        or there's simply not an error, but it still won't run

        debugging is a process that lets you go deeper to find
        and fix the problem

        let's take an example
         */
        String mood = "happy";

        if (mood == "happy") {
            System.out.println("you look happy");
        } else if (mood == "mad") {
            System.out.println("someone woke up with an attitude");
        }else{
            System.out.println("i dont know how your mood is");
        }

        System.out.println("done");


        int[] productPrices = {1, 3, 90};
        int sum = getSumFromArray(productPrices);
        System.out.println("the sum of the array is " + sum);
    }
     /*
     something is wrong it has to say the sum is 94, but it
     shows the sum is 3, so we debug

     in the debugger we could see that the sum runs 3 times
     and pluses with 1

     so in between the for loop and the int we write
     "int currentPrice = array[i]"

     and change  the sum to sum + currentPrice

      */
    public static int getSumFromArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentPrice = array[i];
            sum = sum + currentPrice;
        }
        return sum;
    }

    /*
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
    // that's all folks
}
