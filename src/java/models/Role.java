/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 886152
 */
public class Role {

    private String role_id = "";
    private String role_name = "";

    public Role(String role_id, String role_name) {

        this.role_id = role_id;
        this.role_name = role_name;

    }

    public String getRole_id() {
        return role_id;
    }

    public String getRole_name() {
        return role_name;
    }
}
