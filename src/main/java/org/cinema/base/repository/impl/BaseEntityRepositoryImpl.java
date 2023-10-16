package org.cinema.base.repository.impl;

import org.cinema.base.model.BaseEntity;
import org.cinema.base.repository.BaseEntityRepository;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("unused")
public abstract class BaseEntityRepositoryImpl<ID extends Serializable,TYPE extends BaseEntity<ID>>
        implements BaseEntityRepository<ID,TYPE> {


    @Override
    public void save(TYPE entity) throws SQLException {

    }
}
