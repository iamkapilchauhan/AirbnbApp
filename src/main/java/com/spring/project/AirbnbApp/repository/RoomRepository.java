package com.spring.project.AirbnbApp.repository;

import com.spring.project.AirbnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
