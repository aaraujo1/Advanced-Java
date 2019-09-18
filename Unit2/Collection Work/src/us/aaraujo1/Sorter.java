package us.aaraujo1;

/**
 * Created by andregaraujo on 9/12/19
 * @author andregaraujo
 * @version 2018 0912 .1
 */

import java.util.*;

public class Sorter {
    private TreeMap<String, Integer> treeMap;
    private List<Map.Entry<String, Integer>> list;
    private int counter = 0;

    /*-- SETTERS --*/

    /**
     * setter for treeMap
     * @param m a Map
     */
    public void setTreeMap(Map<String, Integer> m){
        treeMap = new TreeMap<>(m);
    }

    /**
     * setter for list
     * @param tm a TreeMap
     */
    public void setList(TreeMap<String, Integer> tm){
        list = new LinkedList<>(tm.entrySet());
    }

    /*-- GETTERS --*/

    /**
     * getter for treeMap
     * @return treeMap
     */
    public TreeMap<String, Integer> getTreeMap(){
        return treeMap;
    }

    /**
     * getter for list
     * @return list
     */
    public List<Map.Entry<String, Integer>> getList(){
        return list;
    }

    /*-------------------------------------------------------------------------*/
    /*--- List the top 10 most used words and how many times they were used ---*/
    /*-------------------------------------------------------------------------*/

    //SOURCE: https://www.mkyong.com/java/how-to-sort-a-map-in-java/
    // 1. Convert Map to List of Map
    // 2. Sort list with Collections.sort(), provide a custom Comparator
    //    Try switch the o1 o2 position for a different order

    /*-- SORT METHOD --*/
    /**
     * Method to sort a map by value instead of key value
     * SOURCE: https://www.mkyong.com/java/how-to-sort-a-map-in-java/
     * 1. Convert Map to List of Map
     * 2. Sort list with Collections.sort(), provide a custom Comparator
     *      Try switch the o1 o2 position for a different order
     *
     * Instead of returning a new List object, I'm returning the the defined list object
     * @return list, sorted  by value
     */
    public List<Map.Entry<String, Integer>> sortListByValue() {
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                //switch o2 and o1 for descending order
                //return (o1.getValue()).compareTo(o2.getValue());
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        return list;
    }

    /*-- OUTPUT METHOD --*/
    /**
     * Void method to output 10 largest integer values in the sorted list
     */
    public void outputList(){
        //header output
        System.out.println("Most used words\n--------------------");

        //output top ten words
        for (int i = 0; i < 10; i++) {
            //System.out.println(i + 1 + ") " + list.get(i).getKey() + ": " + list.get(i).getValue() + " times");
            System.out.println(i + 1 + ") " + list.get(i).getKey() + ": " + list.get(i).getValue() + " times");
        }

        //footer output
        System.out.println("--------------------\n");
    }


    /*--------------------------------------------------------*/
    /*--- List the number of words that are only used once ---*/
    /*--------------------------------------------------------*/
    /**
     * Void method to output keys where the integer value is 1
     * arranged in 5 columns
     */
    public void outputTreeMap(){
        //header output
        System.out.println("Words only used once\n--------------------");

        //output words in 5 columns
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() == 1) {
                if ((counter % 5) == 0) {
                    System.out.println();
                    System.out.printf("%-22s", entry.getKey());
                } else {
                    System.out.printf("%-22s", entry.getKey());
                }
                counter++;
            }
        }

        //footer output
        System.out.println("\n--------------------\n" + counter + " words");
    }

}
