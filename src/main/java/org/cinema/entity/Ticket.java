package org.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket <ID extends Serializable> extends BaseEntity<ID> {
    private String cinemaName;
    private String filmName;
    private Date datetime;
    private Time clock;
    private int  price;

}
