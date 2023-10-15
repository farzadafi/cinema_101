package org.cinema.entity;

import java.io.Serializable;

public class Users<ID extends Serializable> extends Person<ID>{


    public Users(String firstname, String lastName, String userName, String password) {
        super(firstname, lastName, userName, password);
    }

}
