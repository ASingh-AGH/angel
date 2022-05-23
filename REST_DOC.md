# Documentation of REST API interface

## /api/info
Access: public  
Show information about running API handler (for debug purpose)

## /api/list/places
Access: public  
Shows the list of places currently in the system  
Returns list of objects in JSON  
```
{
	id: 0,
	name: "Name of place",
	desc: "Description of provided help",
	locationDesc: "example street 1",
	location: <>
}
```
## /api/list/offers

## /api/details/places/{id}/

## /api/details/offers/{id}/

## /api/create/offer/
Takes `POST` parameters
- name
- description
- locationDescription
- 

## /api/login/
Takes `POST` parameters
- user
- passwordHash

## /api/register/