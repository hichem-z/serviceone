package dz.hichsali.controller;

import dz.hichsali.model.Hotel;
import dz.hichsali.sevice.HotelService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class HotelController {


    @Autowired
    @Qualifier(value = "hotelService")
    HotelService hs;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hotels")
    public Collection<Hotel> getAll(){
        logger.debug("get All Hotels...........");
        return hs.getAllHotels();
    }

    @GetMapping("/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable(value = "id_hotel") String id){
        logger.debug("get Hotel...........");
        return hs.getHotel(id);
    }

}


