
INSERT INTO Team (name, country, cityName, stadiumName, establishedDate) VALUES
('Manchester United', 'England', 'Manchester', 'Old Trafford', '1878-03-05'),
('FC Barcelona', 'Spain', 'Barcelona', 'Camp Nou', '1899-11-29'),
('Bayern Munich', 'Germany', 'Munich', 'Allianz Arena', '1900-02-27');

INSERT INTO Player (jerseyNo, fullName, appearances, goals, teamId) VALUES
(7, 'Cristiano Ronaldo', 900, 700, 1), -- Manchester United
(10, 'Lionel Messi', 800, 750, 2), -- FC Barcelona
(9, 'Robert Lewandowski', 600, 450, 3); -- Bayern Munich

INSERT INTO Staff (name, contractExpiry, salary, education, teamId) VALUES
('Erik ten Hag', '2026-06-30', 5000000, 'UEFA Pro License', 1), -- Manchester United Coach
('Xavi Hernandez', '2025-06-30', 4000000, 'UEFA Pro License', 2), -- Barcelona Coach
('Thomas Tuchel', '2026-06-30', 6000000, 'UEFA Pro License', 3); -- Bayern Munich Coach