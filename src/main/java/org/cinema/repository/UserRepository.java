package org.cinema.repository;

import org.cinema.base.repository.BaseEntityRepository;
import org.cinema.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserRepository extends BaseEntityRepository<Integer,Users<Integer>> {

}
