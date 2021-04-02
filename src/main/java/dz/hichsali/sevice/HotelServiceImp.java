package dz.hichsali.sevice;

import dz.hichsali.dao.HotelDao;
import dz.hichsali.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service("hotelService")
public class HotelServiceImp implements HotelService {

    @Autowired
    HotelDao hotelDao;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Collection<Hotel> getAllHotels() {
        Query query = new Query();
        query.fields().exclude("adresse","_id","telephone","image","description","map");
        return mongoTemplate.find(query,Hotel.class);
    }
    @Override
    public Hotel getHotel(String id) {
        Query query = new Query(Criteria.where("id_hotel").is(id));
//       query.fields().exclude("_id","id_hotel","nom","imageCover");
        return mongoTemplate.findOne(query,Hotel.class);
    }


}
