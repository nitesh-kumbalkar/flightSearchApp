DROP TABLE IF EXISTS flights;
 
CREATE TABLE flights (
  flightNo INT PRIMARY KEY,
  source VARCHAR(250) NOT NULL,
  destination VARCHAR(250) NOT NULL,
  airlineName VARCHAR(250) NOT NULL,
  arrivalTime TIMESTAMP  NOT NULL,
  departureTime TIMESTAMP  NOT NULL,
  duration VARCHAR(250),
  stops INT NOT NULL,
  price float NOT NULL
);
 
INSERT INTO flights  VALUES
  (12345, 'BLR', 'RPR', 'Indigo', parsedatetime('01-10-2012 01:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('01-10-2012 02:00:00', 'dd-MM-yyyy hh:mm:ss'), '1hr', 1, 3250),
  (32145, 'RPR', 'BLR', 'Indigo', parsedatetime('03-10-2012 03:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('03-10-2012 04:00:00', 'dd-MM-yyyy hh:mm:ss'), '1hr', 1, 3250),
  (45356, 'BLR', 'RPR', 'AirAsia', parsedatetime('01-10-2012 05:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('01-10-2012 06:30:00', 'dd-MM-yyyy hh:mm:ss'), '1hr30min', 2, 4320),
  (97876, 'RPR', 'BLR', 'AirAsia', parsedatetime('03-10-2012 09:00:00', 'dd-MM-yyyy hh:mm:ss'), parsedatetime('03-10-2012 10:30:00', 'dd-MM-yyyy hh:mm:ss'), '1hr30min', 2, 4320);