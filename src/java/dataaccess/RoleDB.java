/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Role;

/**
 *
 * @author 886152
 */
public class RoleDB {

    public List<Role> getAll() {
        List<Role> roles = new ArrayList<Role>();
        ConnectionPool myConnectionPool = ConnectionPool.getInstance();
        Connection myConnecton = myConnectionPool.getConnection();
        PreparedStatement myPS = null;

        try {
            myPS = myConnecton.prepareStatement("select *from role");
            ResultSet myRecordSet = myPS.executeQuery();

            while (myRecordSet.next()) {
                Role role = new Role(myRecordSet.getString("role_id"), myRecordSet.getString("role_name"));
                roles.add(role);
            }

        } catch (SQLException e) {
            System.err.println(e.getSQLState());

        } finally {
            DBUtil.closePreparedStatement(myPS);
            myConnectionPool.freeConnection(myConnecton);
        }

        return roles;

    }
}
