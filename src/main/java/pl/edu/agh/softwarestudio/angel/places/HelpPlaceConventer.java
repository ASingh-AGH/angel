package pl.edu.agh.softwarestudio.angel.places;

import io.r2dbc.spi.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import pl.edu.agh.softwarestudio.angel.location.Location;
import pl.edu.agh.softwarestudio.angel.location.LocationRepo;
import pl.edu.agh.softwarestudio.angel.location.LocationRepoService;

@ReadingConverter
public class HelpPlaceConventer implements Converter<Row, HelpPlace> {
// why does not work?
//    @Autowired
//    private LocationRepo locationRepo;
    //https://mariadb.com/docs/connect/programming-languages/java-r2dbc/spring/repositories/

    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public HelpPlace convert(Row source) {
//        Location loc = new Location();
//        loc.setId(source.get("locId", Integer.class));
//        loc.setGeoX(source.get("locX", Float.class));
//        loc.setGeoY(source.get("locY", Float.class));
//        loc.setStreet(source.get("locStreet", String.class));
//        loc.setBuilding(source.get("locBuilding", String.class));
//        loc.setApartmentNumber(source.get("locApartmentNumber", String.class));
//        loc.setCity(source.get("locCity", String.class));
//        loc.setZip(source.get("locZip", String.class));

        HelpPlace hp = new HelpPlace();
        hp.setId(source.get("id", Integer.class));
        hp.setName(source.get("name", String.class));
        hp.setLocationId(source.get("locationId",Integer.class));
        hp.setDescription(source.get("description",String.class));
        LocationRepoService lrs = new LocationRepoService();
//        hp.setLoc(loc);

//        hp.setLoc(lrs.getRepo().findById(source.get("locationId", Long.class)));
        return hp;
    }
}
