package ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO;

import ma.emsi.Cinema.CinemaCRUD.Entites.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
/*
* toute les methodes herité de JPA Repository sont
* accessible directement via une API Rest Generique
 */
@CrossOrigin("*")
public interface CinemaRepository extends JpaRepository<Cinema,Long> {

}
