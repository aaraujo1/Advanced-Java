package ch13.work.template;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader {
    Scanner scanner = new Scanner(System.in);
    String line;
    ArrayList<String> lines = new ArrayList<>();

    @Override
    void initialize() {
        System.out.println("\n------ STARTING ReadFromUser ------\n");
        System.out.println("Please enter line. Leave empty when done.");

        do {

            line = scanner.nextLine();
            lines.add(line);


        }while(line.length() != 0);

    }

    @Override
    void startReading() {
        System.out.println("\n------ READING ReadFromUser ------\n");
        for (int i=0;i<lines.size();i++) {
            System.out.println(lines.get(i));
        }
    }

    @Override
    void stopReading() {
        System.out.println("\n------ ENDING ReadFromUser ------\n");
    }
}
