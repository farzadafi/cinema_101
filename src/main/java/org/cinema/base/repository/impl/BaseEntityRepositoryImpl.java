package org.cinema.base.repository.impl;

import org.cinema.base.model.BaseEntity;
import org.cinema.base.repository.BaseEntityRepository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public abstract class BaseEntityRepositoryImpl<ID extends Serializable,TYPE extends BaseEntity<ID>>
        implements BaseEntityRepository<ID,TYPE> {
    private final Connection connection;


    protected BaseEntityRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(TYPE entity) throws SQLException {
        String sql = "INSERT INTO " + getTableName() + " " + getColumnsName() + " VALUES " + getCountOfQuestionMarkForParams() ;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            fillParamForStatement(statement, entity, false);
            statement.executeUpdate();
        }
    }
    @Override
    public TYPE findById(ID id) throws SQLException {
        String sql = "SELECT * FROM " + getTableName() + " WHERE id = ? ;";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, (Integer) id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next())
                return mapResultSetToEntity(resultSet);
        }
        return null;
    }

    @Override
    public List<TYPE> findAll() throws SQLException {
        List<TYPE> entities = new ArrayList<>();
        String sql = "SELECT * FROM " + getTableName() + ";";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                TYPE entity = mapResultSetToEntity(resultSet);
                entities.add(entity);
            }
        }
        return entities;
    }

    @Override
    public void update(TYPE entity) throws SQLException {
        String sql = "UPDATE " + getTableName() + " SET " + getUpdateQueryParams() + " WHERE id = " + entity.getId();
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            fillParamForStatement(statement, entity, true);
            statement.executeUpdate();
        }
    }

    @Override
    public void delete(ID id) throws SQLException {
        String sql = "DELETE FROM " + getTableName() + " WHERE id = ?;";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, (int) id);
            statement.executeUpdate();
        }
    }
    public abstract String getTableName();

    public abstract String getColumnsName();

    public abstract String getCountOfQuestionMarkForParams();

    public abstract void fillParamForStatement(PreparedStatement preparedStatement,
                                               TYPE entity,
                                               boolean isCountOnly) throws SQLException;
    public abstract String getUpdateQueryParams();
    public abstract TYPE mapResultSetToEntity(ResultSet resultSet) throws SQLException;


}
