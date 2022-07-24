CREATE DATABASE IF NOT EXISTS testdb;

CREATE TABLE IF NOT EXISTS user(
    id INTEGER not null,
    name varchar(50) not null,
    email varchar(50) not null,
    password varchar(50) not null,
    PRIMARY KEY (id, email)
);

INSERT INTO user(id, name, email, password)VALUES(1, 'Tarou', 'tarou@example.com', 'paasword');