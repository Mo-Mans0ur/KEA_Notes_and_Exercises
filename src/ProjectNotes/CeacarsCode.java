package ProjectNotes;

import java.util.Scanner;

public class CeacarsCode {
    public static void main(String[] args) {

        /*
        Number Cypher

        Take words and converts them to numbers, and they are equal
        to the order of the alphabet

        abc -> 1;2;3
        ben -> 2;5;14
        hello -> 8;5;12;12;15

         */

        //Encoder

        System.out.println(characterToIndex('a')); //1

        //Decoder
        System.out.println(indexToCharacter(1)); //a

        //ceasars Encoder
        System.out.println(ceacarsEncoder('g')); //j

        //ceacars Decoder
        System.out.println(ceacarsDecoder('x')); //t



    }

    public static int characterToIndex(char character) {
        String alphabet1 = "abcdefghijklmnopqerstuvwyz";
        int charAtIndex = alphabet1.indexOf(character + 1);

        return charAtIndex;
    }
    // note that the one above is different from the one below
    public static char indexToCharacter(int index) {
        String alphabet2 = "abcdefghijklmnopqerstuvwxyz";
        char indexToChar = alphabet2.charAt(index - 1);

        return indexToChar;
    }

    /*
    now we have to make Ceacars code it takes the alphabet
    and pushes it 3 steps to the right

    imagine the alphabet abcdefghijklmnopqerstuvwxyz
    then a becomes d
    and b becomes e

    or l becomes p
    and x becomes a

    lets try it in code
     */
    // with the encoder we plus (+) 3
    public static char ceacarsEncoder(char nonCodedChar) {
        int character = characterToIndex(nonCodedChar);
        int charIndexplus3 = character + 3;

        char encodedCode = indexToCharacter(charIndexplus3);

        return encodedCode;
    }

    // in the Decoder we minus (-) 3
    public static char ceacarsDecoder(char decodedChar) {
        int character2 = characterToIndex(decodedChar);
        int chaIndexMinus3 = character2 - 3;

        char decodedCode = indexToCharacter(chaIndexMinus3);

        return decodedCode;
    }

    // Veni, Vedi, Vici : (i came, i saw , I conquered)
}
