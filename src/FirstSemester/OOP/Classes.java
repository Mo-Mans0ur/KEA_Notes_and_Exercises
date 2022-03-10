package FirstSemester.OOP;

//import ExamPreparation.FromTheBottom.ExamPreparationClasses.Cat;

public class Classes {
    public static void main(String[] args) {

        /*
        why classes?

        to get better structure in the code we are making

        let's take an example first with a student

        String studentName = "Cathrine Hansen";
        int age = 23;
        int[] grades = {10, 4, 7, 7};


        that is fine, but we need more students and that is the
        problem we have to code A. LOT. OF. STUDENTS.

        repetition isn't that great in code in that way, that you don't
        write studentName1, studentName2 ect. all the way to 30 or more
        its sloppy

        but fear not

        it will work out

        imagine looking at an article. it has a headline, author, category
        but objectified in code like we give it a class
        then we can give it strings, ints or even booleans
        but in this case its strings

        public class Article {
            private String headline;
            private String author;
            private String category;
       }

        this is how we represent a class in java if we take the example
        with students we would do it this way

        Public class Student{  <---- class
            private String name;    <---- attributes
            private int age;
            private int[] grades;
       }
        class = template (skabelon på dansk)
        object = form of the template


        let's take a look at the template (skabelon) part
        we have an example with cats... weird right?. I know

        it has a name a mood is it hungry or not and how much energy it has....
        ...feels like we are going to use it with the Tamagotchi project

        let's try it in a class


     class Cat {
        public String name; <-- attributes
        public int mood;
        public boolean isHungry;
        public int energy;

        public void meow() {                <-- you can put a method in a class
            System.out.println("meow");
            }
        }

        <---- try it in a new class

        let's make a cat (because that doesn't sound weird right?)

        we are actually making a new type. like scanner or random

        this we know, we are creating a variable and giving it a name --> Cat cat = new Cat(); <-- on this side we
        want a NEW object in this class


        so what we've done in the class is we have defined what a cat is
        and here we've created a cat with those attributes

        but this is still sloppy we still have to write a lot of code
        but that is why we have what we call "a Constructor"

        a constructor is called when a new object has been made

        when the method Cat() is running
        it will print out "in constructor method" at the top
        it depends on if you've said it in the constructor


         Cat kenzo = new Cat();
        System.out.println(kenzo);
        kenzo.name = "Kenzo";
        kenzo.mood = 10;
        kenzo.energy = 100;
        kenzo.ishungry = false;

        System.out.println("Name: " + kenzo.name);
        System.out.println("Mood: " + kenzo.mood);
        System.out.println("Energy: " + kenzo.energy);
        System.out.println("Hunger: " + kenzo.ishungry);
        kenzo.meow();


        let's make a new Cat

        we haven't done much only taking a parameter (the name) at first

        what we want is the name of the cat we are creating is as the
        same as what we put in the constructor

        if we try to print out storms name like

        Cat storm = new Cat("Storm",4,47,true);
        System.out.println(storm.name);

        we will get "null" in the prompt to help we've got a
        new keyword: this. <-- referencing to the object that is created

        in the constructor we write this.name

        in the constructor if we write System.out.println(this.name);
        and in the main we write System.out.println(storm.name);

        it would be totally the same it references the new object, the new cat

        now if we would print out the mood of Storm like

       Cat storm = new Cat("Storm",4,47,true);
       System.out.println(storm.name);
       System.out.println(storm.mood);

       it will say "0" when the mood is actually 4
       we fix it by doing the same as in name

       this.mood = mood;

       we can pretty much do it with all of them, so it looks like

        this.name = name;
        this.mood = mood;
        this.energy = energy;
        this.ishungry = ishungry;


        so
        constructor: is a method in the class and is called when
        a new object is created

        keyword this. : is referencing to the new object that has been
        created

        storm.name
        or
        this.name
        totally the same


        .toString method : if we wanted to print out storm as
        System.out.println(storm);

        it would give us some random things

        to fix this we have to go in to our Cat class and write a toString method

        public String toString(){
            return "cat{" +
                "name='" + name +'\'' +
                ", mood=" + mood +
                ", ishungry=" + ishungry +
                ", energy=" + energy + '}';
        }

        this is just a different way to write all that below

         */
        /*
        Cat storm = new Cat("Storm",4,47,true);
        System.out.println(storm.name);
        System.out.println(storm.mood);
        System.out.println(storm.energy);
        System.out.println(storm.ishungry);


        // now we have 2 cats

        Cat garfield = new Cat("garfield",5,42,true);
        System.out.println(garfield.name);
        System.out.println(garfield.mood);
        System.out.println(garfield.energy);
        System.out.println(garfield.ishungry);


        //the different way method in Cat Class

        System.out.println(storm);
        */
        //that all folks
    }
}
