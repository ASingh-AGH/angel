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
  	CONSTRAINT helpplace_location_id_fk
  	FOREIGN KEY (locationId)
  	REFERENCES angel.Location(id)
  );

CREATE TABLE angel.HelpOffer(
  	id SERIAL PRIMARY KEY,
  	name TEXT,
  	description TEXT,
  	locationId INT,
  	accepted BOOL,
  	CONSTRAINT helpoffer_location_id_fk
  	FOREIGN KEY (locationId)
  	REFERENCES angel.Location(id)
  );

CREATE TABLE angel.Users(
    id SERIAL PRIMARY KEY,
    username TEXT,
    passHash TEXT,
    email TEXT
);

CREATE TABLE angel.Category(
    id SERIAL PRIMARY KEY,
    name TEXT
);

CREATE TABLE angel.PlaceCategory(
    placeId INT,
    catId INT,
    CONSTRAINT placecategory_place_id_fk
        FOREIGN KEY (placeId)
        REFERENCES angel.HelpPlace(id),
    CONSTRAINT placecategory_category_id_fk
            FOREIGN KEY (catId)
            REFERENCES angel.Category(id)
);

CREATE TABLE angel.OfferCategory(
    offerId INT,
    catId INT,
    CONSTRAINT offercategory_place_id_fk
        FOREIGN KEY (offerId)
        REFERENCES angel.HelpOffer(id),
    CONSTRAINT offercategory_category_id_fk
            FOREIGN KEY (catId)
            REFERENCES angel.Category(id)
);
