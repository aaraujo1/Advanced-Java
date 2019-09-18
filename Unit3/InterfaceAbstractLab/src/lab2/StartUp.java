package lab2;

import java.util.ArrayList;

/**
 * This class is responsible to be main driver class
 * <p>
 * I am using the Liskov Substitution principle to make an arrayList of Course objects.
 * This allows me to populate the array with any object that inherits the Course object.</p>
 *  <p>
 * For this lab, I am saying each class can be instantiated for each specific instance of that class, as demonstrated by having two IntroToProgrammingCourse objects.</p>
 *
 * @author andregaraujo
 * @version 1.1
 */
public class StartUp {
    private static ArrayList<Course> courses = new ArrayList<Course>();



    private static OutputService outputService = new OutputService();


    public static void main(String[] args) {

        courses.add(new AdvancedJavaCourse("152-135-001 Advanced Java Programming","20102", 4.0, "Java Programming"));
        courses.add(new IntroJavaCourse("152-138-001 Java Programming","20105", 3.0, "Math & Logic"));
        courses.add(new IntroToProgrammingCourse("152-107-001 Introduction to Programming","20093",2.0));
        courses.add(new IntroToProgrammingCourse("152-107-002 Introduction to Programming","20094",2.0));


        for (Course c: courses
        ) {
            outputService.addToMessage(c.toString());

        }

        outputService.output();
    }
}
