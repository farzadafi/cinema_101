package org.cinema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    private String cinemaName;
    private String cinemaNumber;
    private String userName;
    private String password;
    private int config;
}
