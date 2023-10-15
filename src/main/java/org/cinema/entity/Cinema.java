package org.cinema.entity;

import org.cinema.base.model.BaseEntity;

import java.io.Serializable;

public class Cinema<ID extends Serializable> extends BaseEntity<ID> {
    private String cinemaName;
    private String cinemaNumber;
    private String username;
    private String password;
    private int confirm;
}
