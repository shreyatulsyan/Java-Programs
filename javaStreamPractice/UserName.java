package javaStreamPractice;

public class UserName {
    private String userName;

    public UserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName;
    }
}
