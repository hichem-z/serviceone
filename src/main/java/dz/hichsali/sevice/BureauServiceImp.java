package dz.hichsali.sevice;

import dz.hichsali.dao.BureauDao;
import dz.hichsali.model.Bureau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Service(value = "bureauService")
public class BureauServiceImp implements BureauService{

    @Autowired
    BureauDao bureauDao;

    @Override
    public Collection<Bureau> getBureaux() {

        return bureauDao.findAll();
    }
}
