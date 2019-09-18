package us.aaraujo1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class is to do methods on a list
 */
public class ListLooker {


    /**
     * A method to get the number of a string in array (a column)
     *
     * @param s a string to look up
     * @param a an array to look up string
     * @return the number of cities in array
     */

    public static int getStringCount(String s, ArrayList<String[]> a) {
        int counter = 0;
        boolean done = false;

        //loop through array
        do {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i)[0].compareTo(s) > 0) {
                    done = true;
                } else if (a.get(i)[0].equals(s)) {
                    counter++;
                }
                if (i == a.size() - 1) {
                    done = true;
                }
            }
        } while (!done);

        return counter;
    }

    /*--- create  list of unique Strings ---*/

    /**
     * A method to look at an arrayList, and return an array of only the unique instances of the first element
     * @param a an ArrayList to look at
     * @return an array of only the unique instances of the first element
     */
    public static ArrayList<String> getUniqueStrings(ArrayList<String[]> a) {
        ArrayList<String> uniqueArray = new ArrayList<>();

        //variable to check if String is unique
        boolean exists = false;

        //loop through array to see if array item already exists in other unique array
        for (int i = 0; i < a.size(); i++) {
            String[] sArray = a.get(i);
            for (String country : uniqueArray) {
                if (country.equals(sArray[0])) {
                    exists = true;
                }
            }
            if (!exists) {
                //it's unique so add to list
                uniqueArray.add(sArray[0]);
            } else {
                //it's a duplicate so don't add
                //but reset exists value
                exists = false;
            }
        }
        return uniqueArray;
    }

    /*--- create list of unique stuff ---*/

    /**
     * A method to look at an arrayList, and return an ArrayList of only the unique instances as arrays
     * @param a an ArrayList to look at
     * @return an ArrayList of only the unique instances as arrays
     */
    public static ArrayList<String[]> getUniqueArrays(ArrayList<String[]> a) {
        ArrayList<String[]> uniqueArray = new ArrayList<>();

        //variable to check if String is unique
        boolean exists = false;

        //array
        //String[] stuffArray;

        for (int i = 0; i < a.size(); i++) {
            String[] sArray = a.get(i);
            for (int j = 0; j < uniqueArray.size(); j++) {
                if (Arrays.equals(uniqueArray.get(j), sArray)) {
                    exists = true;
                }
            }
            if (!exists) {
                //it's unique so add to list
                uniqueArray.add(sArray);
            } else {
                //it's a duplicate so don't add
                //but reset exists value
                exists = false;
            }
        }
        return uniqueArray;
    }

}
