CREATE TABLE Team (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    country VARCHAR(255) NOT NULL,
    cityName VARCHAR(255) NOT NULL,
    stadiumName VARCHAR(255) NOT NULL,
    establishedDate DATE
);
CREATE TABLE Player (
    id INT PRIMARY KEY AUTO_INCREMENT,
    jerseyNo INT NOT NULL,
    fullName VARCHAR(255) NOT NULL,
    appearances INT,
    goals INT,
    teamId INT,
    FOREIGN KEY (teamId) REFERENCES Team(id)
);
CREATE TABLE Staff(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    contractExpiry DATE,
    salary BIGINT,
    education VARCHAR(255),
    teamId INT,
    FOREIGN KEY (teamId) REFERENCES Team(id)
);