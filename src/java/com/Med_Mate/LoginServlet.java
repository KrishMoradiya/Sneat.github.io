/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Med_Mate;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.*;
/**
 *
 * @author ASUS
 */
@WebServlet("/html/LoginServlet")
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            authSystem auth = new authSystem();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if(username != "" && password != ""){
                boolean status = auth.loginUser(username, password);
                if(status){
                    DBClass db = new DBClass();
                    ResultSet rs = db.fillData("SELECT * FROM userinfo WHERE UserName = '"+username+"' AND Password = '"+password+"'");
                    if(rs.next()){
                        HttpSession session = request.getSession();
                        session.setAttribute("UserID", username);
                        session.setAttribute("UserName", rs.getString("Name"));
                    }
                    response.sendRedirect("/Med-Mate/html/index.jsp");
                }
                else
                    response.sendRedirect("/Med-Mate/html/Error.jsp?ErrorCode=1");
            }
            else
                response.sendRedirect("/Med-Mate/html/Error.jsp?ErrorCode=1");
//            String LoginDataFetch_Query = "SELECT * FROM userinfo WHERE UserName = '"+username+"' AND Password = '"+password+"'";
//            authSystem auth = new authSystem();
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(dbURL, dbUserName, dbPassword);
            Statement fetchST = con.createStatement();
            ResultSet rs = fetchST.executeQuery(LoginDataFetch);
            if(rs.next()){
                if(rs.getString("UserName").equals(username) && rs.getString("Password").equals(password)){
                    response.sendRedirect("/Med-Mate/html/index.html");
                }
                else{
                    out.print("Enter Correct Password or UserName");
                }
            }
            else{
                response.sendRedirect("/Med-Mate/html/Error.jsp?ErrorID=1");
            }
            */
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
