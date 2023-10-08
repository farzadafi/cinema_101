package org.cinema;

import java.sql.Date;
import java.sql.Time;

public class Ticket {
    private String cinemaName;
    private String filmname;
    private Date datetime;
    private Time clock;
    private int numbertickets;
    private int  price;

    public String getFilmName() {
        return filmName;
    }

    public Date getDatetime(){
        return datetime;
    }

    public Time getClock() {
        return clock;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public int getPrice() {
        return price;
    }
}
