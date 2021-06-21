package ma.emsi.Cinema.CinemaCRUD.Entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String nomClient;
    private double price;
    @Column(unique = false , nullable = true)
    private int codePayment; //int = 0   Integer = null
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;

}
