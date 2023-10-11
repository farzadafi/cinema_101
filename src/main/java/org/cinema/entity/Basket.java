package org.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Basket {
    private Users username;
    private Integer idTicket;
    private String filmName;
    private Integer number;
    private Integer priceAll;


}
