package fiboWord;

public class Main {
    static String S0 = "0", S1 = "01", Sn;

    public static void main(String[] args) {
        /*int count = 20;
        System.out.print(S1);
        printFibo(count - 2);*/

        int count = 5;


        //System.out.print(S1); //because the first iteration concatenates with nothing
        printFibo(count-1);

        //System.out.println();
        //System.out.println("0100101001001");
    }

    static void printFibo(int count) {
        if (count > 0) { //Base Criterion
            Sn = S0 + S1;
            S0 = S1;
            S1 = Sn;

            /*Sn = S1 + S0;
            S0 = S1;
            S1 = Sn;*/

            System.out.print(Sn);



            /*Sn = S1;
            S1 += S0;
            S0 = Sn;*/
            //System.out.print(S1);

            printFibo(count - 1); //Progressive Change
        }
    }

}

//0100101001001


/**
 * S_{0}    0
 * S_{1}    01
 * S_{2}    010
 * S_{3}    01001
 * S_{4}    01001010
 * S_{5}    0100101001001
 */

/**
 The first few elements of the infinite Fibonacci word are:
 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, ... (sequence A003849 in the OEIS)
 */