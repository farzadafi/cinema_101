CREATE TABLE IF NOT EXISTS admin
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(50),
    lastName  VARCHAR(50),
    userName  VARCHAR(50),
    password  VARCHAR(50)
)
;

CREATE TABLE IF NOT EXISTS cinema
(
    id           SERIAL PRIMARY KEY,
    cinemaName   VARCHAR(250),
    cinemaNumber VARCHAR(50),
    username     VARCHAR(50),
    password     VARCHAR(50),
    confirm      INTEGER
)
;

CREATE TABLE IF NOT EXISTS ticket
(
    id            SERIAL PRIMARY KEY,
    cinemaName    VARCHAR(50),
    filmName      VARCHAR(50),
    datetime      DATE,
    clock         TIME,
    numberTickets INTEGER,
    price         INTEGER
)
;

CREATE TABLE IF NOT EXISTS basket
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(50),
    idTicket INTEGER,
    filmName VARCHAR(250),
    number   INTEGER,
    priceAll INTEGER
)
;

CREATE TABLE IF NOT EXISTS users
(
    id        SERIAL PRIMARY KEY,
    firstname VARCHAR(50),
    lastName  VARCHAR(50),
    userName  VARCHAR(50),
    password  VARCHAR(50)
)
;