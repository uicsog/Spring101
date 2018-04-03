package com.in28min.login;

public class LoginService {
    public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("asdf") && password.equals("asdf");
    }

}