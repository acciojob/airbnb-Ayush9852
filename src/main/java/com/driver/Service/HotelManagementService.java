package com.driver.Service;


import com.driver.Repository.HotelManagementRepository;
import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelManagementService {

    HotelManagementRepository hotelManagementRepository=new HotelManagementRepository();


    public String addHotel(Hotel hotel) {


        return hotelManagementRepository.addHotel(hotel);
    }

    public Integer addUser(User user) {
        return hotelManagementRepository.addUser(user);
    }

    public String getHotelWithMostFacilities() {

        return hotelManagementRepository.getHotelWithMostFacilities();
    }

    public int bookRoom(Booking booking) {

        return hotelManagementRepository.bookRoom(booking);
    }

    public int getBookings(Integer aadharCard) {

        return hotelManagementRepository.getBookings(aadharCard);
    }

    public Hotel update(List<Facility> newFacilities, String hotelName) {

        return hotelManagementRepository.update(newFacilities,hotelName);
    }
}