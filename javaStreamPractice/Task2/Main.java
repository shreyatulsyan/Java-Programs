package javaStreamPractice.Task2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.HashSet.newHashSet;

public class Main {
    public static void main(String[] args) {
        TestResultGenerator t = new TestResultGenerator();
        Student std1 = new Student((byte) 12,"Shreya1",9695,32.89);
        Student std2 = new Student((byte) 1,"Shreya2",7275,30.68);
        Student std3 = new Student((byte) 4,"Shreya3",8858,4596.68);
        Student std4 = new Student((byte) 7,"Shreya4",6394,416.68);
        Set<Student> stdList = Set.of(std1, std2, std3, std4);
        HashSet<Student> stdList1 = new HashSet<>(Arrays.asList(std1, std2, std3, std4));
        System.out.println(t.sortStudentsForRanking(stdList1));
        System.out.println(t.getDetailsOfFailedStudents(stdList));
    }

}
