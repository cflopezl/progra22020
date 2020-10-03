package edu.umg.utils;

import edu.umg.modelo.Universidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VariablesGlobales {
    public static String fileName = "C:/cflopezl/workspace/umgrepositories/progra22020/clase8/MyLogFile.log";
    public static final String USER_NAME = "cursocflopezl@gmail.com";  // GMail user name (just the part before "@gmail.com")
    public static final String PASSWORD = "Password@123"; // GMail password
    public static final String RECIPIENT[] = {"clopezl@miumg.edu.gt","kfajardop2@miumg.edu.gt", "dmelgarq@miumg.edu.gt"};
    public static final int INFO = 7;
    public static final int MEDIUM = 5;
    public static final int DANGER = 3;
    public static Universidad umg;
    public static final String DRIVER_DB = "org.postgresql.Driver";
    public static final String URL_DB ="jdbc:postgresql://localhost/umgdb";
    public static final String USER_DB = "postgres";
    public static final String PASSWORD_DB = "platzi";
    public static Connection conn;
    static{
        try {
            Class.forName(DRIVER_DB);
            conn = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
