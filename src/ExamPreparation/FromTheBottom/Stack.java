package ExamPreparation.FromTheBottom;

public class Stack {
    public static void main(String[] args) {
        //Stack
        /*
           it's an abstract data type (ADT)
           a stack is basically a way to store information

            Top
            ____________
           |     5      |   <--- Stack Pointer
           |------------|
           |     4      |
           |------------|
           |     3      |
           |------------|
           |     2      |
           |------------|
           |     1      |
           |____________|
            Bottom

            this is what a stack diagram looks like

            we've got 5 different item or "Node" and each node
            has some sort of data in it

            which is stacked

            the top stack is being pointed by a "stack pointer"

            now we have 2 main functions with stack

            1. push: which adds another node to the top
            2. pop: which removes a node from the top

            We also call it LIFO: Last in First out

         */
        //Pseudocode Push
        /*

            alright lets say we've written our Push and Pop functions

            and we want to Push(1) to a stack

            now we don't have a stack to start with

            Null        <--- stack pointer

            so when we Push(1) the pointer will be on the node 1

             ___________
            |     1     |       <--- stack pointer
            |-----------|

            now lets say we want to Push(3) to the stack

             ___________
            |     3     |       <--- Stack pointer
            |___________|
            |     1     |
            |-----------|

            when we push a node to the stack it will be the top one
            and the stack pointer will move with the last pushed

            so if we Push(5) the Stack pointer will on node 5

             ___________
            |     5     |       <--- Stack pointer
            |___________|
            |     3     |
            |___________|
            |     1     |
            |-----------|
         */
        //Pseudocode Pop
        /*
        now if we want Pop the stack it will remove the last one
        pushed in this case it's the 5



             ___________
            |     3     |       <--- Stack pointer
            |___________|
            |     1     |
            |-----------|

        and it will be put somewhere depending on how you have written
        your Pop function

        ect.

         */


    }
}
