/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Med_Mate;

import java.io.IOException;
import java.sql.*;
import javax.servlet.http.*;

/**
 *
 * @author ASUS
 */
public class authSystem {
        
    private String userID;
    private String password;
    private String Query;
    
    HttpServletRequest request;
    HttpServletResponse response;
    
    public String getQuery() {
        return Query;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public authSystem(){
        
    }
    public boolean loginUser(String username,String pwd) throws SQLException{
        setUserID(username);
        setPassword(pwd);
        DBClass db = new DBClass();
        String LoginDataFetch_Query = "SELECT * FROM userinfo WHERE UserName = '"+getUserID()+"' AND Password = '"+getPassword()+"'";
        ResultSet rs = db.fillData(LoginDataFetch_Query);
        while(rs.next()){
            if(rs.getString("UserName").equals(getUserID()) && rs.getString("Password").equals(getPassword()))
                return true;
            else
                return false;
        }
        return false;
    }
}
