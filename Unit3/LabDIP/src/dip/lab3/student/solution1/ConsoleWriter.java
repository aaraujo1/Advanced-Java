package dip.lab3.student.solution1;

public class ConsoleWriter implements Writer {

    public void setMessage(String s) {
        System.out.println("Your message: " + s);
    }
}
