-- SCHEMA: angel

-- DROP SCHEMA angel ;

CREATE SCHEMA angel
    AUTHORIZATION postgres;

-- This table should store all information about the location address to refer it in other tables
CREATE TABLE angel.Location(
  	id SERIAL PRIMARY KEY,
  	geoX FLOAT,
  	geoY FLOAT,
  	building TEXT,
  	apartmentNumber TEXT,
  	street TEXT,
  	city TEXT,
  	zip TEXT
  );

CREATE TABLE angel.HelpPlace(
  	id SERIAL PRIMARY KEY,
  	name TEXT,
  	description TEXT,
  	locationId INT,
  	accepted BOOL,
  	CONSTRAINT location_id_fk
  	FOREIGN KEY (locationId)
  	REFERENCES angel.Location(id)
  );

CREATE TABLE angel.Users(
    id SERIAL PRIMARY KEY,
    username TEXT,
    passHash TEXT,
    email TEXT
);

CREATE TABLE angel.Categories(
    id SERIAL PRIMARY KEY,
    name TEXT
);
