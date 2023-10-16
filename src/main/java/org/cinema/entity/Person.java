package org.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
@SuppressWarnings("unused")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person< ID extends Serializable> extends BaseEntity<ID> {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;


}
