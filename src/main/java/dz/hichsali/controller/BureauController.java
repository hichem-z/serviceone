package dz.hichsali.controller;


import dz.hichsali.model.Bureau;
import dz.hichsali.sevice.BureauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class BureauController {

    @Autowired
    @Qualifier(value = "bureauService")
    BureauService bureauService;


    @GetMapping("/bureaux")
    public Collection<Bureau> getBureauService() {
        return bureauService.getBureaux();
    }
}
