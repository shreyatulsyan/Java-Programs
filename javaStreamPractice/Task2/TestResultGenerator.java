package javaStreamPractice.Task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestResultGenerator {
    public HashSet<String> getDetailsOfFailedStudents(Set<Student> studentSet) {
        return (HashSet<String>) studentSet.stream().filter(st -> st.getMarks()<40)
                .map(st->st.getName()+"-"+st.getParentsNumber())
                .collect(Collectors.toSet());
    }

    public Set<Student> sortStudentsForRanking(HashSet<Student> studentSet) {
        //return studentSet.stream().sorted((st1,st2)->st1.getMarks()>st2.getMarks());
        //nhi aya
        return studentSet.stream()
                .sorted()
                .sorted(Comparator.comparingInt(Student::getRollNumber))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
