package ExamPreparation.FromTheBottom.ExamPreparationClasses;

public class Interfaces {
    public static void main(String[] args) {
        //Interfaces
        /*
        is a form of a contract that chooses how the classes
        looks more specific: what kind of methods a class have to
        implement.

        think of it like a thing Used to declare a special type of
        class that only contains abstract methods

        imagine a person, car or even a ball have to move to a
        some place now imagine it's in a game

        it has to move forward and backwards so on so forth
        when you have all that in place, and you know how the
        person or thing looks we have to draw it

        that is when we have to make an interface, and we
        call this one GameObject
------------------------------------------------------------------
        this is how we write it:

        interface GameObject {  <-- name of interface
            void move();        <-- methods which the object has to do, it doesn't return anything
             boolean draw(Canvas canvas);   <-- a boolean which has a type that is Canvas and a name that is canvas
           }
------------------------------------------------------------------
        so when we make a new class which is called player or
        something it HAS to have 2 methods the first one
        has to be called move, and it can't return anything
        the second method has to be called draw, and it has to
        return a boolean that has a parameter type of Canvas
        which is called canvas too

        let's try making it
------------------------------------------------------------------
        when you've made the Class Interface in a new window
        and written the code above we make a new normal class
        named player

        and begin to make drawlines and shapes and stuff...

        let's try make it with a car class

        you can make the move method multiple times like
        player1.move();
        player1.move();
        player1.move();
        player1.move();
        or
        car1.move();
        car1.move();
        car1.move();
        car1.move();

        it won't tell you anything

-------------------------------------------------------------------
        fast way to implement and import the methods is to
        hover over the red line and when the square pops up
        you press import in the lower left corner
-------------------------------------------------------------------
        this is our main Class
         */

        Player player1 = new Player();
        player1.move();

        CarInterfaceEx car1 = new CarInterfaceEx();
        car1.move();


        //Abstract Classes

        Elephant marvinTheElephant = new Elephant();
        marvinTheElephant.animalSound();
        marvinTheElephant.sleep();

        //genopfriskning
    }
}
