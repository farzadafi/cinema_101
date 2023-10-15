package org.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cinema.base.model.BaseEntity;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema<ID extends Serializable> extends BaseEntity<ID> {
    private String cinemaName;
    private String cinemaNumber;
    private String username;
    private String password;
    private int confirm;
}
