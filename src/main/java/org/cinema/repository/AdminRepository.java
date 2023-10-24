package org.cinema.repository;


import org.cinema.base.repository.BaseEntityRepository;
import org.cinema.entity.Admin;

import java.sql.*;

@SuppressWarnings("unused")
public interface AdminRepository extends BaseEntityRepository<Integer,Admin<Integer>> {

}
