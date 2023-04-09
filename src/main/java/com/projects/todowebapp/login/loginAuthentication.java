package com.projects.todowebapp.login;

import org.springframework.stereotype.Component;

@Component
public class loginAuthentication {
    public boolean authenticate(String username, String password){
        boolean isValidUsername= username.equalsIgnoreCase("Aman");
        boolean isValidPassword= password.equalsIgnoreCase("Bhala");
        return isValidUsername && isValidPassword;
    }
}
