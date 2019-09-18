package lab1;

import java.util.ArrayList;

/**
 * This class is responsible to be main driver class.
 * <p>
 * I am using the Liskov Substitution principle to make an arrayList of Course objects.
 * This allows me to populate the array with any object that inherits the Course object.
 * </p>
 *
 * @author andregaraujo
 * @version 1.1
 */
public class StartUp {
    private static ArrayList<Course> courses = new ArrayList<Course>();

    /*private static Course advancedJavaCourse;
    private static Course introJavaCourse;
    private static Course introToProgramming;*/

    private static OutputService outputService = new OutputService();


    public static void main(String[] args) {
        /*advancedJavaCourse = new AdvancedJavaCourse("Advanced Java Programming","152-135-001", 3.0, "Java Programming");

        introJavaCourse = new IntroJavaCourse("Java Programming","152-138-001", 3.0, "Math & Logic");

        introToProgramming = new IntroToProgrammingCourse("Introduction to Programming","152-107-001",3.0);


        courses.add(advancedJavaCourse);
        courses.add(introJavaCourse);
        courses.add(introToProgramming);*/


        courses.add(new AdvancedJavaCourse("152-135-001 Advanced Java Programming","20102", 4.0, "Java Programming"));
        courses.add(new IntroJavaCourse("152-138-001 Java Programming","20105", 3.0, "Math & Logic"));
        courses.add(new IntroToProgrammingCourse("152-107-001 Introduction to Programming","20093",2.0));


        for (Course c: courses
             ) {
            //System.out.println(c);
            outputService.addToMessage(c.toString());

        }

        outputService.output();
    }
}
