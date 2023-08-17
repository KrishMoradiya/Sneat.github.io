/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Med_Mate;
import java.sql.*;
import java.io.*;
import javax.servlet.http.*;
/**
 *
 * @author ASUS
 */
public class MedClass {
    private int medID;
    private String medName;
    private int Quantity;
    private double cPrice;
    private double sPrice;
    private String ExDate;
    private String medType;

    
    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
    }
    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setcPrice(double cPrice) {
        this.cPrice = cPrice;
    }

    public double getsPrice() {
        return sPrice;
    }

    public void setsPrice(double sPrice) {
        this.sPrice = sPrice;
    }

    public String getExDate() {
        return ExDate;
    }

    public void setExDate(String ExDate) {
        this.ExDate = ExDate;
    }

    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType;
    }
    
    public boolean insertMedInfo(String mName,String ExDate,String medType,int quantity,double cPrice,double sPrice){
        setMedName(mName);
        setExDate(ExDate);
        setMedType(medType);
        setQuantity(quantity);
        setcPrice(cPrice);
        setsPrice(sPrice);
        DBClass db = new DBClass();
        String Query = "INSERT INTO `medinfo` (`MedName`, `MedQt`,`inStockQty`, `MedCP`, `MedSP`, `MedExDate`, `MedType`) VALUES ('"+getMedName()+"', '"+getQuantity()+"', '"+getQuantity()+"', '"+getcPrice()+"', '"+getsPrice()+"', '"+getExDate()+"', '"+getMedType()+"')";
        int status = db.AED(Query);
        if(status == 1)
            return true;
        else
            return false;
    }
    public boolean updateMedInfo(int MedID,String mName,String ExDate,String medType,int quantity,double cPrice,double sPrice)
    {
        setMedID(MedID);
        setMedName(mName);
        setExDate(ExDate);
        setMedType(medType);
        setQuantity(quantity);
        setcPrice(cPrice);
        setsPrice(sPrice);
        DBClass db = new DBClass();
        String Query = "UPDATE `medinfo` SET `MedName` = '"+getMedName()+"', `MedQt` = '"+getQuantity()+"', `MedCP` = '"+getcPrice()+"', `MedSP` = '"+getsPrice()+"', `MedExDate` = '"+getExDate()+"', `MedType` = '"+getMedType()+"' WHERE `MedID` = "+getMedID();
        int status = db.AED(Query);
        if(status == 1)
            return true;
        else
            return false;
    }
    public boolean deleteMedInfo(int MedID)
    {
        setMedID(MedID);
        DBClass db = new DBClass();
        String Query = "DELETE FROM medinfo WHERE MedID = "+getMedID();
        int status = db.AED(Query);
        if(status == 1)
            return true;
        else
            return false;
    }
    public ResultSet fetchMedInfo(){
        DBClass db = new DBClass();
        String Query = "SELECT * FROM medinfo";
        ResultSet rs = db.fillData(Query);
        return rs;
    }
    public ResultSet MedInfoByID(int MedID){
        DBClass db = new DBClass();
        String Query = "SELECT * FROM medinfo WHERE MedID = "+MedID;
        ResultSet rs = db.fillData(Query);
        return rs;
    }
    public ResultSet MedInfoByName(String MedName){
        StringBuffer medName = new StringBuffer(MedName);
        DBClass db = new DBClass();
        String Query = "SELECT * FROM medinfo WHERE MedName like '%"+MedName+"%'";
        ResultSet rs = db.fillData(Query);
        return rs;
    }
    
}
