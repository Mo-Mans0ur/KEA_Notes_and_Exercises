package ExamPreparation.FromTheBottom.ExamPreparationClasses;


public class ClassesObjectConstructor {

    public static void main(String[] args) {
        /*
        why have different classes?

        better structure in the code and not have one class with
        literally a billion lines of code

        Example

        if we want to make a school then we need students

        String studentName = "Cathrine Hansen";
        int age 23;
        int[] grades = {10, 4, 7, 7};

        alright we have a student, but. the problem is we have
        to make A LOT of students and this is why we have classes
        repetition isn't that great in code in the way that you
        write studentName1, StudentName2 ect. a billion times
        its sloppy.

        so imagine looking at an article it has a headline, author,
        category but in code its objectified like we give it a class
        then we give it Strings, ints or even booleans
        but here its Strings

        Public class Article {
            private String headline;
            private String author;
            private string category;
        }

        this represents a class in java if we continue with
        the student example then the class would look like this

        Public class Student {      <---- class
            private String name;    <---- attributes
            private int age;
            private int[] grades;
        }
        class = template (skabelon på dansk)
        object = form of the template

        if you think about a cookie cutter then the cookie cutter is the class
        and then the shape of it is the object when you have cut the cookie dough

        so when we have cut the dough then we have 3 cookies which has the "shape" / template
        of the cookie cutter = objects

        let's try the template part with cats

        it has a name.
        a mood.
        is it hungry?.
        and how much energy it has.

        and if we put it in a class

        class Cat {
        public String name;         <-- String attributes
        public int mood;            <-- int attributes
        public boolean isHungry;    <-- boolean attributes
        public int energy;          <-- int attributes

        public void meow() {        <-- you can put a method in a class
            System.out.println("meow");
          }
        }

        lets make a virtual cat

        we are actually making a new type like a Scanner or Random.

        we are creating a variable and giving it a name,
        name --> Cat cat = new Cat(); <-- on this side we       <--Object
        want a NEW object in this class

        so what we have done is we've defined what a cat is,
        and we've created a cat with those attributes.

        It's still a lot of code It's still sloppy but java has
        a method called a "constructor"

        a constructor is called when a new object has been made

        when the Cat() method is running it will print out
        "in constructor Method" at the top it depends on if you've
        said it in the constructor.



        what we want is the name of the cat we are creating is as the
        same as what we put in the constructor

        if we try to print out storms name like

        Cat storm = new Cat("Storm", 4, 47, true);
        System.out.println(storm.name);

        we will get "null" in the prompt to help we've got a
        new keyword: this. <-- referencing to the object that is created

        in the constructor we write this.name

        in the constructor if we write System.out.println(this.name);
        and in the main we write System.out.println(storm.name);

        it would be totally the same it references the new object (the new cat)

        and it's the same if we want to print out the mood we use this.mood inside
        the constructor, and we've done it with them all it will look like this

        this.name = name;
        this.mood = mood;
        this.energy = energy;
        this.ishungry = ishungry;

        so to sum up

        so
        constructor: is a method in the class and is called when
        a new object is created

        keyword this. : is referencing to the new object that has been
        created

        storm.name
        or
        this.name
        totally the same


        now when printing out something from a class we have to use
        toString method if we don't it will print out some random bullshit

        so we go in to our cat class and write

        public String toString(){
            return "cat{" +
                "name='" + name +'\'' +
                ", mood=" + mood +
                ", ishungry=" + ishungry +
                ", energy=" + energy + '}';
        }

        lets try it out in code
         */

        Cat storm = new Cat("Storm", 10, 100, false);
        System.out.println(storm.name);
        System.out.println(storm.mood);
        System.out.println(storm.energy);
        System.out.println(storm.ishungry);

        // or you can print it like this
        System.out.println(storm);

        Cat garfield = new Cat("Garfield", 5, 43, true);
        System.out.println(garfield.name);
        System.out.println(garfield.mood);
        System.out.println(garfield.energy);
        System.out.println(garfield.ishungry);




        //in coding you need to scale the coding down so this will
        //take a lot of code. use this instead

        System.out.println(garfield);


        //Exercises


        //Exercise 1
        Dog fido = new Dog("Fido", 19, 90, true);
        System.out.println(fido);

        Dog marcel = new Dog("Marcel", 2, 100, false);
        System.out.println(marcel.name);
        System.out.println(marcel.age);
        System.out.println(marcel.energy);
        System.out.println(marcel.ishungry);
        marcel.woof();


        //Exercise 1.1
        Car mercedes = new Car("Mercedes", 27000, "Atlas", 19);

        mercedes.start();
        mercedes.stop();
        mercedes.move();

        //Exercise 1.2
        Employee susan = new Employee("Susan","jensen",2340);
        System.out.println(susan);

        Employee timothy = new Employee("Timothy", "Andreasen", 5500);
        System.out.println(timothy);

        System.out.println(susan.getMonthlySalary());
        System.out.println(String.format("%.2f", timothy.getMonthlySalary()));

        //Exercise 4


    }
}
