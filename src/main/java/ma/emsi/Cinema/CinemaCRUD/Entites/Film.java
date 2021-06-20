package ma.emsi.Cinema.CinemaCRUD.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Categorie;
    private String description;
    @Column(length = 20)
    private String realisator;
    private String photo;
    private String titre;
    private double time;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections;
}
