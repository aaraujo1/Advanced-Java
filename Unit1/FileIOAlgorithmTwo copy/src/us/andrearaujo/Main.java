package us.andrearaujo;

import java.util.Scanner;

public class Main {

    private final static FileInput cardAccts = new FileInput("movie_cards.csv");
    private final static FileInput cardPurchases = new FileInput("movie_purchases.csv");
    private final static FileInput cardRatings = new FileInput("movie_rating.csv");
    private static Scanner keyboard = new Scanner(System.in);

    //private final static FileOutput movieRatings = new FileOutput("movie_ratings_sorts");

    public static void main(String[] args) {
        String line;
        String[] fields;
        int[] nums = new int[2];
        double[] rating = new double[2];
        System.out.format("%8s  %-18s %6s %6s   %6s\n","Account","Name", "Movies", "Points", "Avg. Rating");
        while ((line = cardAccts.fileReadLine()) != null) {
            fields = line.split(",");
            findPurchases(fields[0], nums);
            findRatings(fields[0], rating);
            System.out.format("00%6s  %-18s  %2d   %4d %10.2f\n",fields[0],fields[1], nums[0], nums[1], (float)(rating[0]/rating[1]));
        }
    }

    public static void findRatings(String acct, double[] rating) {
        //total
        rating[0] = 0;
        //count
        rating[1] = 0;
        String line;
        String[] fields;
        boolean done = false;
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
    }

    public static void findPurchases(String acct, int[] nums){
        nums[0] = 0;
        nums[1] = 0;
        String line;
        String[] fields;
        boolean done = false;
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
    }
}