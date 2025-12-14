package javaStreamPractice.Task1;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private final String firstName;
    private final String lastName;
    private byte currentYear;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(byte rollNumber, String firstName, String lastName, byte currentYear) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear = currentYear;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(Byte currentYear) {
        this.currentYear = currentYear;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        return rollNumber == student.rollNumber
            && currentYear == student.currentYear
            && firstName != null && firstName.equals(student.firstName) // or Objects.equals(firstName, student.firstName)
            && lastName != null && lastName.equals(student.lastName); // or Objects.equals(lastName, student.lastName)
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, firstName, lastName, currentYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }
}