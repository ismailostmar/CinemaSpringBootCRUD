package ma.emsi.Cinema.CinemaCRUD.Controller;

import lombok.Data;
import ma.emsi.Cinema.CinemaCRUD.Entites.Film;
import ma.emsi.Cinema.CinemaCRUD.Entites.Ticket;
import ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO.FilmRepository;
import ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class CinemaRestController {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping(path = "/imageFilm/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    // Tableau de Byte pour les Images
    public byte[] image(@PathVariable(name = "id") Long id) throws Exception {
        Film f = filmRepository.findById(id).get();
        String photoName = f.getPhoto();
        File file = new File(System.getProperty("user.home") + "/cinema/images/" + photoName);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path); // retourne un tableaux d'octets
    }

    @Data
    static
    class TicketForm {
        private String nomClient;
        private int codePayement;
        private List<Long> tickets = new ArrayList<>();
    }

    @PostMapping("/payerTickets")
    @Transactional
    // les données de tickets sont envoyé au format JSON à l'aide de l'annotation RequestBody
    public List<Ticket> payerTickets(@RequestBody TicketForm ticketForm) {
        List<Ticket> listTickets = new ArrayList<>();
        ticketForm.getTickets().forEach(idTicket -> {
            System.out.println(idTicket);
            Ticket ticket = ticketRepository.findById(idTicket).get();
            ticket.setNomClient(ticketForm.getNomClient());
            ticket.setReserve(true);
            ticket.setCodePayment(ticketForm.getCodePayement());
            ticketRepository.save(ticket);
            listTickets.add(ticket);
        });
        return listTickets;
    }
}
