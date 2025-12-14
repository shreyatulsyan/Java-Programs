package javaStreamPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var std1 = new Student((byte) 12, "Shreya", "Tulsyan", (byte) 25);
        final var std2 = new Student((byte) 13, "Prateek", "Srivatava", (byte) 25);
        final var std3 = new Student((byte) 12, "Shreya", "Tulsyan", (byte) 25);
        final var std4 = new Student((byte) 13, "Prateek", "Srivatava", (byte) 25);
        var stdList = List.of(std1, std2, std3, std4);
        var pcc = new PortalCredentialsCreator();
        var usernames = pcc.createListOfUserNames(stdList);
        var passwords = pcc.createListOfRandomPasswords(stdList);
        System.out.println(pcc.createListOfUsers(usernames,passwords));
    }
}
