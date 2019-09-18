package us.andrearaujo;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by andrearaujo on 9/5/18
 *
 * @author andregaraujo
 * @version 2018 0905 .1
 * <p>
 * This is the main driver class
 * It includes methods to:
 * get an account's purchase details
 * get an account's purchase details
 * and get an account's average movie rating
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private final static FileInput cardAccts = new FileInput("movie_cards.csv");
    private final static FileInput cardPurchases = new FileInput("movie_purchases.csv");
    private final static FileInput cardRatings = new FileInput("movie_rating.csv");
    //private static Scanner keyboard = new Scanner(System.in);

    //output results from part 1
    private final static FileOutput movieRatings = new FileOutput("movie_ratings_averages.csv");

    //output results from ratings count
    private final static FileOutput movieRatingsFrequency = new FileOutput("movie_ratings_frequency.txt");

    public static void main(String[] args) {
        String line;
        String[] fields;
        int[] nums = new int[2];
        int[] rate = new int[2];

        //add array list to read files to get accurate numbers
        ArrayList<String[]> accounts = new ArrayList<>();
        ArrayList<String[]> purchases = new ArrayList<>();
        ArrayList<String[]> ratings = new ArrayList<>();


        double avgRating = 0;
        //System.out.format("%8s  %-18s %6s %6s   %6s %14s\n", "Account", "Name", "Movies", "Points", "Movies Rated", "Avg. Rating");


        /*while ((line = cardAccts.fileReadLine()) != null) {
            fields = line.split(",");
            findPurchases(fields[0], nums);
            findRatings(fields[0], rating);
            avgRating = findAverageRatings(rating[0],rating[1]);
            System.out.format("00%6s  %-18s  %2d   %4d %10s %18.2f \n",fields[0],fields[1], nums[0], nums[1], rating[1], avgRating);
        }*/

        /*--- NEW WAY TO GET ACCURATE NUMBERS ---*/

        //first, make array of accounts
        while ((line = cardAccts.fileReadLine()) != null) {
            fields = line.split(",");
            accounts.add(fields);
        }
        //second, make array of purchases
        while ((line = cardPurchases.fileReadLine()) != null) {
            fields = line.split(",");
            purchases.add(fields);
        }
        //third, make array of ratings
        while ((line = cardRatings.fileReadLine()) != null) {
            fields = line.split(",");
            ratings.add(fields);
        }
        cardAccts.fileClose();
        cardPurchases.fileClose();
        cardRatings.fileClose();


        //then a for loop
        //for (int i = 0; i <= accounts.size(); i++) {
        for (int i = 0; i < accounts.size(); i++) {
            findPurchases(accounts.get(i)[0], nums, purchases);
            findRatings(accounts.get(i)[0], rate, ratings);
            avgRating = findAverageRatings(rate[0], rate[1]);
            //System.out.format("00%6s  %-18s  %2d   %4d %10s %18.2f \n", accounts.get(i)[0], accounts.get(i)[1], nums[0], nums[1], rate[1], avgRating);

            //this includes total number of movies rated
            //String outputString = String.format("00%s,%s,%d,%d,%s,%.2f", accounts.get(i)[0], accounts.get(i)[1], nums[0], nums[1], rate[1], avgRating);

            //output movie ratings result
            String outputString = String.format("00%s,%s,%d,%d,%.2f", accounts.get(i)[0], accounts.get(i)[1], nums[0], nums[1], avgRating);
            movieRatings.fileWrite(outputString);
        }
        //close movie ratings file
        movieRatings.fileClose();

        //create array of ratings
        ArrayList<Integer> ratingsList = new ArrayList<>();

        //loop through array of ratings to populate an array of ratings
        for (int i = 0; i < ratings.size(); i++) {
            ratingsList.add(Integer.parseInt(ratings.get(i)[1]));
        }

        //sort list
        Collections.sort(ratingsList);

        //an array of frequencies, that should hold enough for the largest number in the ArrayList
        int[] frequency = new int[Collections.max(ratingsList)];

        //count frequency of numbers in an array, and put it into the frequency array
        for(int i = 0; i < Collections.max(ratingsList); i++){
            frequency[i] = Collections.frequency(ratingsList, i+1);
        }

        //write header to file
        movieRatingsFrequency.fileWrite("Rating\tCount");

        //loop through frequency array and write to file
        for(int i = 0; i < frequency.length; i++){
            movieRatingsFrequency.fileWrite(i+1 + "\t" + frequency[i]);
            //for testing
            //System.out.println(i+1 + "\t" + frequency[i]);
        }

        //close output file
        movieRatingsFrequency.fileClose();

    }

    /**
     * A void method to populate the rating array for each account
     *
     * @param acct the account number to compare
     * @param rating a array to store rating totals and count
     * @param ratingsArray an array of ratings
     */
    public static void findRatings(String acct, int[] rating, ArrayList<String[]> ratingsArray) {
        //total
        rating[0] = 0;
        //count
        rating[1] = 0;
        //String line;
        //String[] fields;
        boolean done = false;


        /*
        while (((line = cardRatings.fileReadLine()) != null) && !(done)) {
            fields = line.split(",");
            if (fields[0].compareTo(acct) > 0) {
                done = true;
            }
            else if (fields[0].equals(acct)) {
                rating[1]++;
                rating[0] += Integer.parseInt(fields[1]);
            }

        }
         */

        /*--- NEW WAY TO GET ACCURATE NUMBERS ---*/

        //loop through array
        do {
            for (int i = 0; i < ratingsArray.size(); i++) {
                if (ratingsArray.get(i)[0].compareTo(acct) > 0) {
                    done = true;
                } else if (ratingsArray.get(i)[0].equals(acct)) {
                    rating[1]++;
                    rating[0] += Integer.parseInt(ratingsArray.get(i)[1]);
                }
                if (i == ratingsArray.size() - 1) {
                    done = true;
                }

            }


        } while (done == false);

    }

    /**
     * A void method to return the average of two numbers
     * @param total the total to divide
     * @param count the number of items to divide by
     * @return the average total/count. IF count is zero, return 0
     */

    public static float findAverageRatings(int total, int count) {
        float avgRating = 0;
        if (count != 0) {
            avgRating = total / (float) count;
        } else {
            avgRating = 0;
        }
        return avgRating;
    }

    /**
     * A void method to populate the nums array for each account
     *
     * @param acct the account number to compare
     * @param nums the nums array to get the total number of points and count
     * @param purchasesArray an array of purchases and point
     */
    public static void findPurchases(String acct, int[] nums, ArrayList<String[]> purchasesArray) {
        nums[0] = 0;
        nums[1] = 0;
        //String line;
        //String[] fields;
        boolean done = false;

        /*
        while (((line = cardPurchases.fileReadLine()) != null) && !(done)) {
            fields = line.split(",");
            if (fields[0].compareTo(acct) > 0) {
                done = true;
            }
            else if (fields[0].equals(acct)) {
                nums[0]++;
                nums[1] += Integer.parseInt(fields[2]);
            }

        }
        */

        /*--- NEW WAY TO GET ACCURATE NUMBERS ---*/
        //loop through array
        do {
            for (int i = 0; i < purchasesArray.size(); i++) {
                if (purchasesArray.get(i)[0].compareTo(acct) > 0) {
                    done = true;
                } else if (purchasesArray.get(i)[0].equals(acct)) {
                    nums[1]++;
                    nums[0] += Integer.parseInt(purchasesArray.get(i)[2]);
                }
                if (i == purchasesArray.size() - 1) {
                    done = true;
                }

            }
        } while (done == false);

    }
}