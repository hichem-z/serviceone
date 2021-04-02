package dz.hichsali.controller;


import dz.hichsali.model.SiteTouristique;
import dz.hichsali.sevice.SiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class SiteController {

    @Autowired
    @Qualifier(value = "siteService")
    SiteService ss;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/sites")
    public Collection<SiteTouristique> getAllSite(){
        logger.debug("get All Sites...........");
        return ss.getAllSite();

    }


}
