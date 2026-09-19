package com.spring.project.AirbnbApp.repository;

import com.spring.project.AirbnbApp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>
{

}
