package dip.lab3.student.solution1;

import javax.swing.*;

public class GuiWriter implements Writer {

    public void setMessage(String s) {
        JOptionPane.showMessageDialog(null,s);
    }
}
