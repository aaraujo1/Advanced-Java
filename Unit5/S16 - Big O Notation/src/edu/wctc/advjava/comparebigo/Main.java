package edu.wctc.advjava.comparebigo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);
    private static String input;

    private static long n;
    private static long c;

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");

        input = keyboard.nextLine();
        n = Long.parseLong(input);

        System.out.print("Enter a number 2—10: ");
        input = keyboard.nextLine();
        c = Long.parseLong(input);

        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s     %8s\n",
                "O(1)","O(log log n)","O(log n)","O(n)","O(n^2)","O(n^c)", "O(2^n)","O(c^n)", "O(n!)");
        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s\n",
                "--------","--------","--------","--------","--------","--------", "--------","--------", "--------");
        for (int i=0; i<=n; i++) {

            System.out.printf("%9s     %9f     %9f     %9s     %9s     %9s     %9s     %9s     %9s\n",
                    1,
                    loglog(i),
                    log(i),
                    one(i),
                    squared(i),
                    powerConstant(i,c),
                    power(i),
                    constantPower(c,i),
                    String.valueOf(factorial(i)));
        }

    }



    /*static String log(long n){
        return String.valueOf(Math.round((Math.log(n) * 1000.0)) / 1000.0);
    }*/

    static double loglog(long n){
        return Math.log(Math.log(n));
    }

    static double log(long n){
        return Math.log(n);
    }


    static String one(long n){
        return String.valueOf(n);
    }

    static String squared(long n){
        return String.valueOf((int)Math.pow(n,2));
    }

    static String powerConstant(long n, long c){
        return String.valueOf((int)Math.pow(n,c));
    }

    static String power(long n){
        return String.valueOf((int)Math.pow(2,n));
    }

    static String constantPower(long c, long n){
        return String.valueOf((BigInteger.valueOf((long)Math.pow(c,n))));
    }

    static BigInteger factorial(int n)
    {
        BigInteger answer;

        if (n == 0) {
            answer = BigInteger.valueOf(1);
        }else {
            answer = BigInteger.valueOf(n).multiply(factorial(n - 1));
        }

        return answer;
    }

}
