package ch.effusion.networkanalysis.repository.rdbms;

import ch.effusion.networkanalysis.domain.rdbms.Netta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by heuby on 09/07/14.
 */
public interface NettaRepository extends JpaRepository<Netta,Long> {
}
