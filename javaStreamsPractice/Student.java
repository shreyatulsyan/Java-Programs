package javaStreamsPractice;

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
    public boolean equals(Object o){
    }
    @Override
    public int hashCode() {

    }
    @Override
    public String toString() {

    }
}