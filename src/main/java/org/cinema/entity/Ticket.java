package org.cinema.entity;

import lombok.Getter;
import org.cinema.base.model.BaseEntity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
@SuppressWarnings("unused")
@Getter
public class Ticket<ID extends Serializable> extends BaseEntity<ID> {
    private String cinemaName;
    private String filmName;
    private Date dateTime;
    private Time clock;
    private int numberTickets;
    private int  price;


}
