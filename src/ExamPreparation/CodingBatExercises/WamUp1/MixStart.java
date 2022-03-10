package ExamPreparation.CodingBatExercises.WamUp1;

import javax.imageio.stream.ImageInputStream;

public class MixStart {
    /*
    Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.
     */

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MixStart mixStartClass = new MixStart();

        System.out.println(mixStartClass.mixStart("pix Snacks")); //true
        System.out.println(mixStartClass.mixStart("piz Snacks")); //false
    }
}
