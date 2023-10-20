package org.cinema.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    private static Connection connection;


    static {
        try {
            connection = DriverManager.getConnection(ApplicationProperties.URL
                    , ApplicationProperties.USERNAME, ApplicationProperties.PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
