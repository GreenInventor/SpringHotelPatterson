package hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import hotel.beans.HotelRoom;
import hotel.controller.BeanConfiguration;
import hotel.repository.HotelRoomRepository;

@SpringBootApplication
public class SpringHotelPattersonApplication implements CommandLineRunner {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringHotelPattersonApplication.class, args);
	}

	@Autowired
	HotelRoomRepository repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Use existing bean
		HotelRoom r1 = appContext.getBean("hotelroom", HotelRoom.class);
		repo.save(r1);
		
		//create new beans
		HotelRoom r2 = new HotelRoom(102, "King", 89, true);
		repo.save(r2);
		
		HotelRoom r3 = new HotelRoom(103, "Twin", 39, false);
		repo.save(r3);
		
		//view database
		List<HotelRoom> allRooms = repo.findAll();
		for(HotelRoom room : allRooms)
		{
			System.out.println(room.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
