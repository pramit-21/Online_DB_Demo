package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con;

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://mysql-1e70e558-pramitpoddar007-1422.h.aivencloud.com:10266/EVENT?ssl-mode=REQUIRED",
                    "avnadmin",
                    "password");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
