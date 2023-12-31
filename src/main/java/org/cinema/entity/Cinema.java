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
public class Cinema<ID extends Serializable> extends BaseEntity<ID> {
    private String cinemaName;
    private String username;
    private String password;
    private int confirm;
}
