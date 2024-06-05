package Shape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private static int count = 0;

    public static int getCount(){
        return count;
    }

    public double getPerimeter() {
        return (a + b + c)/2;
    }

    public double getArea() {
        double s = getPerimeter();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
