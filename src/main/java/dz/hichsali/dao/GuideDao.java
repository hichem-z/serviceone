package dz.hichsali.dao;

import dz.hichsali.model.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideDao extends MongoRepository<Guide,String> {


}
