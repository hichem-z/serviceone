package dz.hichsali.sevice;


import dz.hichsali.dao.GuideDao;
import dz.hichsali.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("guideservice")
public class GuideServiceImp implements GuideService{

    @Autowired
    GuideDao gd;


    @Override
    public Guide addGuide(Guide guide) {
        return gd.insert(guide);
    }

    @Override
    public List<Guide> getGuides() {
        return gd.findAll();
    }
}
