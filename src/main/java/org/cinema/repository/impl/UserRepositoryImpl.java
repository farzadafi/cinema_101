package org.cinema.repository.impl;

import org.cinema.base.repository.impl.BaseEntityRepositoryImpl;
import org.cinema.entity.Users;
import org.cinema.repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Users<Integer>>
        implements UserRepository {

    protected UserRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "users";
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
    public void fillParamForStatement(PreparedStatement preparedStatement, Users<Integer> entity, boolean isCountOnly) throws SQLException {
        preparedStatement.setString(1, entity.getFirstName());
        preparedStatement.setString(2, entity.getLastName());
        preparedStatement.setString(3, entity.getUserName());
        preparedStatement.setString(4, entity.getPassword());
    }

    @Override
    public String getUpdateQueryParams() {
        return "firstname = ?, lastname = ?, username = ?, password = ?";
    }

    @Override
    public Users<Integer> mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        Integer id = resultSet.getInt("id");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        String userName = resultSet.getString("username");
        String password = resultSet.getString("password");

        Users<Integer> user = new Users<>();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);

        return user;
    }
}
