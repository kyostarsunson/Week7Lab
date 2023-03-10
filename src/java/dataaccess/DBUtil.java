/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author 886152
 */
public class DBUtil {

    public static void closeRecordSet(ResultSet myRecordSet) {

        if (myRecordSet == null) {
            try {
                myRecordSet.close();
            } catch (SQLException e) {
                System.err.println(e.getStackTrace());
            }
        }
    }

    public static void closePreparedStatement(PreparedStatement myPreparedStatement) {

        if (myPreparedStatement == null) {
            try {
                myPreparedStatement.close();
            } catch (SQLException e) {
                System.err.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }
}
