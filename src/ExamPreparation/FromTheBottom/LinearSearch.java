package ExamPreparation.FromTheBottom;

import ExamPreparation.FromTheBottom.ExamPreparationClasses.User;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {//19.10.21//
        //Linear Search
        /*
        Linear Search is an algorithm to find an element in an array
        an algorithm recall is a step-by-step guide for completing
        a task

        in pseudocode:
        repeat, starting at the first element
            if the first element is what we are looking for (the target), stop.
            otherwise, move to the next element.

        example:
        the target = 9

        [11, 23, 8, 14, 30, 9, 6, 17, 22, 28, 25, 15, 7, 10, 19]

        so we keep going until we reach the 9

        but what if the target = 50

        would it still work?
        well sure it will just keep going but never find the target

        worst-case scenario:
        we have to look through the entire array for the element
        it could be the last element in the array or the element
        doesn't exist.

        best-case scenario:
        the first element is the target and we immediately
         */


        //Exercise LinearSearch
        ArrayList<User> userArrayList = new ArrayList<User>();

        User firstUser = new User("ActualPhant0m","12345");
        User secondUser = new User("FlowerPower","ShineOnMe");
        User thirdUser = new User("CurtainMan","CurtainsForDays");
        User fourthUser = new User("JaywalkingJacket","JayWalkingIsAwesome");
        User fifthUser = new User("BananaHammock","Bananas123");
        User sixthUser = new User("KenAdams","reginaPhelangy");
        User seventhUser = new User("DeadParents","ImBatman");
        User eighthUser = new User("PeePeePooPoo","POOPBackwardsIsPOOP");
        User ninthUser = new User("CookieMonster","COOKIES!");
        User tenthUser = new User("Markiplier","BumBum");


        userArrayList.add(firstUser);
        userArrayList.add(secondUser);
        userArrayList.add(thirdUser);
        userArrayList.add(fourthUser);
        userArrayList.add(fifthUser);
        userArrayList.add(sixthUser);
        userArrayList.add(seventhUser);
        userArrayList.add(eighthUser);
        userArrayList.add(ninthUser);
        userArrayList.add(tenthUser);

        System.out.println(findUser(userArrayList,"ShineOnMe"));

    }

    public static boolean findUser(ArrayList<User> arrayListOfUsers, String inputByUser) {
        for (User user: arrayListOfUsers) {
            if (user.getUserName() == inputByUser) {
                return true;
            }
        }
        return false;
    }

    //else it works

}
