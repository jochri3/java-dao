package service;
//COmmand + K : clier screen msql console
import com.sun.tools.javac.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static Connection conn;
    final private static String URL="jdbc:mysql://192.168.64.2/poe_crm";
    final private static String USERNAME="root";
    final private static String PASSWORD="";

    private DatabaseConnection(){}

    public static Connection getInstance() throws SQLException{
        if(conn==null){
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        return conn;
    }
}

