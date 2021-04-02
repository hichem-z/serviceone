package dz.hichsali.dao;

import dz.hichsali.model.SiteTouristique;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SiteDao extends MongoRepository<SiteTouristique,Integer> {



}
