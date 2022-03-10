package SecondSemester.Programming;

import java.io.*;
import java.util.*;

public class MobyDickReader {

    public static void main(String[] args) throws FileNotFoundException {
        File moby = new File("src/Resources/MobyDick");  // creating and finding the path to the MobyDick file

        ArrayList<String> arrayListOFWords = new ArrayList<String>();       //puts all the word inside an arraylist

        HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();

        Scanner sc = new Scanner(moby); // scanning the file called moby
        int i = 0;
        while (sc.hasNext()) {
            String str = sc.next();

            arrayListOFWords.add(str.toLowerCase(Locale.ROOT));

        }

        Iterator itr = arrayListOFWords.iterator();     // Iterator is like a loop it takes the last element in the collection

        while (itr.hasNext()) {
            if (itr.equals("." + "," + "!" + "?" + "´")) {
                arrayListOFWords.remove("." + "," + "!" + "?" + "´"); // unique words = 30669

        }
            i++;

            listOfWords.put((String) itr.next(), i);



        }

        Set<Object> uniqueWords = new HashSet<Object>(listOfWords.values());

        System.out.println("the number of unique words: " + uniqueWords.size()); // unique words = 32556

        //user search occurrence of word













    /*

        //something else

        //ArrayList<Integer> arrayListOfInts =new ArrayList<>();
        LinkedList<Integer> linkedListOfInts = new LinkedList<>();
        HashSet<Integer> hashSetOfInts = new HashSet<>();

        Random r = new Random();
        for (int j = 0; j < 10; j++) {
         //   arrayListOfInts.add(r.nextInt(1000));
            linkedListOfInts.add(r.nextInt(1000));
            hashSetOfInts.add(r.nextInt(1000));
        }

        long time1 = System.nanoTime();
        //arrayListOfInts.contains(7);
        long time2 = System.nanoTime();
        long delta = time1 + time2;
        System.out.println("it takes " + delta/1000 + "to find that");



        //-------------------------------------------------------------



        ArrayList<Integer> arrayListOfInts = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            arrayListOfInts.add(r.nextInt(100));
        }
        System.out.println(arrayListOfInts);
        Collections.sort(arrayListOfInts);
        System.out.println(arrayListOfInts);

        ArrayList<String> arrayListOfStrings= new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            arrayListOfStrings.add("Spain" + 1);
        }

        arrayListOfStrings.add("denmark");
        arrayListOfStrings.add("finland");
        System.out.println(arrayListOfStrings);
        Collections.sort(arrayListOfStrings);
        System.out.println(arrayListOfStrings);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Spain",23,84,43.2f));
        countries.add(new Country("Russia",75,65,54.43f));
        countries.add(new Country("Lebanon",32,34,96.23f));
        countries.add(new Country("America",12,23,12.45f));
        countries.add(new Country("Brazil",67,76,32.46f));

         countries.sort(Country::compareTo);

     */
    }
}
