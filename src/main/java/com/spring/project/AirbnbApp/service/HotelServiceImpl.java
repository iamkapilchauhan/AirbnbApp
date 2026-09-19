package com.spring.project.AirbnbApp.service;

import com.spring.project.AirbnbApp.dto.HotelDto;
import com.spring.project.AirbnbApp.entity.Hotel;
import com.spring.project.AirbnbApp.exception.ResourceNotFoundException;
import com.spring.project.AirbnbApp.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService
{
    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;
    @Override
    public HotelDto createNewHotel(HotelDto hotelDto) {
        log.info("Creating a new Hotel with name: {}",hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        hotel.setActive(false);
        hotel = hotelRepository.save(hotel);
        log.info("Created a new hotel with ID: {}",hotel.getId());
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id)
    {
        log.info("Getting the hotel with ID: {}", id);
        Hotel hotel = hotelRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
        return  modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public HotelDto updateHotelById(Long id, HotelDto hotelDto)
        {
            log.info("updating the hotel with ID: {}", id);
            Hotel hotel = hotelRepository
                    .findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
            modelMapper.map(hotelDto, hotel);
            hotel = hotelRepository.save(hotel);
            return modelMapper.map(hotel,HotelDto.class);
        }

}
