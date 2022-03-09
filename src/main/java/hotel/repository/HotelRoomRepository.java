package hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hotel.beans.HotelRoom;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Mar 9, 2022
 */
@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Long> 
{

}
