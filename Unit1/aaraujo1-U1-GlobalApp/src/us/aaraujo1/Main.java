package us.aaraujo1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author andregaraujo
 * @version 2018 0910 .1
 * <p>
 * This is the main driver class
 *
 * <p>
 * Unit #1 - Exceptions and Advanced File I/O
 * <p>
 * Create a program that reads the files: places.csv and stuff.csv.
 * The places file is the driver and the stuff file is the transaction file.
 * There are numerous ways to solve the following problem.
 * <p>
 * The program must include JavaDoc, Junit and be uploaded to GitHub.
 * Name this project: XXXXX-U1-GlobalApp, where “XXXXX” is your WCTC userid.
 * (Ex: Matt Green with an email of mgreen14@wctc.edu would name his project mgreen14-U1-GlobalApp.
 * <p>
 * Create a report that prints out each country and the number of cities listed in the places file and
 * the number of stuff listed in the stuff file.
 * For some countries,  the same "stuff" appears more than once for the same country.
 * For example, Argentina has two entries for twister.
 * Count those instances as 1 "stuff" item for that country.
 * That is, count the unique instances of "stuff" as if it was a catalog, not as if it was a warehouse inventory.
 * <p>
 * Upload compressed file with JavaDoc output.
 */
public class Main {

    private final static FileInput places = new FileInput("places.csv");
    private final static FileInput stuff = new FileInput("stuff.csv");

    public static void main(String[] args) {
        //variable to track the number of cities
        int cityCount;

        //variable to track the number of stuff
        int stuffCount;

        //Array to store unique countries
        //ArrayList<String> countries = new ArrayList<>();

        //String[] stuffArray;

        //Array to store unique stuff
        //ArrayList<String[]> stuffUnique = new ArrayList<>();

        //ArrayLists to hold file contents
        //ArrayList<String[]> placesArrayList = new ArrayList<>();
        //ArrayList<String[]> stuffArrayList = new ArrayList<>();


        //make array of places
        //makeArrayList(placesArrayList, places);
        ArrayList<String[]> placesArrayList = new ArrayList<>(places.fileToArrayList());
        //now in array, close file because no longer needed
        places.fileClose();

        //make array of stuff
        //makeArrayList(stuffArrayList, stuff);
        ArrayList<String[]> stuffArrayList = new ArrayList<>(stuff.fileToArrayList());

        //now in array, close file because no longer needed
        stuff.fileClose();

        /*--- create  list of unique countries ---*/

        //variable to check if unique
        //boolean exists = false;
/*
        //loop through array to see if array item already exists in other array
        for (int i = 0; i < placesArrayList.size(); i++) {
            String[] aPlacesArray = placesArrayList.get(i);
            for (String country : countries) {
                if (country.equals(aPlacesArray[0])) {
                    exists = true;
                }
            }
            if (!exists) {
                //it's unique so add to list
                countries.add(aPlacesArray[0]);
            } else {
                //it's a duplicate so don't add
                //but reset exists value
                exists = false;
            }

        }*/

        //object to look at list
        ListLooker c = new ListLooker();

        //Array to store unique countries
        ArrayList<String> countries = new ArrayList<>(c.getUniqueStrings(placesArrayList));

        //sort list
        Collections.sort(countries);

        //Array to store unique stuff
        ArrayList<String[]> stuffUnique = new ArrayList<>(c.getUniqueArrays(stuffArrayList));

        /*--- create list of unique stuff ---*/

        /*for (int i = 0; i < stuffArrayList.size(); i++) {
            stuffArray = stuffArrayList.get(i);
            for (int j = 0; j < stuffUnique.size(); j++) {
                if (Arrays.equals(stuffUnique.get(j), stuffArray)) {
                    exists = true;
                }
            }
            if (!exists) {
                //it's unique so add to list
                stuffUnique.add(stuffArray);
            } else {
                //it's a duplicate so don't add
                //but reset exists value
                exists = false;
            }
        }*/


        /*--- output ---*/
//        ListLooker c = new ListLooker();

        //format pattern
        String f = "%-22s%10s%10s\n";

        //header
        System.out.format(f,"Country","Cities","Stuff");
        System.out.format(f,"=======","======","=====");

        //loop for output
        for (int i = 0; i < countries.size(); i++) {
            cityCount = c.getStringCount(countries.get(i), placesArrayList);
            stuffCount = c.getStringCount(countries.get(i), stuffUnique);
            //System.out.format("%22s  %-2s %-2s\n", countries.get(i), cityCount, stuffCount);
            //System.out.format("%s\t%s\t%s\n", countries.get(i), cityCount, stuffCount);
            System.out.format(f, countries.get(i), cityCount, stuffCount);
        }
    }


    /*
     * A method to get the number of cities per country
     * @param country to look up
     * @param placesArray an array to look up countries
     * @return the number of cities in array
     */
    /*--- city count of unique countries ---*/
/*
    public static int getCityCount(String country, ArrayList<String[]> placesArray) {
        int cities = 0;
        boolean done = false;

        //loop through array
        do {
            for (int i = 0; i < placesArray.size(); i++) {
                if (placesArray.get(i)[0].compareTo(country) > 0) {
                    done = true;
                } else if (placesArray.get(i)[0].equals(country)) {
                    cities++;
                }
                if (i == placesArray.size() - 1) {
                    done = true;
                }
            }
        } while (!done);

        return cities;
    }
    */

    /*
     * Method to get the number of stuff per country
     * @param country to lookup
     * @param stuffArray arrayList of arrays of country and stuff
     * @return the number of stuff in array
     */
    /*
    public static int getStuffCount(String country, ArrayList<String[]> stuffArray) {
        int stuff = 0;
        boolean done = false;

        //loop through array
        do {
            for (int i = 0; i < stuffArray.size(); i++) {

                if (stuffArray.get(i)[0].compareTo(country) > 0) {
                    done = true;
                } else if (stuffArray.get(i)[0].equals(country)) {
                    stuff++;
                }



                if (i == stuffArray.size() - 1) {
                    done = true;
                }
            }
        } while (!done);

        return stuff;
    }
*/

    /*-- MOVED TO FileInput class because it is dependant on file input--/
    /*
     *Method to make an arrayList from a file
     * @param s an ArrayList
     * @param fi a file to read
     */
    /*
    public static void makeArrayList(ArrayList<String[]> s, FileInput fi) {
        //String variable for reading a line of text
        String line;

        //Array of Strings to capture input
        String[] fields;

        //make array of based on FileInput
        while ((line = fi.fileReadLine()) != null) {
            fields = line.split(",");
            s.add(fields);
        }

    }*/

}