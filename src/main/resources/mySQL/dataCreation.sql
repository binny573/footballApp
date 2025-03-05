CREATE TABLE Player (
    id INT PRIMARY KEY AUTO_INCREMENT,
    jerseyNo INT NOT NULL,
    fullName VARCHAR(255) NOT NULL,
    appearances INT,
    goals INT,
    FOREIGN KEY (team_id) REFERENCES Team(id)

    	private Integer jerseyNo;
	private String fullName;
	private int appearances;
	private int goals;
	private long wageInPounds;
);