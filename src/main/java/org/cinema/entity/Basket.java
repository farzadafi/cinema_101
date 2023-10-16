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
public class Basket<ID extends Serializable> extends BaseEntity<ID> {
    private String username;
    private Integer idTicket;
    private String filmName;
    private Integer number;
    private Integer priceAll;


}
