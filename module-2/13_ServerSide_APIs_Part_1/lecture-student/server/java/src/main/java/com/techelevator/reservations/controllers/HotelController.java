package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    //list all reservations

    @RequestMapping( path= "/reservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations(){
        return reservationDAO.findAll();

    }

    //get reservation by id :)

    @RequestMapping( path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservationById(@PathVariable int id){
        return reservationDAO.get(id);
    }

    //get list of reservation by hotel
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationForHotel(@PathVariable int id){
        return reservationDAO.findByHotel(id);
    }
    //add new reservation
    @RequestMapping(path= "/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@PathVariable int id, @RequestBody Reservation reservation){
        return reservationDAO.create(reservation, id);
    }
    //filter id by city and state.. city optional

    @RequestMapping(path = "/filter", method = RequestMethod.GET)
    public List<Hotel> filterByCityAndState(@RequestParam String state, @RequestParam(required = false) String city){
        if(city!=null){
            return hotelDAO.filterByCity(city);
        }else {
            return hotelDAO.filterByState(state);
        }
    }
}
