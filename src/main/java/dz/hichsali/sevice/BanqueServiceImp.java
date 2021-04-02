package dz.hichsali.sevice;

import dz.hichsali.dao.BanqueDao;
import dz.hichsali.model.Banque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Optional;

@Service("banqueService")

public class BanqueServiceImp implements BanqueSevice{

    @Autowired
    BanqueDao bd;

    @Override
    public Collection<Banque> getBanques() {

        return bd.findAll();
    }

    @Override
    public Banque getBanque(String id) {
        Optional<Banque> op = bd.findById(id);
        return op.get();
    }
}
