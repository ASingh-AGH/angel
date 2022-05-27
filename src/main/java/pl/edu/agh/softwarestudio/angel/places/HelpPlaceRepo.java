package pl.edu.agh.softwarestudio.angel.places;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface HelpPlaceRepo extends JpaRepository<HelpPlace, Long> {

//    @Query("select * from HelpPlace ORDER BY id DESC LIMIT $1 OFFSET $2")
//    Flux<HelpPlace> selectOffset(int limit, int offset);

//    @Override
//    @Query("SELECT hp.*, loc.id AS locId,loc.geoX AS locX, loc.geoY AS locY, loc.building AS locBuilding,loc.apartmentNumber AS locApartmentNumber,loc.street AS locStreet,loc.city AS locCity, loc.zip AS locZip FROM angel.HelpPlace hp JOIN angel.Location loc ON hp.locationId = loc.id")
//    Flux<HelpPlace> findAll();

}