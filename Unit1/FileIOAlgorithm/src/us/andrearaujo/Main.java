package us.andrearaujo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 9/05/18
 *
 * @author andregaraujo
 * @version 2018 0905 .1
 * This is the main driver class
 * It includes methods to print the menu,
 * run the menu based on user input,
 * output a list by meal,
 * and search a list based by meal
 */


public class Main {

    private final static FileInput indata = new FileInput("meals_data.csv");
    private static Scanner keyboard = new Scanner(System.in);
    private static MealsArray mealsArray = new MealsArray();

    public static void main(String[] args) {
        String line;
        //String[] fields;
        ArrayList<String> fields;

        while ((line = indata.fileReadLine()) != null) {
            fields = new ArrayList<>(Arrays.asList(line.split(",")));
            mealsArray.addElementWithStrings(fields.get(0),fields.get(1),fields.get(2));
        }
        runMenu();
    }

    private static void printMenu() {
        System.out.println("Select Action");
        System.out.println("1. List All Items");
        System.out.println("2. List All Items by Meal");
        System.out.println("3. Search by Meal Name");
        System.out.println("4. Exit");
        System.out.print("Please Enter your Choice: ");
    }

    private static void runMenu() {
        char ans;
        boolean userContinue = true;
        while(userContinue) {
            printMenu();
            ans = keyboard.next().charAt(0);
            switch(ans) {
                case '1':   mealsArray.printAllMeals();break;
                case '2':   listByMeal();break;
                case '3':   searchByName();break;
                case '4':   userContinue=false;break;
            }
        }
    }
    private static void listByMeal() {
        char ans;
        int ansNum=0;
        boolean userContinue = true;
        MealType mealType;
        //MealType[] mealTypeName = new MealType[10];
        ArrayList<MealType> mealTypeName = new ArrayList<>();

        System.out.println("Which Meal Type");
        int i=1;

        for(MealType m : MealType.values())
        {
            if (i < MealType.values().length+1) {
                //mealTypeName[i++] = m;
                mealTypeName.add(m);
                System.out.println(i++ + ") "+ m.getMeal());
            }
            else {
                System.out.println("Too Many Meal Types " + m.getMeal() + " not included.");
            }
        }
        System.out.print("Please Enter your Choice: ");
        ans = keyboard.next().charAt(0);
        if (Character.isDigit(ans)) {
            ansNum = Character.getNumericValue(ans);
            //mealType = mealTypeName[ansNum-1];
            mealType = mealTypeName.get(ansNum-1);
        }
        else {
            mealType = MealType.DINNER;
            System.out.println("Invalid Meal Type " + ans + ", defaulted to " + mealType.getMeal() + ".");
        }
        mealsArray.printMealsByType(mealType);
    }
    private static void searchByName() {
        keyboard.nextLine();
        System.out.print("Please Enter Value: ");
        String ans = keyboard.nextLine();
        mealsArray.printByNameSearch(ans);
    }


}