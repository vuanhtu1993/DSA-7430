package Shape;

public abstract class Shape {
    public void print(String str) {
        System.out.println("Shape " + str);
    }
//    Abstract tính trừu tượng
    abstract double getArea();
}
