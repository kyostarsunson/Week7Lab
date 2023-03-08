/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import dataaccess.UserDB;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;

/**
 *
 * @author 886152
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //System.err.println("I am hereffffffffffffffffffffffffffffffffffffff");

        HttpSession mySession = request.getSession();

        UserDB myUserDb = new UserDB();
        //String emailString = (String) mySession.getAttribute("email");
        List<User> users = myUserDb.getAll();

        request.setAttribute("users", users);

        ///
        String email = request.getParameter("email");
        if (email != null) {

            email = email.replaceAll(" ", "+");
            email = email.replaceAll("'", "");
            System.out.println("Servlets.UserServlet.getParameter(),email=" + email);
            User user = myUserDb.getByEmail(email);

            System.out.println("Servlets.UserServlet.doGet(),user=" + user);
            request.setAttribute("selectuser", user);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        HttpSession mySession = request.getSession();
//
//        String email = (String) mySession.getAttribute("email");
//
//        String actionString = request.getParameter("action");
        //UserDB myUserDb = new UserDB();
        //String userString = myUserDb.getAll().toString();
        //request.setAttribute("users", myUserDb.getAll());
        //doGet(request, response);
        //getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        //System.err.println("Users info: =" + userString);
//        try {
//
//            switch (actionString) {
//                case "add": {
//
//                }
//                ;
//            };
//
//        } catch (Exception e) {
//        }
    }

}
