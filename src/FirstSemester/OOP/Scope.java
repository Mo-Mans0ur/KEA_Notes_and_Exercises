package FirstSemester.OOP;

public class Scope {
    public static void main(String[] args) {
        /*
        Scope is something that defines where your variables are
        and function

        lets take an examples on what it is
         */

        String name = " ";
        for (int i = 0; i < 3; i++) {
            name = "Ali";
        }

        /*
        so if we try to write
        System.out.println(name);

        then the name will turn red thats because "name" is in
        the brackets above and it cant get out

        so the way we can do this is we can take
        String name = "Ali";

        above the for loop and remove the string in
        String name = "Ali"; inside the brackets
        so it turns out like

        name = "Ali";

        remove the string "Ali" above the loop

        String name;

        but if we do that java will say no and turn red again,
        because it says it "might not be defined"

        so we put an empty string and cheat java like

        String name = " ";


         */

        System.out.println(name);

        /*
        it all depends on the brackets {}
        a variable can only be defined inside the brackets
         */

        /*
        that all folks
         */
    }
}
