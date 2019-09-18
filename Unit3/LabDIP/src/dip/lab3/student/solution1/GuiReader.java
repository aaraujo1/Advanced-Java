package dip.lab3.student.solution1;


import javax.swing.*;

public class GuiReader implements Reader {

    public String getMessage() {
        return JOptionPane.showInputDialog(null,"Enter your message:");
    }
}
