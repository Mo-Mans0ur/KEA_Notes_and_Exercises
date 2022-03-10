package FirstSemester.ProgramFlow;

public class Methods {
    // Purpose is to give a string and get a string back that is emojifyed
    public static String emojifyAString(String stringToEmojify) {
        return stringToEmojify + "🎉";
        //notes
        /*
        methods can be useful to make... yeah a method that's when
        you ask if this user is logged in it can give
        the answer "yes this user is logged in" or "no, there's no
        user logged in"

        2. example for a method is you can put a for example a
        facebook post, and you ask it "can you find the comments
        under the post for me"

        or you can make a new user like "hey method I wish to
        make a new user I have this name, age, where I live, my dead
        aunts name ect." and it will fill out the rest

        OR you can get some new structure in your code.

         */
        /*
        "public static" is a what you call a modifier of a method
        but don't worry we are not talking about that yet, It's when
        we talk about classes. just ignore it for now.

        "String" after "public static" is java want to return in our
        method, that is the TYPE we will return and in this case
        it's our "String type"

        "emojifyAString" is the name of the method WE gave it

        and (String stringToEmojify) is our parameter in our
        parameter we have the type "String" and we called it
        "stringToEmojify"

        so our input in this method is a normal and boring string
        to a string with an emoji

        ...what you call the parameters too is "a place holder value"

         */

    }
        //our own method string with fullname
    public static String getFullName(String firstname, String lastName) {
        String fullname = firstname + " " + lastName;
        return fullname;
        // returns the statement
    }
        //our own method string saying hello
    public static void sayHi(){
        System.out.println("Hi");
        /*
        void means there isn't anything and doesn't have a return

        you can print anything like ("HI")
         */
    }

    /*
    you can have a method with multiple parameters
    lets take an example

    to invoke we have to provide 2 ints as arguments

     */
    public static void printTime(int hour, int minute) {

        System.out.println(hour + ":" + minute);
    }

        //main string
    public static void main(String[] args) {


        String name = "Mohammad";
        //name.length() <--- this is a method "length" is the method name
        /*System.out.println(name.length()); <----- this gives out
        "the return value" (how many characters is there in this
        String)

        so there have been people who made that method code (length)
        and that is what we are talking about
        */
        System.out.println(emojifyAString("Mohammad"));
        /*
        so what happens is that it takes a name... in this case mine,
        and adds an emoji

        the "Mohammad" is called our argument in "java language"
        and is our input in our method

        the argument will be set in stringToEmojify,
        stringToEmojify is our "placeholder value"

        it is different things depending on
        what you call the method

         */

        //similar example
        String mohammadEmojified = emojifyAString("Mohammad");

        System.out.println(mohammadEmojified);
        /*
        the "mohammadEmojified" is what we can call capturing variable
         */

        String firstname = "Mohammad";
        String lastname = "Mansour";
        String fullname =getFullName(firstname, lastname);
        System.out.println(fullname);

        sayHi();


        int hour = 11;
        int minute = 59;
        printTime(hour,minute);
    }
}
