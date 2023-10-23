CREATE TABLE IF NOT EXISTS Admin
(
    id        serial,
    firstName varchar(50),
    lastName  varchar(50),
    username  varchar(50) not null,
    password  varchar(50)
);

CREATE TABLE IF NOT EXISTS Basket
(
    id           serial,
    username     varchar(50)
        REFERENCES UserTable (username),
    idTicket     Integer
        REFERENCES TicketTable (id),
    filmNae      varchar(50),
    numberTicket Integer,
    priceAll     Integer
);

CREATE TABLE IF NOT EXISTS Cinema
(
    id           serial,
    cinemaName   varchar(50) PRIMARY KEY,
    cinemaNumber varchar(50),
    username     varchar(50),
    password     varchar(50),
    confirm      int
);

CREATE TABLE IF NOT exists TicketTable
(
    id           serial PRIMARY KEY,
    cinemaName   varchar(50)
references cinema(cinemaName),
    filmName     varchar(50),
    datetime     date,
    clock        time,
    numberTicket int,
    price        int,
    numberBuy    int

);


CREATE TABLE IF NOT EXISTS UserTable
(
    firstName varchar(50),
    lastName  varchar(50),
    username  varchar(50) PRIMARY KEY,
    password  varchar(50)
);