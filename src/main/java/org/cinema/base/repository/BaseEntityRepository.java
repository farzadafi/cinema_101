package org.cinema.base.repository;

import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
import java.sql.SQLException;

@SuppressWarnings("unused")
public interface BaseEntityRepository<ID extends Serializable,TYPE extends BaseEntity<ID>> {
        void save(TYPE entity) throws SQLException;
}
