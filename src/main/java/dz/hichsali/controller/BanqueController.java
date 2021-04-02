package dz.hichsali.controller;


import dz.hichsali.model.Banque;
import dz.hichsali.sevice.BanqueSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class BanqueController {

    @Autowired
    @Qualifier(value = "banqueService")
    BanqueSevice bs;

    @GetMapping("/banques")
    public Collection<Banque> getBanque(){
    return bs.getBanques();
}
}
