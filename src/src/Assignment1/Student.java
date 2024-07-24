package Assignment1;

import java.util.List;
import java.util.UUID;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double mark;
    public Student(String name, double mark) {
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
        this.name = name;
        this.mark = mark;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMark() {
        return mark;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    public String getRank() {
        if (mark >= 0 && mark < 5) {
            return "Fail";
        } else if (mark >= 5 && mark <6.5) {
            return "Medium";
        } else if (mark >= 6.5 && mark < 7.5) {
            return "Good";
        } else if (mark >= 7.5 && mark < 9) {
            return "Very good";
        } else if (mark <= 10) {
            return "Excellent";
        }
        return  "Unknown";
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Rank: " + getRank());
    }
}

