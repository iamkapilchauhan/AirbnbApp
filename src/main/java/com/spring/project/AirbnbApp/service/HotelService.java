package com.spring.project.AirbnbApp.service;

import com.spring.project.AirbnbApp.dto.HotelDto;
import com.spring.project.AirbnbApp.entity.Hotel;

public interface HotelService
{
    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
    HotelDto updateHotelById(Long id,HotelDto hotelDto);
}
