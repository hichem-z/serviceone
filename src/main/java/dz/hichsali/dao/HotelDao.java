package dz.hichsali.dao;

import dz.hichsali.model.Hotel;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends MongoRepository<Hotel,String> {



}
