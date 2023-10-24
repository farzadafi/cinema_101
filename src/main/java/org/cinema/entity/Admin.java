package org.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class Admin<ID extends Serializable> extends Person<ID> {

}
