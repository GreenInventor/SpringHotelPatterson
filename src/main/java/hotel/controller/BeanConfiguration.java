package hotel.controller;

import org.springframework.context.annotation.Bean;

import hotel.beans.HotelRoom;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Mar 9, 2022
 */
public class BeanConfiguration 
{
	@Bean
	public HotelRoom hotelroom()
	{
		HotelRoom bean = new HotelRoom(101, "Queen", 59, false);
		return bean;
	}
}
