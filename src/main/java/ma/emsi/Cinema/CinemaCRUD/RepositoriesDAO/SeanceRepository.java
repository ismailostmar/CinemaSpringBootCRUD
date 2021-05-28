package ma.emsi.Cinema.CinemaCRUD.RepositoriesDAO;

import ma.emsi.Cinema.CinemaCRUD.Entites.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepository extends JpaRepository<Seance,Long> {

}

