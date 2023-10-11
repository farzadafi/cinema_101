package org.cinema;

import lombok.*;
import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person<ID extends Serializable> extends BaseEntity<ID> {
    private String firstname;
    private String lastName;
    private String userName;
    private String password;
}
