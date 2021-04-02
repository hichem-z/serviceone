package dz.hichsali.sevice;


import dz.hichsali.dao.HotelDao;
import dz.hichsali.dao.SiteDao;
import dz.hichsali.model.Hotel;
import dz.hichsali.model.SiteTouristique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service("siteService")
public class SiteServiceImp implements SiteService {

    @Autowired
    SiteDao sd;


    @Override
    public Collection<SiteTouristique> getAllSite() {
        return sd.findAll();
    }
}
