package hotel.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Mar 9, 2022
 */
@Entity
public class HotelRoom 
{
	@Id
	@GeneratedValue
	private long id;
	private int roomNumber;
	private String roomType;
	private double price;
	private boolean booked;
	
	/**
	 * 
	 */
	public HotelRoom() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param roomNumber
	 * @param roomType
	 * @param price
	 * @param booked
	 */
	public HotelRoom(int roomNumber, String roomType, double price, boolean booked) 
	{
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.booked = booked;
	}

	/**
	 * @param id
	 * @param roomNumber
	 * @param roomType
	 * @param price
	 * @param booked
	 */
	public HotelRoom(long id, int roomNumber, String roomType, double price, boolean booked) 
	{
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.booked = booked;
	}

	/**
	 * @return the id
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() 
	{
		return roomNumber;
	}

	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType() 
	{
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) 
	{
		this.roomType = roomType;
	}

	/**
	 * @return the price
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}

	/**
	 * @return the booked
	 */
	public boolean isBooked() 
	{
		return booked;
	}

	/**
	 * @param booked the booked to set
	 */
	public void setBooked(boolean booked) 
	{
		this.booked = booked;
	}

	@Override
	public String toString() 
	{
		return "Hotel [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", price=" + price
				+ ", booked=" + booked + "]";
	}
}
