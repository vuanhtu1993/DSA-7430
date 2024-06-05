package DataStructure;

// Có 2 cách để implement một stack
// Cách 1: Array
// Cách 2: Linked List

interface IStack {
    void push(int value);
    int pop();
    int peek();
    int size();
    boolean isEmpty();
    int search(int value);
    void print();
}

public class Stack implements IStack {
    private int top;
    private int size;
    private int[] store;
    public Stack(int _size) {
        top = -1;
        size = 0;
        store = new int[_size];
    }

    @Override
    public void push(int value) {
        top++;
        store[top] = value;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int temp = store[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int search(int value) {
        return 0;
    }

    @Override
    public void print() {
        for(int i = 0; i <= top; i++) {
            System.out.print(store[i] + "-");
        }
    }
}
