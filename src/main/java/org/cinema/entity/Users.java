package org.cinema.entity;

import lombok.AllArgsConstructor;

@SuppressWarnings("unused")

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users<ID extends Serializable> extends Person<ID>{

}
