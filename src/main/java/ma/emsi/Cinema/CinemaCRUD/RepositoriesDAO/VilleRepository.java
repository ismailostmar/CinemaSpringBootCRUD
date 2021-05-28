package ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO;

import ma.emsi.Cinema.CinemaCRUD.Entites.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville,Long> {
}
