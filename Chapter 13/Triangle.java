package Chapter13;

public class Triangle  extends GeometricObject implements Colorable {
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double firstSide, double secondSide, double thirdSide) {
        side1 = firstSide;
        side2 = secondSide;
        side3 = thirdSide;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double firstSide) {
        side1 = firstSide;
    }

    public void setSide2(double secondSide) {
        side2 = secondSide;
    }

    public void setSide3(double thirdSide) {
        side3 = thirdSide;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String howToColor() {
        return "Color all three sides";
    }

    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}