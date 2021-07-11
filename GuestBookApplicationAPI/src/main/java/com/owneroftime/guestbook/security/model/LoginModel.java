package com.owneroftime.guestbook.security.model;


/**
 * 
 * @author Ram
 * Login Model Object which is having email and password
 *
 */
public class LoginModel {
	
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
