package java_two.shapes;

import java_two.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        while (true) {
            double radius = input.getDouble("Enter a radius: ");
            Circle circle = new Circle(radius);
            System.out.println("Area = " + circle.getArea());
            System.out.println("Circumference = " + circle.getCircumference());
            if (input.yesNo("Do you want to Keep going") == false) {
                break;
            }
        }
    }
}
