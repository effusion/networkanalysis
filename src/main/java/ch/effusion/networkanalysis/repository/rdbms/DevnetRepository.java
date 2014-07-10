package ch.effusion.networkanalysis.repository.rdbms;

import ch.effusion.networkanalysis.domain.rdbms.Devnet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by heuby on 09/07/14.
 */
public interface DevnetRepository extends JpaRepository<Devnet, Long> {
}
