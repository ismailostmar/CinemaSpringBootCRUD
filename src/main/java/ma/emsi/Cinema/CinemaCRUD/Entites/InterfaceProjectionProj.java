package ma.emsi.Cinema.CinemaCRUD.Entites;

import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name="p1",types={ma.emsi.Cinema.CinemaCRUD.Entites.Projection.class})
public interface InterfaceProjectionProj {
    public Long getId();
    public double getPrice();
    public Date getDateProjection();
    public Salle getSalle();
    public Film getFilm();
    public Seance getSeance();
    public Collection<Ticket> getTickets();
}
