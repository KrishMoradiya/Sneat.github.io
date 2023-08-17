package com.Med_Mate;
import com.Med_Mate.DBClass;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class getIndexDataClass {
    private String Query;

    public String getQuery() {
        return Query;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }
    public ResultSet getIndexData(String Query){
        setQuery(Query);
        DBClass db = new DBClass();
        ResultSet rs = db.fillData(getQuery());
        return rs;
    }
}
