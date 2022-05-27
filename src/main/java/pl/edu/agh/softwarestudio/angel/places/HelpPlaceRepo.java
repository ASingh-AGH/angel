package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface HelpPlaceRepo extends ReactiveCrudRepository<HelpPlace, Long> {

    @Query("select * from HelpPlace ORDER BY id DESC LIMIT $1 OFFSET $2")
    Flux<HelpPlace> selectOffset(int limit, int offset);

//    @Override
//    @Query("SELECT hp.*, loc.id AS locId,loc.geoX AS locX, loc.geoY AS locY, loc.building AS locBuilding,loc.apartmentNumber AS locApartmentNumber,loc.street AS locStreet,loc.city AS locCity, loc.zip AS locZip FROM angel.HelpPlace hp JOIN angel.Location loc ON hp.locationId = loc.id")
//    Flux<HelpPlace> findAll();
}