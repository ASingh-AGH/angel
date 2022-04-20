-- This table should store all information about the location address to refer it in other tables
CREATE TABLE angel_locations(
	id SERIAL PRIMARY KEY,
	geo GEOGRAPHY,
	building TEXT,
	apartmentNumber TEXT,
	street TEXT,
	city TEXT,
	zip TEXT
);

CREATE TABLE angel_places(
	id SERIAL PRIMARY KEY,
	name TEXT,
	description TEXT,
	locationId INT,
	CONSTRAINTS location_id_fk
		FOREIGN KEY (locationId)
		REFERENCES angel_locations(id)
);