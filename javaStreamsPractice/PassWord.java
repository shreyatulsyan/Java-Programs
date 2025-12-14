package javaStreamsPractice;

public class PassWord {
    private String passWord;

    public PassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return "PassWord{" +
                "passWord='" + passWord + '\'' +
                '}';
    }
}
