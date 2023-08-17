/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Med_Mate;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class DBClass {
    private String Query;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    int status;
    public DBClass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medmatesystem","root","");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int AED(String Query){
        try{
            st = con.createStatement();
            status = st.executeUpdate(Query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
    public ResultSet fillData(String Query){
        try{
            st = con.createStatement();
            rs = st.executeQuery(Query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
