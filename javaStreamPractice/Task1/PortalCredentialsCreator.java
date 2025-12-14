package javaStreamPractice.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class PortalCredentialsCreator {

    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        return studentsList.stream()
            .distinct()
            .map(this::createUsername)
            .toList();
    }

    public List<PassWord> createListOfRandomPasswords(List<Student> studentsList) {
        return studentsList.stream()
            .distinct()
            .map(this::createPassWord)
            .toList();
    }

    // TODO:
    public List<User> createListOfUsers(List<UserName> userNames, List<PassWord> passwords) {
        List<User> u = new ArrayList<>();
        for(int i=0;i<userNames.size();i++){
            UserName username = userNames.get(i);
            PassWord password = passwords.get(i);
            u.add(new User(username, password));
        }
        return u;
    }

    private UserName createUsername(Student student) {
        return new UserName(student.getFirstName() + "_" + student.getRollNumber());
    }

    private PassWord createPassWord(Student student) {
        // Select the length of password.
        int length = RandomGenerator.getDefault().nextInt(8, 20);

        // Divide the password in 3 equal parts for alphabets, digits and special characters.
        int eachPartLength = length / 3;

        // StringBuilder to hold the password.
        final var pwd = new StringBuilder();

        // Add characters in password, for even add small case and for odd add upper case.
        for (int i = 0; i < eachPartLength; i++) {
            if (i % 2 == 0) {
                pwd.append((char) RandomGenerator.getDefault().nextInt('a', 'z'));
            }  else {
                pwd.append((char) RandomGenerator.getDefault().nextInt('A', 'Z'));
            }
        }

        // Add digits to password.
        for (int i = 0; i < eachPartLength; i++) {
            pwd.append((char) RandomGenerator.getDefault().nextInt('0', '9'));
        }

        // Add special characters to password
        for (int i = 0; i < length - (eachPartLength * 2); i++) {
            pwd.append((char) RandomGenerator.getDefault().nextInt(33, 47));
        }

        return new PassWord(pwd.toString());
    }
}
