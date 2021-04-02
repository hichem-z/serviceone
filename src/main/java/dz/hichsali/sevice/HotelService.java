package dz.hichsali.sevice;

import dz.hichsali.model.Hotel;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;


public interface HotelService {

    public Collection<Hotel> getAllHotels();
    public Hotel getHotel(String id);

}
