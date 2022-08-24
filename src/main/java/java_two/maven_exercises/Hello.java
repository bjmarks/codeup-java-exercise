package java_two.maven_exercises;

import javax.swing.*;

import static org.apache.commons.lang3.StringUtils.*;

public class Hello {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input a string or number");
        System.out.println(isNumeric(input));
//        try {
//            parseInt(input);
//            System.out.println("number is " + input);
//        } catch (Exception e){
//            System.out.println("input is NaN");
        System.out.println(swapCase(input));
        System.out.println(reverse(input));
//        }
    }
}
