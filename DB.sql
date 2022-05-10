-- This table should store all information about the location address to refer it in other tables
  CREATE TABLE Location(
  	id SERIAL PRIMARY KEY,
  	geo GEOGRAPHY,
  	building TEXT,
  	apartmentNumber TEXT,
  	street TEXT,
  	city TEXT,
  	zip TEXT
  );

  CREATE TABLE HelpPlace(
  	id SERIAL PRIMARY KEY,
  	name TEXT,
  	description TEXT,
  	locationId INT,
  	accepted BOOL,
  	CONSTRAINTS location_id_fk
  		FOREIGN KEY (locationId)
  		REFERENCES Location(id)
  );