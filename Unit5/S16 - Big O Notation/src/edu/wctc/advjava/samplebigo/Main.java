package edu.wctc.advjava.samplebigo;

import java.util.ArrayList;


/**
 * 1. Download Big O Notation from Blackboard.
 * 2. In the Main class of the samplebigo package,
 *      add a main() method and other private methods to implement the algorithms in the Rob Bell article.
 *      Call those private methods from the Main method,
 *      using different numbers or input sizes to compare the growth of the functions.
 * 3. Complete the questions in the Weekly Challenge.
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        strings.add("seven");
        strings.add("eight");
        strings.add("nine");
        strings.add("ten");

        long reference=System.nanoTime();

        //String s = firstElement(strings);
        //printElements(strings);
        //boolean b = containsDuplicate(strings);
        int f = fibonacci(10000);

        long finishm=System.nanoTime();
        System.out.println(( (double)(finishm-reference) )/1000000000.0 + " Nano Seconds");


    }

    /**
     * O(1)
     *
     * O(1) describes an algorithm that will always execute in the same time (or space) regardless of the size of the input data set.
     * @param elements
     * @return
     */
    private static String firstElement(ArrayList<String> elements) {
        return elements.get(0);
    }

    /**
     * O(N)
     *
     * O(N) describes an algorithm whose performance will grow linearly and in direct proportion to the size of the input data set.
     * The example below also demonstrates how Big O favours the worst-case performance scenario;
     * a matching string could be found during any iteration of the for loop and the function would return early,
     * but Big O notation will always assume the upper limit where the algorithm will perform the maximum number of iterations.
     *
     * @param elements

     * @return
     */

    private static void printElements(ArrayList<String> elements) {
        for (String s : elements)
            System.out.println(s);
    }

    /**
     * O(N2)
     *
     * O(N2) represents an algorithm whose performance is directly proportional to the square of the size of the input data set.
     * This is common with algorithms that involve nested iterations over the data set.
     * Deeper nested iterations will result in O(N3), O(N4) etc.
     * @param elements
     * @return
     */
    private static boolean containsDuplicate(ArrayList<String> elements) {
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if (i == j) continue;

                if(elements.get(i).equals(elements.get(j))) return true;
            }
        }

        return false;
    }

    /**
     * O(2N)
     *
     * O(2N) denotes an algorithm whose growth doubles with each additon to the input data set.
     * The growth curve of an O(2N) function is exponential - starting off very shallow, then rising meteorically.
     * An example of an O(2N) function is the recursive calculation of Fibonacci numbers:
     * @param number
     * @return
     */
    private static int fibonacci(int number) {
        if (number <= 1) return number;

        return fibonacci(number - 2) + fibonacci(number - 1);
    }



}
