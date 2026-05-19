package com.db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {

        try {

            Properties p = new Properties();

            FileInputStream fis =
                    new FileInputStream(
                    "src/main/resources/db.properties");

            p.load(fis);

            String url = p.getProperty("url");
            String user = p.getProperty("username");
            String pass = p.getProperty("password");

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    url,
                    user,
                    pass);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

