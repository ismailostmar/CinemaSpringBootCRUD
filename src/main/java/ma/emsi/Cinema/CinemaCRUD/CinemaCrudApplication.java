package ma.emsi.Cinema.CinemaCRUD;

import ma.emsi.Cinema.CinemaCRUD.Entites.Film;
import ma.emsi.Cinema.CinemaCRUD.Entites.Salle;
import ma.emsi.Cinema.CinemaCRUD.Services.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CinemaCrudApplication implements CommandLineRunner {
	@Autowired
	private ICinemaInitService cinemaInitService;

	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(CinemaCrudApplication.class, args); }

	@Override
	public void run(String... args) throws Exception
	{
		// A chaque fois je serialise un Film ou une Salle il va integré le ID de chaque des deux classes
		restConfiguration.exposeIdsFor(Film.class, Salle.class);
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
