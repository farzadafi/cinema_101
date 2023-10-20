package org.cinema.repository;


import org.cinema.entity.Admin;

import java.sql.*;

@SuppressWarnings("unused")
public class AdminRepository {
    private Connection connection;


    public AdminRepository(Connection connection) throws SQLException {
        this.connection = connection;
    }

    public void setCreateTable() throws SQLException {
        String createTable = "CREATE TABLE IF NOT EXISTS  Admin(id serial,firstName varchar(50),lastName varchar(50),username varchar(50)not null, password varchar(50) )";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTable);
    }


    public int importAdmin(Admin admin) throws SQLException {
        String importValue = "INSERT INTO Admin(firstName,lastName,username,password) VALUES (?,?,?,?)";
        PreparedStatement preparStatement = connection.prepareStatement(importValue);
        preparedStatement.setString(1, admin.getFirstName());
        preparedStatement.setString(2, admin.getLastName());
        preparedStatement.setString(3, admin.getUserName());
        preparedStatement.setString(4, admin.getPassword());
        return preparedStatement.executeUpdate();
    }

    //::::>
    public String findAdmin(String username, String password) throws SQLException {
        String findQuery = "SELECT * FRO Admin WHERE usernam = ? AND password = ?, ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(findQuery);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            return resultSet.getString("usernam");
        else
            return null;
    }


}
