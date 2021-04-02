package dz.hichsali.controller;


import dz.hichsali.model.Guide;
import dz.hichsali.sevice.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guide")
public class GuideController {

    @Autowired
    @Qualifier(value = "guideservice")
    GuideService guideService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addGuide(@RequestBody Guide guide){
        System.out.println(guide.getEmail());
        guideService.addGuide(guide);
    }

    @GetMapping("/getGuides")
    public List<Guide> getGuides(){
        System.out.println(guideService.getGuides().get(0).getEmail()+" "+guideService.getGuides().get(0).getId());
        return guideService.getGuides();
    }
}
