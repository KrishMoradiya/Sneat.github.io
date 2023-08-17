/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Med_Mate;

/**
 *
 * @author ASUS
 */
public class RegisterUser {
    private String username;
    private String name;
    private String password;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean registerUser(String Username,String Name,String Password){
        setName(Name);
        setPassword(Password);
        setUsername(Username);
        DBClass db = new DBClass();
        String InsertData_Query = "INSERT INTO `userinfo` (`Name`, `UserName`, `Password`) VALUES ('"+getName()+"', '"+getUsername()+"', '"+getPassword()+"')";
        int status = db.AED(InsertData_Query);
        if(status == 1)
            return true;
        else
            return false;
    }
}
