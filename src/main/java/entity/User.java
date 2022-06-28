package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    public boolean validateLogin() {
        Pattern pattern = Pattern.compile("^[a-zA-Z]");
        Matcher matcher = pattern.matcher(login);
        return matcher.find();
    }

    public boolean validatePassword() {
        Pattern pattern = Pattern.compile("^[a-zA-Z].{2}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}
