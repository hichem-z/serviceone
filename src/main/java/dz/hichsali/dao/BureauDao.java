package dz.hichsali.dao;

import dz.hichsali.model.Bureau;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BureauDao extends MongoRepository<Bureau,Integer> {


}
