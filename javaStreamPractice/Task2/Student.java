package javaStreamPractice.Task2;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable {
    private byte rollNumber;
    private final String name;
    private final long parentsNumber;
    private double marks;

    public Student(String name, long parentsNumber) {
        this.name = name;
        this.parentsNumber = parentsNumber;
    }

    public Student(Byte rollNumber, String name, long parentsNumber, Double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.parentsNumber = parentsNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public long getParentsNumber() {
        return parentsNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && parentsNumber == student.parentsNumber && Double.compare(marks, student.marks) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, parentsNumber, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", parentsNumber=" + parentsNumber +
                ", marks=" + marks +
                '}';
    }
}
