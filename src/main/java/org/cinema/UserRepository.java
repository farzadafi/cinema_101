package org.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepositoryis {
    private Connection connection;


    //::::>
   public UserRepository(Connection connectionn) throws SQLException {
       connection = connectionn;
       String create = "CREATE TABLE IF NOT EXISTS UserTable (firstName varchar(50),lastName varchar(50),username varchar(50)PRIMARY KEY,password varchar(50) ) ";
       PreparedStatement fa = connection.prepareStatement(create);
       far.execute();
   }

    //::::>
    public int importUser(User user) throws SQLException {
        String importValue = "INSERT INTO UserTable (firstName,lastName,username,password) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(importValue);
        preparedStatement.setString(1,user.firstName);
        preparedStatement.setString(2,user.lastName);
        preparedStatement.setString(3,user.username);
        preparedStatement.setString(4,user.password);
        return preparedStatement.executeUpdate();
    }

    //::::>
    public String findUser(String username,string password) throws SQLException {
        String findQuery = "SELECT username FROM UserTable WHERE username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        preparedStatement.setString(1,username);
        preparedStatement.setString(20,password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
            return resultSet.getString("username");
    }

}
