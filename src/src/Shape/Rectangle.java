package Shape;

public class Rectangle extends Shape {
//    Biến thành viên
    public double width;
    public double height;
//   Biến tĩnh
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.count += 1;
    }
    public void print(String str) {
        System.out.println("Shape: " + str);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public double getArea() {
        return width * height;
    }
}