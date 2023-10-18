package org.cinema.base.repository;

import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings("unused")
public interface BaseEntityRepository<ID extends Serializable,TYPE extends BaseEntity<ID>> {
        void save(TYPE entity) throws SQLException;
        List<TYPE> findAll() throws SQLException;

        TYPE findById(ID id) throws SQLException;

        void update(TYPE entity) throws SQLException;

        void delete(ID id) throws SQLException;

}
