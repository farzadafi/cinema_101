package org.cinema.entity;

import lombok.Getter;

import java.sql.Date;
import java.sql.Time;
@SuppressWarnings("unused")
@Getter
public class Ticket {
    private String cinemaName;
    private String filmName;
    private Date dateTime;
    private Time clock;
    private int numberTickets;
    private int  price;


}
