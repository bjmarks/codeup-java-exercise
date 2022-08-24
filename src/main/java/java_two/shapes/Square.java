package java_two.shapes;
//public class Square extends Rectangle {
//    public Square(int length, int width) {
//        super(length, width);
//    }
//    public Square(int side) {
//        super(side, side);
//    }
//    @Override
//    public int getArea() {
//        System.out.println("square getArea");
//        return length * length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.println("square getPerimeter");
//        return 4 * length;
//    }
//
//    public void setSide(int side) {
//        this.length = side;
//        this.width = side;
//    }
////    public interface Measurable(){
////        double getPerimeter();
////        double getArea();
////    }
//}
public class Square extends Quadrilateral {

    public Square(double length, double width) {super(length, width);}
    public Square(double side) {super(side, side);}
    @Override
    public double getPerimeter() {return length * 4;}
    @Override
    public double getArea() {return length * width;}
    @Override
    public void setLength(double length) {this.length = this.width = length;}
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
}