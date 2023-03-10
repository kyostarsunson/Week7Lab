/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author 886152
 */
public class User implements Serializable {

    private String email;
    private String first;
    private String last;
    private String password;
    private String role;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", first=" + first + ", last=" + last + ", pass=" + password + ", role=" + role + '}';
    }

    public User() {
    }

    ;

    public User(String emailString, String firstNameString, String lastNameString, String passwordString, String roleNameString) {
        this.email = emailString;
        this.first = firstNameString;
        this.last = lastNameString;
        this.password = passwordString;
        this.role = roleNameString;

    }

}
