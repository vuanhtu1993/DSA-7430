import DataStructure.Stack;

public class Main {

    public static void main(String[] args) {
//        function1();
        Stack stack1 = new Stack(10);
        stack1.push(1);
        stack1.push(3);
        stack1.push(4);
        stack1.push(6);
        stack1.push(8);
        stack1.pop();
        stack1.print();
    }
}