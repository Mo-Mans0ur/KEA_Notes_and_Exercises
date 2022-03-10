package SecondSemester.Technology;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SqlTryOut {
    static ArrayList<String> movies = new ArrayList<String>();
    public static void main(String[] args) {

            File movies = new File("src/Resources/imdb-data.csv");
            String filename = "imdb-data";


      try {

        Scanner sc = new Scanner(movies);


        String moviesDetails = sc.nextLine();

        String[] stringsOfMovies = moviesDetails.split(";");

        String sql = "";

        for (String movie:stringsOfMovies) {
            sql = sql + movie + " varChar(255), \n";
        }

        String createTable = "CREATE TABLE " + filename + " (\n" + sql + ");";

        System.out.println(createTable);


        File ddl = new File("src/Resources/DDL.sql");

        FileWriter writer = new FileWriter(ddl, true);

        writer.write(createTable + "\n\n");

        writer.close();

        //DML
        try {
            Scanner scannerToDML = new Scanner(movies);
            scannerToDML.nextLine();

            while (scannerToDML.hasNextLine()) {

                String line = scannerToDML.nextLine();

                String[] value = line.split(";");

                String values = value[0] + "," + value[1] + "," + value[2] + "," + value[3] + "," + value[4] + "," + value[5];

                String insertInto = "INSERT INTO" + filename + "VALUES(" + values + ");";
                System.out.println(insertInto);

                File dml = new File("src/Resources/DML.sql");
                FileWriter dmlWriter = new FileWriter(dml,true);

                dmlWriter.write(insertInto + "\n");
                dmlWriter.close();
            }


        } catch (IOException e) {
            System.out.println("Nope");
            e.printStackTrace();
        }
      } catch (IOException e) {
          System.out.println("not found");
          e.printStackTrace();
      }

    }
}
