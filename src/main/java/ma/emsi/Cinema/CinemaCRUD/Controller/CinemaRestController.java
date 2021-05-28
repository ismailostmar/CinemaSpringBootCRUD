package ma.emsi.Cinema.CinemaCRUD.Controller;

import ma.emsi.Cinema.CinemaCRUD.Entites.Film;
import ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO.FilmRepository;
import ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CinemaRestController {
    @Autowired private FilmRepository filmRepository;
    @Autowired private TicketRepository ticketRepository;

}
