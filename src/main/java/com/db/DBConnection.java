package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con;

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "DB_URL",
                    "DB_USER",
                    "DB_PASSWORD");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
