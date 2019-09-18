package us.aaraujo1;

import java.util.*;

/**
 * Created by andregaraujo on 9/12/19
 * @author andregaraujo
 * @version 2018 0912 .1
 * <p>
 * The following In-Class Activity was completed and is visible in GitHub in GitHub in a repository called Collections.
 * <p>
 * For full credit, the project must include JavaDoc comments and JUnit tests for non-void methods.
 * <p>
 * 1. Download “Collection Work” from Blackboard and open in IntelliJ.
 * <p>
 * 2. List the top 10 most used words and how many times they were used.
 * <p>
 * 3. List the number of words that are only used once.
 */
public class Main {

    private final static FileInput indata = new FileInput("the_book.csv");

    //adding file outputs to ensure accuracy
    private final static FileOutput outdata = new FileOutput("the_book_output.csv");
    private final static FileOutput outdata_tree = new FileOutput("the_book_output_tree.csv");
    private final static FileOutput outdata_text = new FileOutput("the_book_output_text.txt");

    private final static Map<String, Integer> map = new HashMap<>();

    private final static Sorter s = new Sorter();


    public static void main(String[] args) {
        String line;
        String[] words;
        Object wordFound;
        //   String[] fields;

        while ((line = indata.fileReadLine()) != null) {
            line = line.replace(",", "").replace(".", "")
                    .replace(";", "").replace(":", "")
                    .replace("'", "").replace("\"", "")
                    .replace("-", "").replace("!", "")
                    .replace("#", "").replace("(", "")
                    .replace(")", "").replace("?", "")
                    .replace("_", "").replace("?", "")
                    .toLowerCase().trim();
            //to see what has been replaced
            outdata_text.fileWrite(line);
            words = line.split(" ");
            for (String s : words) {
                //this conditional ignores the empty string, and does not put it in the map
                if (s.length() > 0) {
                    wordFound = map.get(s);
                    if (wordFound != "") {
                        if (wordFound == null) {
                            map.put(s, new Integer(1));
                        } else {
                            map.put(s, map.get(s) + 1);
                        }
                    }
                }
            }

            //outputs
            /*
            removing output
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            */
        }
        //close input file
        indata.fileClose();

        //output HashMap as a CSV to open in Spreadsheet application to calculate accurate data
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            outdata.fileWrite(entry.getKey() + "," + entry.getValue());
        }

        //done outputting file, so close
        outdata.fileClose();

        //Convert Map to TreeMap to sort
        s.setTreeMap(map);

        //output TreeMap as a CSV to open in Spreadsheet application to calculate accurate data
        for (Map.Entry<String, Integer> entry : s.getTreeMap().entrySet()) {
            outdata_tree.fileWrite(entry.getKey() + "," + entry.getValue());
        }

        //done outputting file, so close
        outdata_tree.fileClose();


        /*--- List the top 10 most used words and how many times they were used ---*/

        //Use TreeMap to create List
        s.setList(s.getTreeMap());

        //Sort List by Value
        s.sortListByValue();

        //Output List
        s.outputList();


        /*--- List the number of words that are only used once ---*/

        s.outputTreeMap();

    }

}