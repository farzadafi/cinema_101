package org.cinema.repository.impl;

import org.cinema.base.repository.impl.BaseEntityRepositoryImpl;
import org.cinema.entity.Admin;
import org.cinema.repository.AdminRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Admin<Integer>>
        implements AdminRepository {
    protected AdminRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "admin";
    }

    @Override
    public String getColumnsName() {
        return "(firstname,lastname,username,password)";
    }

    @Override
    public String getCountOfQuestionMarkForParams() {
        return "(?,?,?,?)";
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, Admin<Integer> entity, boolean isCountOnly) throws SQLException {
        preparedStatement.setString(1,entity.getFirstName());
        preparedStatement.setString(2,entity.getLastName());
        preparedStatement.setString(3,entity.getUserName());
        preparedStatement.setString(4,entity.getPassword());
    }

    @Override
    public String getUpdateQueryParams() {
        return "firstName = ?, lastName = ?, userName = ?, password = ?";
    }

    @Override
    public Admin<Integer> mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstName");
        String lastName = resultSet.getString("lastName");
        String userName = resultSet.getString("userName");
        String password = resultSet.getString("password");

        Admin<Integer> admin = new Admin<>();
        admin.setId(id);
        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setUserName(userName);
        admin.setPassword(password);

        return admin;
    }
}
