package ch13.work.template;

/**
 * 1. Download chapter13 zip file from Blackboard.
 * 2. Review classes in the Template package.
 * 3. Modify “ReadFromFile” to actually read the file “prideprejudice”.
 * 4. Add another concrete class, “ReadFromUser” that asks the user to write a couple of lines in the initialize() method and prints it out in the startReading() method signals the end in the stopReading() method.
 * 5. Use the new Class in Main.java.
 */

public class Main {

    public static void main(String[] args) {

        BookReader book1 = new ReadFromFile();
        book1.readBook();

        BookReader book2 = new ReadFromArray();
        book2.readBook();


        BookReader book3 = new ReadFromUser();
        book3.readBook();

    }
}

