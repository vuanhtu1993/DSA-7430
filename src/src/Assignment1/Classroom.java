package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    private String name;
    private List<Student> students;
    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void editStudent(int index) {
        Scanner sc = new Scanner(System.in);
        Student student = students.get(index);
        System.out.print("Thông tin sinh viên");
        student.display();
        System.out.println("Cập nhật điểm sinh viên");
        System.out.println("Nhập vào điểm");
        double mark = sc.nextDouble();
        student.setMark(mark);
    }
    public void displayStudents() {
        System.out.printf("%10s %10s %10s", "ID", "NAME", "MARK");
        System.out.println();
        for (Student student : students) {
            System.out.printf("%10s %10s %10f", student.getId().substring(20), student.getName(), student.getMark());
            System.out.println();
        }
    }
    public void sortStudents(String field) {
//        Selection sort
        for (int i = 0; i < students.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < students.size(); j++) {
                if(students.get(min).getMark() > students.get(j).getMark()) {
                    min = j;
                }
            }
            swapStudents(i, min);
        }
    }
    public void swapStudents(int index1, int index2) {
        Student temp = students.get(index1);
        students.set(index1, students.get(index2));
        students.set(index2, temp);
    }
}
