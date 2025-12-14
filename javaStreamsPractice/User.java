package javaStreamsPractice;

public class User {
    private final UserName userName;
    private final PassWord password;

    public User (UserName userName, PassWord password) {
        this.userName = userName;
        this.password = password;
    }

    public UserName getUserName () {
        return userName;
    }

    public PassWord getPassword () {
        return password;
    }
}
