package dz.hichsali.dao;

import dz.hichsali.model.Banque;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BanqueDao extends MongoRepository<Banque,String> {

}
