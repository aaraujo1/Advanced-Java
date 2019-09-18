package dip.lab3.student.solution1;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    //private Scanner keyboard = new Scanner(System.in);
    private String input;

    /*public ConsoleReader(){
        System.out.println("Enter your message:");
        setInput(keyboard.nextLine());
    }*/


    public String getMessage() {
        System.out.println("Enter your message:");
        /*setInput(keyboard.nextLine());
        return getInput();*/
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    /*public String getInput() {
        return input;
    }

    public void setInput(String input) {
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("Error: You did not enter anything.");
        }
        this.input = input;
    }*/
}
