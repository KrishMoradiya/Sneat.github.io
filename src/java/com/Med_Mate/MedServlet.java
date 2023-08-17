/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Med_Mate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "MedServlet", urlPatterns = {"/html/editMedServlet"})
public class MedServlet extends HttpServlet {

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
//            For Update medicine info
            String actionType = request.getParameter("actionType");
            MedClass mc = new MedClass();
            String Med_Name = request.getParameter("medName");
            if (actionType.equals("searchByName")) 
            {
//                out.println(Med_Name);
                response.sendRedirect("SellPage.jsp?MedName=" + Med_Name);
            } 
            else if (actionType.equals("updateMedicineDetail"))
            {
                int MedID = Integer.parseInt(request.getParameter("medID"));
                int Quantity = Integer.parseInt(request.getParameter("quantity"));
                double Cost_Price = Double.parseDouble(request.getParameter("cprice"));
                double Selling_Price = Double.parseDouble(request.getParameter("sprice"));
                String Ex_Date = request.getParameter("exDate");
                String Med_Type = request.getParameter("medType");
                boolean status = mc.updateMedInfo(MedID, Med_Name, Ex_Date, Med_Type, Quantity, Cost_Price, Selling_Price);
                if (status) {
                    response.sendRedirect("Med-Detail.jsp");
                }
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MedServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MedServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
