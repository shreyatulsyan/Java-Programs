package javaStreamsPractice;

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
        return "UserName{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
