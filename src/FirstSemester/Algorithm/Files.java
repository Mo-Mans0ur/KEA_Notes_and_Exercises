package FirstSemester.Algorithm;

public class Files {
    public static void main(String[] args) {
        //introduction
        /*
        computer file.
        --------------

        a computer file is resource to the computer for recording
        data in a computer storage device

        just as words can be written to paper, so can information
        be written to a computer file

        Persistence.
        ------------

        in computer science persistence is when the characteristics
        "outlives" the process that created it

        you store the data in a computer data storage then programs
        have to transfer data to and from storage devices


        or said in more english: when you close a file the things
        you have written is still there no matter what

        like oneNote when you have written a note and then close
        the window the note is still there.


         */

        //working with files
        /*
        this is going to be a little difficult, but we will manage

        so the first thing you do is go to the project menu

        then right-click the project and make a new directory

        call it whatever you want "resources" is great

        pull what ever file you want inside the resource directory

        when you have the file the thing you want to do ... don't ask why
        is to send it to main and print it out


        so just like Scanner, random and arraylist we have to do this

        File nameTheFile = new File(Copied path/reference)

        when you choose that you'll get som options

        absolute path <---- says itself: the file from the root
        file name <---- says itself
        path from content root <---- relative path (this is the one to use)

        next thing is to make a scanner but a little different

        we are used to Scanner scanner = new Scanner(System.in)

        this is the system we give input too

        now we have to use is Scanner scanner = new Scanner(nameTheFile)

        use the try catch like

           try {
             Scanner scanner = new Scanner(nameTheFile)
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

        this is an exception we have to handle when we are working
        with files

        when that's in place we want to print out our file

        and we do that with a while loop like this


            try {
             Scanner scanner = new Scanner(nameTheFile)
             while(scanner.hasNextLine()){
                system.out.println(scanner.nextLine());

             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

       as long as the scanner gets input from the file it loops,
       and we print out

       and when that is done you have a file you can work with

       now we try something with the file

        try {
             int count = 0;
             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                count++;
                system.out.println(scanner.nextLine());

             }
             System.out.println("Number of lines" + count);
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

        the thing we have done here is that it counts how many
        the file has

        this is basically how we work with files

         */

        //schematic data (example in video .csv file) //Disclaimer there's a lot of reading
        /*
        first a .csv file is like working with a database

        on every line in a csv file there is an entity in the data

        in this example there's talk about countries

        5;Belgien;11431406
        1;Danmark;5831000
        3;Tyskland;83000000
        4;Polen;37425600
        2;Sverige;10350220

        so what is happening here is:  id ---> 5;Belgien;11431406 <--- population  Belgien = name of the country

        so we take the old one

        File nameTheFile = new File(Copied path/reference)

        try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                system.out.println(scanner.nextLine());

             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }
        ----------------------------------------------------------
        the thing now is to map the datavalues to an object

        to make this we have to make a class with all this first

     public Class Country {
        private int id;
        private String country;
        private int population;


        public Country(int id, String country, int population) {
            this.id = id;
            this.id = country;
            this.id = population;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;

        }

        public int getCountry() {
            return country;
        }

        public int settCountry() {
            this.country = country;
        }
     }


        so when this is done we can continue with the old stuff


        try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

        new keyword: .Split

        split = makes a string into more strings with the help of a symbol
        in this case we have this (;)



        try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                line.split(regex: ";");

             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }
        so when this runs and in this case it will make one string into 3,
        but it returns those 3 strings into an array of string

        so we have to change it a bit

         try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");

             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

          now if we want to demonstrate what happens we print it out

          try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");
                System.out.print(arrayOfStrings[1]);
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

           now what happens is it takes the country names and prints it out because

           5; = 0  Belgien; = 1  11431406 = 2

           so the 1 string splits up to 3

           1 with id's
           2 with country names
           3 with populations

         -------------------------------------------------------------------------------
         now we can map it, to do that, we do this


         try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");
                int countryId = arrayOfStrings[0];
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

           now we have a problem because we have provided an int to a String array
           and how we deal with files is with strings

           but there's an int inside the string the way we fix this is like this

            try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");
                int countryId = Integer.parseInt(arrayOfStrings[0]);
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

           now we add the country names, and we don't need any parsing to do that
           because it's a String

           try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");
                int countryId = Integer.parseInt(arrayOfStrings[0]);
                String country = arrayOfStrings[1];
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

           and last but not least the population but its like the countryId its an int
           so we have to parse it


            try {

             Scanner scanner = new Scanner(nameTheFile)

             while(scanner.hasNextLine()){
                String line = Scanner.nextLine();
                String[] arrayOfStrings = line.split(regex: ";");
                int countryId = Integer.parseInt(arrayOfStrings[0]);
                String country = arrayOfStrings[1];
                int population = Integer.parseInt(arrayOfString[2]);
             }
           } catch (FileNotFoundException e) {
                system.out.println("File could not be found");
                e.printStackTrace();
           }

           now we can make a new object with

           country currentCountry = new Country(countryId,country,population);

           and we can add the countries in into arrayList

           ArrayList<String> allCountries = new ArrayList<String>(countryId,country,population);

           and we add it with

           allCountries.add(currentCountry);

           and now we can see how many there is in the arraylist

            System.out.println(allCountries.size));

           and to get the country

           System.out.println(allCountries.get(0).getCountry());

           that's all folks

         */

    }
}
