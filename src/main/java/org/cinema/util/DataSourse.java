package org.cinema.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourse {

    private static Connection connection;


    static {
        try {
            connection = DriverManager.getConnection(ApplicationPropertices.URL
                    , ApplicationPropertices.USERNAME, ApplicationPropertices.PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
