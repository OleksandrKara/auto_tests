package com.epam.tests;

import com.epam.main.Database;


/**
 * Created with IntelliJ IDEA.
 * User: Oleksandr_Kara
 * Date: 4/22/14
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseTest {
    public static void main(String[] args){
        String url = "jdbc:sybase:Tds://172.21.55.11:4101:?SERVICENAME=fatture";   //jdbc:sybase:Tds:localhost:2638
        String user =  "adm_finance";
        String password = "D0lc3tt0";
        String driver = "com.sybase.jdbc4.jdbc.SybDriver";
        Database.getSybaseConnection(url,user,password,driver);
    }
}

