package ma.emsi.Cinema.CinemaCRUD;

import ma.emsi.Cinema.CinemaCRUD.Services.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaCrudApplication implements CommandLineRunner {
	@Autowired
	private ICinemaInitService cinemaInitService;

	public static void main(String[] args) {
		SpringApplication.run(CinemaCrudApplication.class, args); }

	@Override
	public void run(String... args) throws Exception
	{
		cinemaInitService.initVilles();
		cinemaInitService.initCinema();
		cinemaInitService.initSalles();
		cinemaInitService.initPlaces();
		cinemaInitService.initSeances();
		cinemaInitService.initFilms();
		cinemaInitService.initProjections();
		cinemaInitService.initTickets();
	}
}
