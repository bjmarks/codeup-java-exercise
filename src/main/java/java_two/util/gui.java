package java_two.util;

import javax.swing.*;

public class gui {
    public static void input(String message){
        JOptionPane.showInputDialog(message);
        JOptionPane.showMessageDialog(null, "Your Answer is " + message);
    }
    public static String message(String message){
        return JOptionPane.showInputDialog(message);
    }
    public static void main(String[] args) {
    }
}
