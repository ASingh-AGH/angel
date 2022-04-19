-- This table should store all information about the location address to refer it in other tables
CREATE TABLE angel_locations(
	id SERIAL PRIMARY KEY,
	geo GEOGRAPHY,
	building TEXT,
	apartment_number TEXT,
	street TEXT,
	city TEXT,
	zip TEXT
);

CREATE TABLE angel_places(
	id SERIAL PRIMARY KEY,
	name TEXT,
	description TEXT,
	location_id INT,
	CONSTRAINTS location_id_fk
		FOREIGN KEY (location_id)
		REFERENCES angel_locations(id)
);